package com.mishamba.day1.dao.impl;

import com.mishamba.day1.dao.FileDAO;
import com.mishamba.day1.dao.exception.DAOException;
import com.mishamba.day1.model.Entity;
import com.mishamba.day1.model.criteria.Criteria;

import java.util.ArrayList;

public class FileDAOImpl implements FileDAO {

    private FileDAOImpl instance;

    private FileDAOImpl() {
    }

    public FileDAOImpl getInstance() {
        if (instance == null) {
            instance = new FileDAOImpl();
        }

        return instance;
    }

    @Override
    public ArrayList<Entity> findBy(Criteria criteria) throws DAOException {
        
    }
}
