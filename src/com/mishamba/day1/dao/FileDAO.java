package com.mishamba.day1.dao;

import com.mishamba.day1.dao.exception.DAOException;
import com.mishamba.day1.model.Appliance;
import com.mishamba.day1.model.criteria.Criteria;

import java.util.ArrayList;

public interface FileDAO {
    ArrayList<Appliance> findBy(Criteria criteria) throws DAOException;
}
