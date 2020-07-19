package com.lh.until;

import org.apache.ibatis.session.SqlSession;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class TransactionInvocationUntill implements InvocationHandler {
    private Object target;
    public TransactionInvocationUntill(Object target) {
        this.target = target;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        SqlSession sqlSession = SqlSessionUntil.getSqlSession();
        Object obj = method.invoke(target, args);
        try {
            sqlSession.commit();
        } catch(Exception e) {
            sqlSession.rollback();
            e.printStackTrace();
        } finally {
            SqlSessionUntil.closeSqlSession();
        }
        return obj;
    }

    public Object getProxy() {
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }
}
