package com.mishamba.day1.util.factory.impl;

import com.mishamba.day1.model.Appliance;
import com.mishamba.day1.util.factory.ApplianceCreator;
import com.mishamba.day1.util.exception.UtilException;
import com.mishamba.day1.util.factory.ApplianceProvider;
import com.mishamba.day1.util.matcher.impl.ClassCriteriaMatcherImpl;

public class ApplianceCreatorImpl implements ApplianceCreator {
    private final ApplianceProvider provider = new ApplianceProvider();
    private static ApplianceCreatorImpl instance;

    private ApplianceCreatorImpl() {
    }

    public static ApplianceCreatorImpl getInstance() {
        if (instance == null) {
            instance = new ApplianceCreatorImpl();
        }

        return instance;
    }

    @Override
    public Appliance createAppliance(String line) throws UtilException {
        ApplianceCreator creator = provider.defineCreator(
                ClassCriteriaMatcherImpl.getInstance().matchClassName(line).
                        toUpperCase());
        return creator.createAppliance(line);
    }
}
