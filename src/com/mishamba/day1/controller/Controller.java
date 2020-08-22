package com.mishamba.day1.controller;

import com.mishamba.day1.controller.exception.ControllerException;
import com.mishamba.day1.model.Appliance;

import java.util.ArrayList;

public interface Controller {
    ArrayList<Appliance> find(String criteria) throws ControllerException;
}
