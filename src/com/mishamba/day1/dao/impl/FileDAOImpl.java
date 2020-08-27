package com.mishamba.day1.dao.impl;

import com.mishamba.day1.dao.FileDAO;
import com.mishamba.day1.dao.exception.DAOException;
import com.mishamba.day1.model.Appliance;
import com.mishamba.day1.model.criteria.Criteria;
import com.mishamba.day1.util.definer.impl.ClassDefinerImpl;
import com.mishamba.day1.util.definer.impl.ParametersDefinerImpl;
import com.mishamba.day1.util.exception.UtilException;
import com.mishamba.day1.util.reader.impl.ApplianceReaderImpl;

import java.io.File;
import java.util.ArrayList;

public class FileDAOImpl implements FileDAO {
    private static final String DIRECTORY_PATH = "src/resources";
    private static final String FILE_NAME = "appliances.txt";
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
        File file = new File(DIRECTORY_PATH, FILE_NAME);
        ArrayList<Appliance> appliances = new ArrayList<>();
        try {
            ApplianceReaderImpl reader =
                    ApplianceReaderImpl.ApplianceReaderImplFactory.
                            createReader(file);
            while(reader.hasNewLine()) {
                String line = reader.readString();
                Class<?> applianceClass = ClassDefinerImpl.getInstance().
                        defineClass(criteria);
                ArrayList<Criteria> classCriteria = ParametersDefinerImpl.
                        getInstance().defineParameters(applianceClass);
                for (Criteria loopCriteria : classCriteria) {
                    String type = loopCriteria.getType();
                    
                    // TODO: 8/27/20 parse actions
                    // TODO: 8/27/20 add appliance creation and add it to appliances
                }
            }

            return appliances;
        } catch (UtilException exception) {
            throw new DAOException(exception.toString());
        }
    }
}
