package com.mishamba.day1.service;

import com.mishamba.day1.model.Appliance;
import com.mishamba.day1.model.criteria.Criteria;
import com.mishamba.day1.service.exception.ServiceException;

import java.util.ArrayList;

public interface FileService {
    ArrayList<Appliance> findBy(Criteria criteria) throws ServiceException;
}
