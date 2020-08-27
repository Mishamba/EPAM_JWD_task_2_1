package com.mishamba.day1.util.definer;

import com.mishamba.day1.model.criteria.Criteria;

import java.util.ArrayList;

public interface ParametersDefiner {
    ArrayList<Criteria> defineParameters(Class<?> thatClass);
}
