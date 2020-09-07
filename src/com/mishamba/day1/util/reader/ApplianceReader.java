package com.mishamba.day1.util.reader;

import com.mishamba.day1.model.criteria.Criteria;
import com.mishamba.day1.util.exception.UtilException;

public interface ApplianceReader {
    String readString(Criteria criteria) throws UtilException;
}
