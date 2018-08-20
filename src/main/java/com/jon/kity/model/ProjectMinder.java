package com.jon.kity.model;

import javax.xml.crypto.Data;

public class ProjectMinder {

    private String id;
    private String projectId;
    private String caseName;
    private String minderId;
    private String minder;
    private String creator;
    private Data createTime;
    private Data updateTime;

    public ProjectMinder() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getCaseName() {
        return caseName;
    }

    public void setCaseName(String caseName) {
        this.caseName = caseName;
    }

    public String getMinderId() {
        return minderId;
    }

    public void setMinderId(String minderId) {
        this.minderId = minderId;
    }

    public String getMinder() {
        return minder;
    }

    public void setMinder(String minder) {
        this.minder = minder;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
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
