package com.mishamba.day1.util.factory;

public class ApplianceProvider {
    public ApplianceCreator defineCreator(String className) {
        return CreatorType.valueOf(className).getCreator();
    }
}
