package com.example.hw_4_3.CONTINENT;

public class ContinentModel {
    private String continent;
    private String name;

    public ContinentModel(String continent, String name) {
        this.continent = continent;
        this.name = name;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
