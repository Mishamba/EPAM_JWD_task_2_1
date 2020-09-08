package com.mishamba.day1.util.reader.impl;

import com.mishamba.day1.model.criteria.Criteria;
import com.mishamba.day1.util.reader.ApplianceReader;
import com.mishamba.day1.util.exception.UtilException;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

import java.io.*;

public class ApplianceReaderImpl implements ApplianceReader {
    private static final String DIRECTORY_PATH = "/home/mishamba/java/EPAM_JWD_task_2_1/src/resources";
    private static final String FILE_NAME = "appliances_db.txt";
    private static final Logger logger = Logger.getRootLogger();
    private final BufferedReader bufferedReader;

    public static class ApplianceReaderImplFactory {
        private ApplianceReaderImplFactory() {
        }

        public static @NotNull ApplianceReaderImpl createReader()
                throws UtilException {
            return new ApplianceReaderImpl();
        }
    }

    private ApplianceReaderImpl() throws UtilException {
        try {
            this.bufferedReader = new BufferedReader(new FileReader(
                    new File(DIRECTORY_PATH, FILE_NAME)));
        } catch (FileNotFoundException exception) {
            throw new UtilException(exception.toString());
        }
    }

    public boolean hasNewLine() throws UtilException {
        try {
            bufferedReader.mark(1);
            String line = bufferedReader.readLine();
            bufferedReader.reset();
            return line != null;
        } catch (IOException exception) {
            logger.error("hash new line method");
            throw new UtilException(exception);
        }
    }

    @Override
    public String readString(@NotNull Criteria criteria) throws UtilException {
        logger.info("checking line with this criteria");
        try {
            String line = bufferedReader.readLine();
            logger.info("read this line" + "\n" + line);
            return (line.matches("(.*)" + criteria.name() + "(.*)")) ? line : null;
        } catch (IOException exception) {
            throw new UtilException("read string method",exception);
        }
    }
}
