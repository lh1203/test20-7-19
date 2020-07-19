package com.lh.until;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class SqlSessionUntil {
    private static SqlSessionFactory factory = null;
    private SqlSessionUntil(){}
    static {
        try {
            InputStream in = Resources.getResourceAsStream("mybatis-config.xml");
            factory = new SqlSessionFactoryBuilder().build(in);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static ThreadLocal<SqlSession> t = new ThreadLocal<>();

    public static SqlSession getSqlSession() {
        SqlSession sqlSession = t.get();
        if (sqlSession == null) {
            sqlSession = factory.openSession();
            t.set(sqlSession);
        }
        return sqlSession;
    }

    public static void closeSqlSession(){
        SqlSession sqlSession = t.get();
        if (sqlSession != null) {
            sqlSession.close();
            t.remove();
        }
    }
}
