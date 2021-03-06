package com.mishamba.day1.util.matcher.impl;

import com.mishamba.day1.model.criteria.Criteria;
import com.mishamba.day1.util.exception.UtilException;
import com.mishamba.day1.util.matcher.ClassCriteriaMatcher;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassCriteriaMatcherImpl implements ClassCriteriaMatcher {
    private static ClassCriteriaMatcherImpl instance;
    private static final Logger logger = Logger.getRootLogger();

    private ClassCriteriaMatcherImpl() {
    }

    public static ClassCriteriaMatcherImpl getInstance() {
        if (instance == null) {
            instance = new ClassCriteriaMatcherImpl();
        }

        return instance;
    }

    private static final String CLASS_REG_EX = "(?<=^)\\w+";
    private static final String CRITERIA_REG_EX_BEGIN = "(?<=";
    private static final String CRITERIA_REG_EX_END = "=)(\\d+\\W\\d+|\\d+)";

    @Override
    public String matchClassName(String line) throws UtilException {
        Pattern pattern = Pattern.compile(CLASS_REG_EX);
        Matcher matcher = pattern.matcher(line);
        try {
            return matcher.group();
        } catch (IllegalStateException exception) {
            logger.error("match class name method");
            throw new UtilException(exception);
        }
    }

    @Override
    public String matchParameterValue(String line, @NotNull Criteria criteria)
            throws UtilException {
        String regEx = CRITERIA_REG_EX_BEGIN + criteria.name() + CRITERIA_REG_EX_END;
        Pattern pattern = Pattern.compile(regEx);
        Matcher matcher = pattern.matcher(line);
        try {
            return matcher.group();
        } catch (IllegalStateException exception) {
            logger.error("match parameter value method");
            logger.error(exception.toString());
            throw new UtilException(exception);
        }
    }
}
