package com.jon.kity.service;

import com.jon.kity.model.TestCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestCaseService {
    @Autowired
    private MongoService mongoService;

    public void selectCase(Integer id){
        mongoService.getDocument();
    }

    public void insertCase(TestCase testCase){
        mongoService.insertDocument("kityminder",testCase.getMinder());
    }
}
