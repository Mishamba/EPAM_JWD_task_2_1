package com.mishamba.day1.dao.impl;

import com.mishamba.day1.dao.FileDAO;
import com.mishamba.day1.dao.exception.DAOException;
import com.mishamba.day1.model.Appliance;
import com.mishamba.day1.model.criteria.Criteria;
import com.mishamba.day1.util.definer.ParametersDefiner;
import com.mishamba.day1.util.definer.impl.ClassDefinerImpl;
import com.mishamba.day1.util.definer.impl.ParametersDefinerImpl;
import com.mishamba.day1.util.exception.UtilException;
import com.mishamba.day1.util.reader.impl.ApplianceReaderImpl;

import java.io.File;
import java.util.ArrayList;

public class FileDAOImpl implements FileDAO {
    private static final String directoryPath = "src/resources";
    private static final String fileName = "appliances.txt";
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
        File file = new File(directoryPath, fileName);
        ArrayList<Appliance> appliances = new ArrayList<>();
        try {
            ApplianceReaderImpl reader =
                    ApplianceReaderImpl.ApplianceReaderImplFactory.
                            createReader(file);
            // TODO: 8/27/20 add loop
            String line = reader.readString();
            // TODO: 8/27/20 read from string actions
            Class<?> applianceClass = ClassDefinerImpl.getInstance().
                    defineClass(criteria);
            ArrayList<Criteria> classCriteria = ParametersDefinerImpl.
                    getInstance().defineParameters(applianceClass);
            for (Criteria loopCriteria : classCriteria) {
                String type = loopCriteria.getType();
                // TODO: 8/27/20 parse actions
                // TODO: 8/27/20 add appliance creation and add it to appliances
            }
        } catch (UtilException exception) {
            throw new DAOException(exception.toString());
        }
    }
}
