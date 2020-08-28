package com.mishamba.day1.util.factory;

import com.mishamba.day1.util.factory.impl.*;

public enum CreatorType {
    LAPTOP(new LaptopCreator()),
    OVEN(new OvenCreator()),
    REFRIGERATOR(new RefrigeratorCreator()),
    VACUUM_CLEANER(new VacuumCleanerCreator()),
    TABLET_PC(new TabletPCCreator()),
    SPEAKERS(new SpeakersCreator());

    private ApplianceCreator creator;

    CreatorType(ApplianceCreator creator) {
        this.creator = creator;
    }

    public ApplianceCreator getCreator() {
        return creator;
    }
}
