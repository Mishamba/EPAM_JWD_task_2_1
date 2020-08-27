package com.mishamba.day1.util.definer;

import com.mishamba.day1.model.criteria.Criteria;

public interface ClassDefiner {
    Class<?> defineClass(Criteria criteria);
}
