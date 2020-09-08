package com.mishamba.day1.util.parser.impl;

import com.mishamba.day1.model.configuration.FilterType;
import com.mishamba.day1.model.configuration.OS;
import com.mishamba.day1.model.configuration.TablePCColor;
import com.mishamba.day1.util.exception.UtilException;
import com.mishamba.day1.util.parser.ValueParser;
import org.apache.log4j.Logger;

public class ValueParserImpl implements ValueParser {
    private static final Logger logger = Logger.getRootLogger();

    @Override
    public int parseInt(String string) throws UtilException {
        try {
            return Integer.parseInt(string);
        } catch (NumberFormatException exception) {
            logger.error("parse Int method");
            throw new UtilException(exception.toString());
        }
    }

    @Override
    public float parseFloat(String string) throws UtilException {
        try {
            return Float.parseFloat(string);
        } catch (NumberFormatException exception) {
            logger.error("parse Float method");
            throw new UtilException(exception.toString());
        }
    }

    @Override
    public double parseDouble(String string) throws UtilException {
        try {
            return Double.parseDouble(string);
        } catch (NumberFormatException exception) {
            logger.error("parse double method");
            throw new UtilException(exception.toString());
        }
    }

    @Override
    public TablePCColor parseColor(String string) throws UtilException {
        try {
            return TablePCColor.valueOf(string);
        } catch (IllegalArgumentException | NullPointerException exception) {
            logger.error("parse color method");
            throw new UtilException(exception.toString());
        }
    }

    @Override
    public FilterType parseFilterType(String string) throws UtilException {
        try {
            return FilterType.valueOf(string);
        } catch (IllegalArgumentException | NullPointerException exception) {
            logger.error("parse filter type method");
            throw new UtilException(exception.toString());
        }
    }

    @Override
    public OS parseOS(String string) throws UtilException {
        try {
            return OS.valueOf(string);
        } catch (IllegalArgumentException | NullPointerException exception) {
            logger.error("parse os method");
            throw new UtilException(exception);
        }
    }
}
