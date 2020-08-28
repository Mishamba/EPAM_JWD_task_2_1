package com.mishamba.day1.util.factory.impl;

import com.mishamba.day1.model.Appliance;
import com.mishamba.day1.model.VacuumCleaner;
import com.mishamba.day1.model.configuration.FilterType;
import com.mishamba.day1.model.criteria.Criteria;
import com.mishamba.day1.util.exception.UtilException;
import com.mishamba.day1.util.factory.ApplianceCreator;
import com.mishamba.day1.util.matcher.impl.ClassCriteriaMatcherImpl;
import com.mishamba.day1.util.parser.impl.ValueParserImpl;

public class VacuumCleanerCreator implements ApplianceCreator {
    @Override
    public Appliance createAppliance(String line) throws UtilException {
        ValueParserImpl parser = new ValueParserImpl();
        FilterType filterType = parser.parseFilterType(
                ClassCriteriaMatcherImpl.getInstance().matchParameterValue(
                        line, Criteria.FILTER_TYPE));
        String bagType = ClassCriteriaMatcherImpl.getInstance().
                matchParameterValue(line, Criteria.BAG_TYPE);
        String wandType = ClassCriteriaMatcherImpl.getInstance().
                matchParameterValue(line, Criteria.WAND_TYPE);
        int motorSpeedRegulation = parser.parseInt(ClassCriteriaMatcherImpl.
                getInstance().matchParameterValue(line,
                Criteria.MOTOR_SPEED_REGULATION));
        int cleaningWidth = parser.parseInt(ClassCriteriaMatcherImpl.
                getInstance().matchParameterValue(line, Criteria.CLEANING_WIDTH));
        int powerConsumption = parser.parseInt(ClassCriteriaMatcherImpl.
                getInstance().matchParameterValue(line, Criteria.POWER_CONSUMPTION));
        return new VacuumCleaner(powerConsumption, filterType, bagType,
                wandType, motorSpeedRegulation, cleaningWidth);
    }
}
