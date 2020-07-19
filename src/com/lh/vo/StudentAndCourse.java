package com.lh.vo;

import com.lh.domain.Course;
import com.lh.domain.Student;

public class StudentAndCourse {
    private String courid;
    private String cname;

    private String stuid;
    private String sname;

    public StudentAndCourse() {
    }

    public StudentAndCourse(String courid, String cname, String stuid, String sname) {
        this.courid = courid;
        this.cname = cname;
        this.stuid = stuid;
        this.sname = sname;
    }

    public String getCourid() {
        return courid;
    }

    public void setCourid(String courid) {
        this.courid = courid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getStuid() {
        return stuid;
    }

    public void setStuid(String stuid) {
        this.stuid = stuid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    @Override
    public String toString() {
        return "StudentAndCourse{" +
                "courid='" + courid + '\'' +
                ", cname='" + cname + '\'' +
                ", stuid='" + stuid + '\'' +
                ", sname='" + sname + '\'' +
                '}';
    }
}
