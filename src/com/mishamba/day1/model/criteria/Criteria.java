package com.mishamba.day1.model.criteria;

public enum Criteria {
    POWER_CONSUMPTION("int"),
    WEIGHT("int"),
    CAPACITY("int"),
    DEPTH("int"),
    HEIGHT("double"),
    WIDTH("double"),
    BATTERY_CAPACITY("int"),
    OS("OS"),
    MEMORY_ROM("int"),
    SYSTEM_MEMORY("int"),
    CPU("float"),
    DISPLAY_INCHES("int"),
    FREEZER_CAPACITY("int"),
    OVERALL_CAPACITY("int"),
    FILTER_TYPE("FilterType"),
    CORD_LENGTH("int"),
    BAG_TYPE("String"),
    WAND_TYPE("String"),
    MOTOR_SPEED_REGULATION("int"),
    CLEANING_WIDTH("int"),
    FLASH_MEMORY_CAPACITY("int"),
    COLOR("TablePCColor"),
    NUMBER_OF_SPEAKERS("int"),
    FREQUENCY_RANGE("int");

    private String type;

    Criteria(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
