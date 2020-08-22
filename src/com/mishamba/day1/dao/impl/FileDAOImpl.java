package com.mishamba.day1.dao.impl;

import com.mishamba.day1.dao.FileDAO;
import com.mishamba.day1.dao.exception.DAOException;
import com.mishamba.day1.model.Appliance;

import java.util.ArrayList;

public class FileDAOImpl implements FileDAO {

    private static FileDAOImpl instance;

    private FileDAOImpl() {
    }

    public static FileDAOImpl getInstance() {
        if (instance == null) {
            instance = new FileDAOImpl();
        }

        return instance;
    }

    @Override
    public ArrayList<Appliance> findBy(String criteria) throws DAOException {
        return null;
    }
}
