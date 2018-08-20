package com.jon.kity.dao;

import com.jon.kity.model.TestCase;
import org.apache.ibatis.annotations.Param;

public interface TestCaseDao {
    public int insertCase(@Param("testCase") TestCase testCase);
}
