package com.jon.kity.controller;

import com.jon.kity.model.Resp;
import com.jon.kity.model.TestCase;
import com.jon.kity.service.TestCaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/testCase")
public class TestCaseController {

    @Autowired
    private TestCaseService testCaseService;

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public Resp insertCase(@RequestBody TestCase testCase) {
        testCaseService.insertCase(testCase);
        return new Resp("1", "2", testCase);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Resp selectCase(@PathVariable int id) {
        testCaseService.selectCase(id);
        return new Resp("0000", "success", 1);
    }
}
