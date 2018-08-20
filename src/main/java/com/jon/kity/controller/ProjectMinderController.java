package com.jon.kity.controller;

import com.jon.kity.model.Resp;
import com.jon.kity.model.ProjectMinder;
import com.jon.kity.service.ProjectMinderService;
import com.jon.kity.utils.Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/projectMinder")
public class ProjectMinderController {

    @Autowired
    private ProjectMinderService projectMinderService;

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public Resp insertMinder(@RequestBody ProjectMinder projectMinder) {
        projectMinder.setId(Utils.UUID());
        projectMinderService.insertMinder(projectMinder);
        return new Resp("1", "2", projectMinder);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Resp selectMinder(@PathVariable int id) {
        projectMinderService.selectCase(id);
        return new Resp("0000", "success", 1);
    }
}
