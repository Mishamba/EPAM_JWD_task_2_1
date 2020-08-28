package com.mishamba.day1.util.factory.impl;

import com.mishamba.day1.model.Appliance;
import com.mishamba.day1.model.Speakers;
import com.mishamba.day1.model.criteria.Criteria;
import com.mishamba.day1.util.exception.UtilException;
import com.mishamba.day1.util.factory.ApplianceCreator;
import com.mishamba.day1.util.matcher.impl.ClassCriteriaMatcherImpl;
import com.mishamba.day1.util.parser.impl.ValueParserImpl;

public class SpeakersCreator implements ApplianceCreator {
    @Override
    public Appliance createAppliance(String line) throws UtilException {
        ValueParserImpl parser = new ValueParserImpl();
        int powerConsumption = parser.parseInt(ClassCriteriaMatcherImpl.
                getInstance().matchParameterValue(line, Criteria.POWER_CONSUMPTION));
        int numberOfSpeakers = parser.parseInt(ClassCriteriaMatcherImpl.
                getInstance().matchParameterValue(line, Criteria.NUMBER_OF_SPEAKERS));
        int frequencyRange = parser.parseInt(ClassCriteriaMatcherImpl.
                getInstance().matchParameterValue(line, Criteria.FREQUENCY_RANGE));
        int cordLength = parser.parseInt(ClassCriteriaMatcherImpl.
                getInstance().matchParameterValue(line, Criteria.CORD_LENGTH));
        return new Speakers(powerConsumption, numberOfSpeakers,
                frequencyRange, cordLength);
    }
}
