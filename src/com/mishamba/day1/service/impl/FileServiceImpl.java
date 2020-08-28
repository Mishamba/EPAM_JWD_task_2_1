package com.mishamba.day1.service.impl;

import com.mishamba.day1.dao.exception.DAOException;
import com.mishamba.day1.dao.impl.FileDAOImpl;
import com.mishamba.day1.model.Appliance;
import com.mishamba.day1.model.criteria.Criteria;
import com.mishamba.day1.service.FileService;
import com.mishamba.day1.service.exception.ServiceException;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class FileServiceImpl implements FileService {

    private static FileServiceImpl instance;

    private FileServiceImpl() {
    }

    public static FileServiceImpl getInstance() {
        if (instance == null) {
            instance = new FileServiceImpl();
        }

        return instance;
    }

    @Override
    public ArrayList<Appliance> findBy(@NotNull Criteria criteria) throws ServiceException {
        FileDAOImpl dao = FileDAOImpl.getInstance();
        try {
            return dao.findBy(criteria);
        } catch (DAOException exception) {
            throw new ServiceException(exception);
        }
    }
}
