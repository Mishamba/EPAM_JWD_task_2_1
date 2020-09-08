package com.mishamba.day1.controller.impl;

import com.mishamba.day1.controller.Controller;
import com.mishamba.day1.controller.exception.ControllerException;
import com.mishamba.day1.model.Appliance;
import com.mishamba.day1.model.criteria.Criteria;
import com.mishamba.day1.service.exception.ServiceException;
import com.mishamba.day1.service.impl.FileServiceImpl;
import org.apache.log4j.Logger;

import java.util.ArrayList;

public class ControllerImpl implements Controller {
    private static final Logger logger = Logger.getRootLogger();

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
            logger.error("got exception in Controller");
            throw new ControllerException(exception);
        }
    }
}
