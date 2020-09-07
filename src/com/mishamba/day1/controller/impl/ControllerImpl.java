package com.mishamba.day1.controller.impl;

import com.mishamba.day1.controller.Controller;
import com.mishamba.day1.controller.exception.ControllerException;
import com.mishamba.day1.model.Appliance;
import com.mishamba.day1.model.criteria.Criteria;
import com.mishamba.day1.service.exception.ServiceException;
import com.mishamba.day1.service.impl.FileServiceImpl;

import java.util.ArrayList;

public class ControllerImpl implements Controller {

    @Override
    public ArrayList<Appliance> find(String stringCriteria) throws ControllerException {
        try {
            Criteria criteria = Criteria.valueOf(stringCriteria);
            return FileServiceImpl.getInstance().findBy(criteria);
        } catch (IllegalArgumentException | ServiceException exception) {
            throw new ControllerException(exception);
        }
    }
}
