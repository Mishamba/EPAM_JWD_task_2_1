package com.mishamba.day1.util.reader.impl;

import com.mishamba.day1.util.reader.ApplianceReader;
import com.mishamba.day1.util.exception.UtilException;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class ApplianceReaderImpl implements ApplianceReader {
    private final BufferedReader bufferedReader;

    public static class ApplianceReaderImplFactory {
        private ApplianceReaderImplFactory() {
        }

        @Contract("_ -> new")
        public static @NotNull ApplianceReaderImpl createReader(File file)
                throws UtilException {
            return new ApplianceReaderImpl(file);
        }
    }

    private ApplianceReaderImpl(@NotNull File file) throws UtilException {
        try {
            this.bufferedReader = new BufferedReader(new FileReader(file.getAbsolutePath()));
        } catch (FileNotFoundException exception) {
            throw new UtilException(exception.toString());
        }
    }

    @Override
    public String readString() throws UtilException {
        try {
            return bufferedReader.readLine();
        } catch (IOException exception) {
            throw new UtilException(exception.toString());
        }
    }
}
