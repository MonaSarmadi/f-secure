package com.f_secure.model.jobPeningPage;

public enum City {

    ALL_CITIES("Applying" ),
    OULU("Applying" ),
    KUALA_LUMPUR("Applying" ),
    HELSINKI("Applying" ),
    STOCKHOLM("Applying" ),
    POZNAN("Poznań"),
    COPENHAGEN("Interviews"),
    LONDON("Final selection");

    private final String name;

    City(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
