package com.mishamba.day1.controller.impl;

import com.mishamba.day1.controller.Controller;
import com.mishamba.day1.controller.exception.ControllerException;
import com.mishamba.day1.model.Appliance;
import com.mishamba.day1.model.criteria.Criteria;
import com.mishamba.day1.service.exception.ServiceException;
import com.mishamba.day1.service.impl.FileServiceImpl;

import java.util.ArrayList;

public class ControllerImpl implements Controller {
    private ControllerImpl() {
    }

    public static class ControllerImplHolder {
        private ControllerImplHolder() {
        }

        private static final ControllerImpl HOLDER_INSTANCE = new ControllerImpl();
    }

    public static ControllerImpl getInstance() {
        return ControllerImplHolder.HOLDER_INSTANCE;
    }

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
