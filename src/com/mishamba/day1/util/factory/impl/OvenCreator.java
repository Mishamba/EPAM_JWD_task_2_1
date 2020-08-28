package com.mishamba.day1.util.factory.impl;

import com.mishamba.day1.model.Appliance;
import com.mishamba.day1.model.Oven;
import com.mishamba.day1.model.criteria.Criteria;
import com.mishamba.day1.util.exception.UtilException;
import com.mishamba.day1.util.factory.ApplianceCreator;
import com.mishamba.day1.util.matcher.impl.ClassCriteriaMatcherImpl;
import com.mishamba.day1.util.parser.impl.ValueParserImpl;

public class OvenCreator implements ApplianceCreator {
    @Override
    public Appliance createAppliance(String line) throws UtilException {
        ValueParserImpl parser = new ValueParserImpl();
        int powerConsumption = parser.parseInt(ClassCriteriaMatcherImpl.
                getInstance().matchParameterValue(line, Criteria.CAPACITY));
        int depth = parser.parseInt(ClassCriteriaMatcherImpl.getInstance().
                matchParameterValue(line, Criteria.DEPTH));
        int weight = parser.parseInt(ClassCriteriaMatcherImpl.getInstance().
                matchParameterValue(line, Criteria.WEIGHT));
        int capacity = parser.parseInt(ClassCriteriaMatcherImpl.getInstance().
                matchParameterValue(line, Criteria.CAPACITY));
        int height = parser.parseInt(ClassCriteriaMatcherImpl.getInstance().
                matchParameterValue(line, Criteria.HEIGHT));
        double width = parser.parseDouble(ClassCriteriaMatcherImpl.
                getInstance().matchParameterValue(line, Criteria.WIDTH));
        return new Oven(powerConsumption, weight, capacity, depth, height, width);
    }
}
