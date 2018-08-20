package com.jon.kity.model;

import javax.xml.crypto.Data;

public class TestCase {

    private String uid;
    private String caseName;
    private String minder;
    private String creater;
    private Data createTime;
    private Data updateTime;

    public TestCase() {
    }

    public TestCase(String uid, String caseName, String minder, String creater, Data createTime, Data updateTime) {
        this.uid = uid;
        this.caseName = caseName;
        this.minder = minder;
        this.creater = creater;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public String getMinder() {
        return minder;
    }

    public void setMinder(String minder) {
        this.minder = minder;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getCaseName() {
        return caseName;
    }

    public void setCaseName(String caseName) {
        this.caseName = caseName;
    }

    public String getCreater() {
        return creater;
    }

    public void setCreater(String creater) {
        this.creater = creater;
    }

    public Data getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Data createTime) {
        this.createTime = createTime;
    }

    public Data getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Data updateTime) {
        this.updateTime = updateTime;
    }
}
