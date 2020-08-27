package com.mishamba.day1.util.definer.impl;

import com.mishamba.day1.model.*;
import com.mishamba.day1.model.criteria.Criteria;
import com.mishamba.day1.util.definer.ParametersDefiner;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ParametersDefinerImpl implements ParametersDefiner {
    private static ParametersDefinerImpl instance;

    public static ParametersDefinerImpl getInstance() {
        if (instance == null) {
            instance = new ParametersDefinerImpl();
        }

        return instance;
    }

    private ParametersDefinerImpl() {
    }

    private static final ArrayList<Criteria> laptopParameters;
    static {
        laptopParameters = new ArrayList<>();
        addComputerParameters(laptopParameters);
        laptopParameters.add(Criteria.OS);
        laptopParameters.add(Criteria.SYSTEM_MEMORY);
        laptopParameters.add(Criteria.CPU);
    }

    private static final ArrayList<Criteria> ovenParameters;
    static {
        ovenParameters = new ArrayList<>();
        addHeightWeightWidthParameters(ovenParameters);
        ovenParameters.add(Criteria.CAPACITY);
        ovenParameters.add(Criteria.DEPTH);
    }

    private static final ArrayList<Criteria> refrigeratorParameters;
    static {
        refrigeratorParameters = new ArrayList<>();
        addHeightWeightWidthParameters(refrigeratorParameters);
        refrigeratorParameters.add(Criteria.FREEZER_CAPACITY);
        refrigeratorParameters.add(Criteria.OVERALL_CAPACITY);
    }

    private static final ArrayList<Criteria> speakersParameters;
    static {
        speakersParameters = new ArrayList<>();
        speakersParameters.add(Criteria.POWER_CONSUMPTION);
        speakersParameters.add(Criteria.NUMBER_OF_SPEAKERS);
        speakersParameters.add(Criteria.FREQUENCY_RANGE);
        speakersParameters.add(Criteria.CORD_LENGTH);
    }

    private static final ArrayList<Criteria> tabletPCParameters;
    static {
        tabletPCParameters = new ArrayList<>();
        addComputerParameters(tabletPCParameters);
        tabletPCParameters.add(Criteria.FLASH_MEMORY_CAPACITY);
        tabletPCParameters.add(Criteria.COLOR);
    }

    private static final ArrayList<Criteria> vacuumCleanerParameters;
    static {
        vacuumCleanerParameters = new ArrayList<>();
        vacuumCleanerParameters.add(Criteria.POWER_CONSUMPTION);
        vacuumCleanerParameters.add(Criteria.FILTER_TYPE);
        vacuumCleanerParameters.add(Criteria.BAG_TYPE);
        vacuumCleanerParameters.add(Criteria.WAND_TYPE);
        vacuumCleanerParameters.add(Criteria.MOTOR_SPEED_REGULATION);
        vacuumCleanerParameters.add(Criteria.CLEANING_WIDTH);
    }

    private static Map<Class<?>, ArrayList<Criteria>> classParametersMap;
    static {
        classParametersMap = new HashMap<>();
        classParametersMap.put(Laptop.class, laptopParameters);
        classParametersMap.put(Oven.class, ovenParameters);
        classParametersMap.put(Refrigerator.class, refrigeratorParameters);
        classParametersMap.put(Speakers.class, speakersParameters);
        classParametersMap.put(TabletPC.class, tabletPCParameters);
        classParametersMap.put(VacuumCleaner.class, vacuumCleanerParameters);
    }

    private static void addComputerParameters(@NotNull ArrayList<Criteria> parameters) {
        parameters.add(Criteria.BATTERY_CAPACITY);
        parameters.add(Criteria.MEMORY_ROM);
        parameters.add(Criteria.DISPLAY_INCHES);
    }

    private static void addHeightWeightWidthParameters(@NotNull ArrayList<Criteria> parameters) {
        parameters.add(Criteria.HEIGHT);
        parameters.add(Criteria.WEIGHT);
        parameters.add(Criteria.WIDTH);
    }

    @Override
    public ArrayList<Criteria> defineParameters(Class<?> thatClass) {
        return classParametersMap.get(thatClass);
    }
}
