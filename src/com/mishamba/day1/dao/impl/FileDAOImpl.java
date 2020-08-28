package com.mishamba.day1.dao.impl;

import com.mishamba.day1.dao.FileDAO;
import com.mishamba.day1.dao.exception.DAOException;
import com.mishamba.day1.model.Appliance;
import com.mishamba.day1.model.criteria.Criteria;
import com.mishamba.day1.util.factory.impl.ApplianceCreatorImpl;
import com.mishamba.day1.util.exception.UtilException;
import com.mishamba.day1.util.reader.impl.ApplianceReaderImpl;

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
    public ArrayList<Appliance> findBy(Criteria criteria) throws DAOException {
        ArrayList<Appliance> appliances = new ArrayList<>();
        try {
            ApplianceReaderImpl reader =
                    ApplianceReaderImpl.ApplianceReaderImplFactory.
                            createReader();
            while(reader.hasNewLine()) {
                String line = reader.readString();
                Appliance newAppliance = ApplianceCreatorImpl.getInstance().createAppliance(line);
                appliances.add(newAppliance);
            }

            return appliances;
        } catch (UtilException exception) {
            throw new DAOException(exception.toString());
        }
    }
}
