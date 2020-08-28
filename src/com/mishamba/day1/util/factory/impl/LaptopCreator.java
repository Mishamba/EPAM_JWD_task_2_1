package com.mishamba.day1.util.factory.impl;

import com.mishamba.day1.model.Appliance;
import com.mishamba.day1.model.Laptop;
import com.mishamba.day1.model.configuration.OS;
import com.mishamba.day1.model.criteria.Criteria;
import com.mishamba.day1.util.exception.UtilException;
import com.mishamba.day1.util.factory.ApplianceCreator;
import com.mishamba.day1.util.matcher.impl.ClassCriteriaMatcherImpl;
import com.mishamba.day1.util.parser.impl.ValueParserImpl;

public class LaptopCreator implements ApplianceCreator {
    @Override
    public Appliance createAppliance(String line) throws UtilException {
        ValueParserImpl parser = new ValueParserImpl();
        OS os = parser.parseOS(ClassCriteriaMatcherImpl.getInstance().
                matchParameterValue(line, Criteria.OS));
        int systemMemory = parser.parseInt(ClassCriteriaMatcherImpl.
                getInstance().matchParameterValue(line,Criteria.SYSTEM_MEMORY));
        float cpu = parser.parseFloat(ClassCriteriaMatcherImpl.getInstance().
                matchParameterValue(line, Criteria.CPU));
        int batteryCapacity = parser.parseInt(ClassCriteriaMatcherImpl.
                getInstance().matchParameterValue(line, Criteria.BATTERY_CAPACITY));
        int memoryRom = parser.parseInt(ClassCriteriaMatcherImpl.getInstance()
                .matchParameterValue(line, Criteria.MEMORY_ROM));
        int displayInches = parser.parseInt(ClassCriteriaMatcherImpl.
                getInstance().matchParameterValue(line, Criteria.DISPLAY_INCHES));
        return new Laptop(batteryCapacity, os, memoryRom, systemMemory, cpu,
                displayInches);
    }
}
