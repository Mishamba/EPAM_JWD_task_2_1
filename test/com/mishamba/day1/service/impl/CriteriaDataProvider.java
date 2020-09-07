package com.mishamba.day1.service.impl;

import com.mishamba.day1.model.*;
import com.mishamba.day1.model.configuration.FilterType;
import com.mishamba.day1.model.configuration.FrequencyRange;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.testng.annotations.DataProvider;

import java.util.ArrayList;

public class CriteriaDataProvider {
    @Contract(" -> new")
    @DataProvider(name = "criteria provider")
    public static Object[] @NotNull [] provideData() {
        ArrayList<Appliance> powerConsumptionAppliances = new ArrayList<>();
        powerConsumptionAppliances.add(new Oven(1000, 10, 32, 60, 45.5, 59.5));
        powerConsumptionAppliances.add(new Oven(1500, 12, 33, 60, 45, 68));
        powerConsumptionAppliances.add(new Oven(2000, 11, 33, 60, 40, 70));
        powerConsumptionAppliances.add(new Refrigerator(100, 20, 10, 300,
                200, 70));
        powerConsumptionAppliances.add(new Refrigerator(200, 30, 15, 300,
                180, 80));
        powerConsumptionAppliances.add(new Refrigerator(150, 35, 20, 350.5,
                250, 75));
        powerConsumptionAppliances.add(new VacuumCleaner(100, FilterType.A,
                "A2", "all-in-one", 3000, 20));
        powerConsumptionAppliances.add(new VacuumCleaner(110, FilterType.B,
                "AA-89","all-in-one", 2950, 30));
        powerConsumptionAppliances.add(new VacuumCleaner(90, FilterType.C,
                "XX00", "all-in-one", 2950, 30));
        powerConsumptionAppliances.add(new Speakers(15, 2,
                new FrequencyRange(2, 4), 2));
        powerConsumptionAppliances.add(new Speakers(20, 3,
                new FrequencyRange(3, 4), 3));
        powerConsumptionAppliances.add(new Speakers(17, 4,
                new FrequencyRange(2,  3.5), 4));
        return new Object[][]{
                {"POWER_CONSUMPTION", powerConsumptionAppliances}
        };
    }
}
