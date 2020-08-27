package com.mishamba.day1.util.matcher;

import com.mishamba.day1.model.criteria.Criteria;
import com.mishamba.day1.util.exception.UtilException;

public interface ClassCriteriaMatcher {
    String matchClassName(String line) throws UtilException;
    String matchParameterValue(String line, Criteria criteria) throws UtilException;
}
