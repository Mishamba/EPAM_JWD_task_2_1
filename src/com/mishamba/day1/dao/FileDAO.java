package com.mishamba.day1.dao;

import com.mishamba.day1.dao.exception.DAOException;
import com.mishamba.day1.model.Entity;
import com.mishamba.day1.model.criteria.Criteria;

import java.util.ArrayList;

public interface FileDAO {
    ArrayList<Entity> findBy(Criteria criteria) throws DAOException;
}
