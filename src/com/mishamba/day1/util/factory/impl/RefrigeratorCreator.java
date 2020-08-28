package com.mishamba.day1.util.factory.impl;

import com.mishamba.day1.model.Appliance;
import com.mishamba.day1.model.Refrigerator;
import com.mishamba.day1.model.criteria.Criteria;
import com.mishamba.day1.util.exception.UtilException;
import com.mishamba.day1.util.factory.ApplianceCreator;
import com.mishamba.day1.util.matcher.impl.ClassCriteriaMatcherImpl;
import com.mishamba.day1.util.parser.impl.ValueParserImpl;

public class RefrigeratorCreator implements ApplianceCreator {
    @Override
    public Appliance createAppliance(String line) throws UtilException {
        ValueParserImpl parser = new ValueParserImpl();
        int powerConsumption = parser.parseInt(ClassCriteriaMatcherImpl.
                getInstance().matchParameterValue(line, Criteria.POWER_CONSUMPTION));
        int weight = parser.parseInt(ClassCriteriaMatcherImpl.getInstance().
                matchParameterValue(line, Criteria.WEIGHT));
        int freezerCapacity = parser.parseInt(ClassCriteriaMatcherImpl.
                getInstance().matchParameterValue(line, Criteria.FREEZER_CAPACITY));
        int overallCapacity = parser.parseInt(ClassCriteriaMatcherImpl.
                getInstance().matchParameterValue(line, Criteria.OVERALL_CAPACITY));
        int height = parser.parseInt(ClassCriteriaMatcherImpl.getInstance().
                matchParameterValue(line, Criteria.HEIGHT));
        int width = parser.parseInt(ClassCriteriaMatcherImpl.getInstance().
                matchParameterValue(line, Criteria.WIDTH));
        return new Refrigerator(powerConsumption, weight, freezerCapacity,
                overallCapacity, height, width);
    }
}
