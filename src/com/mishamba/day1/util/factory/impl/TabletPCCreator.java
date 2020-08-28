package com.mishamba.day1.util.factory.impl;

import com.mishamba.day1.model.Appliance;
import com.mishamba.day1.model.TabletPC;
import com.mishamba.day1.model.configuration.TablePCColor;
import com.mishamba.day1.model.criteria.Criteria;
import com.mishamba.day1.util.exception.UtilException;
import com.mishamba.day1.util.factory.ApplianceCreator;
import com.mishamba.day1.util.matcher.impl.ClassCriteriaMatcherImpl;
import com.mishamba.day1.util.parser.impl.ValueParserImpl;

public class TabletPCCreator implements ApplianceCreator {
    @Override
    public Appliance createAppliance(String line) throws UtilException {
        ValueParserImpl parser = new ValueParserImpl();
        int batteryCapacity = parser.parseInt(ClassCriteriaMatcherImpl.
                getInstance().matchParameterValue(line, Criteria.BATTERY_CAPACITY));
        int displayInches = parser.parseInt(ClassCriteriaMatcherImpl.
                getInstance().matchParameterValue(line, Criteria.DISPLAY_INCHES));
        int memoryRom = parser.parseInt(ClassCriteriaMatcherImpl.getInstance().
                matchParameterValue(line, Criteria.MEMORY_ROM));
        int flashMemoryCapacity = parser.parseInt(ClassCriteriaMatcherImpl.
                getInstance().matchParameterValue(line, Criteria.FLASH_MEMORY_CAPACITY));
        TablePCColor color = parser.parseColor(ClassCriteriaMatcherImpl.
                getInstance().matchParameterValue(line, Criteria.COLOR));
        return new TabletPC(batteryCapacity, displayInches, memoryRom,
                flashMemoryCapacity, color);
    }
}
