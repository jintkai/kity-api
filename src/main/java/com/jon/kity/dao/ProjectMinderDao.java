package com.jon.kity.dao;

import com.jon.kity.model.ProjectMinder;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ProjectMinderDao {
    public int insertProjectMinder(ProjectMinder projectMinder);
}
