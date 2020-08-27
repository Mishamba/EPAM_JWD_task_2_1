package com.mishamba.day1.util.parser;

import com.mishamba.day1.model.configuration.FilterType;
import com.mishamba.day1.model.configuration.TablePCColor;
import com.mishamba.day1.util.exception.UtilException;

public interface ValueParser {
    int parseInt(String string) throws UtilException;
    float parseFloat(String string) throws UtilException;
    double parseDouble(String string) throws UtilException;
    TablePCColor parseColor(String string) throws UtilException;
    FilterType parseFilterType(String string) throws UtilException;
}
