package com.mishamba.day1.service.impl;

import com.mishamba.day1.controller.Controller;
import com.mishamba.day1.controller.exception.ControllerException;
import com.mishamba.day1.controller.impl.ControllerImpl;
import com.mishamba.day1.model.Appliance;
import org.testng.annotations.Test;

import java.util.ArrayList;

import static org.testng.Assert.*;

public class ControllerImplTest {

    @Test(dataProvider = "criteria provider", dataProviderClass = CriteriaDataProvider.class)
    public void testFind(String stringCriteria, ArrayList<Appliance> expectedAppliances) {
        try {
            ArrayList<Appliance> appliances = ControllerImpl.getInstance().find(stringCriteria);
            assertEquals(expectedAppliances, appliances);
        } catch (ControllerException exception) {
            fail(exception.toString());
        }
    }
}