package com.jon.kity.service;

import com.jon.kity.dao.ProjectMinderDao;
import com.jon.kity.model.ProjectMinder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectMinderService {
    @Autowired
    private MongoService mongoService;

    @Autowired
    private ProjectMinderDao projectMinderDao;

    public void selectCase(Integer id){
        mongoService.getDocument();
    }

    public void insertMinder(ProjectMinder projectMinder){

        projectMinderDao.insertProjectMinder(projectMinder);

        mongoService.insertDocument("kityminder", projectMinder.getMinder());
    }
}
