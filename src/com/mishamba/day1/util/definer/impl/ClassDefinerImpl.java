package com.mishamba.day1.util.definer.impl;

import com.mishamba.day1.model.*;
import com.mishamba.day1.model.criteria.Criteria;
import com.mishamba.day1.util.definer.ClassDefiner;

import java.util.EnumMap;
import java.util.Map;

public class ClassDefinerImpl implements ClassDefiner {
    private static final Map<Criteria, Class<?>> criteriaClassMap;
    private static ClassDefinerImpl instance;

    private ClassDefinerImpl() {
    }

    public static ClassDefinerImpl getInstance() {
        if (instance == null) {
            instance = new ClassDefinerImpl();
        }

        return instance;
    }

    static {
        criteriaClassMap = new EnumMap<>(Criteria.class);
        criteriaClassMap.put(Criteria.POWER_CONSUMPTION, Consumer.class);
        criteriaClassMap.put(Criteria.WEIGHT, HouseholdAppliance.class);
        criteriaClassMap.put(Criteria.CAPACITY, Oven.class);
        criteriaClassMap.put(Criteria.DEPTH, Oven.class);
        criteriaClassMap.put(Criteria.HEIGHT, HouseholdAppliance.class);
        criteriaClassMap.put(Criteria.WIDTH, HouseholdAppliance.class);
        criteriaClassMap.put(Criteria.BATTERY_CAPACITY, Computer.class);
        criteriaClassMap.put(Criteria.OS, Laptop.class);
        criteriaClassMap.put(Criteria.MEMORY_ROM, Computer.class);
        criteriaClassMap.put(Criteria.SYSTEM_MEMORY, Laptop.class);
        criteriaClassMap.put(Criteria.CPU, Laptop.class);
        criteriaClassMap.put(Criteria.DISPLAY_INCHES, Computer.class);
        criteriaClassMap.put(Criteria.FREEZER_CAPACITY, Refrigerator.class);
        criteriaClassMap.put(Criteria.OVERALL_CAPACITY, Refrigerator.class);
        criteriaClassMap.put(Criteria.FILTER_TYPE, VacuumCleaner.class);
        criteriaClassMap.put(Criteria.BAG_TYPE, VacuumCleaner.class);
        criteriaClassMap.put(Criteria.WAND_TYPE, VacuumCleaner.class);
        criteriaClassMap.put(Criteria.MOTOR_SPEED_REGULATION, VacuumCleaner.class);
        criteriaClassMap.put(Criteria.CLEANING_WIDTH, VacuumCleaner.class);
        criteriaClassMap.put(Criteria.FLASH_MEMORY_CAPACITY, TabletPC.class);
        criteriaClassMap.put(Criteria.COLOR, TabletPC.class);
        criteriaClassMap.put(Criteria.NUMBER_OF_SPEAKERS, Speakers.class);
        criteriaClassMap.put(Criteria.FREQUENCY_RANGE, Speakers.class);
        criteriaClassMap.put(Criteria.CORD_LENGTH, Speakers.class);
    }

    @Override
    public Class<?> defineClass(Criteria criteria) {
        return criteriaClassMap.get(criteria);
    }
}
