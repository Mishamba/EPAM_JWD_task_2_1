package com.mishamba.day1.dao;

import com.mishamba.day1.dao.exception.DAOException;
import com.mishamba.day1.model.Appliance;

import java.util.ArrayList;

public interface FileDAO {
    ArrayList<Appliance> findBy(String criteria) throws DAOException;
}
