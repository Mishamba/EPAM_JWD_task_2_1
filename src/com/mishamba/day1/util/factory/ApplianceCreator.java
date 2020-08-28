package com.mishamba.day1.util.factory;

import com.mishamba.day1.model.Appliance;
import com.mishamba.day1.util.exception.UtilException;

public interface ApplianceCreator {
    Appliance createAppliance(String line) throws UtilException;
}
