package com.northcoders.drinksapi.model;

public class Tea {

    private final long id;
    private final String name;

    public Tea(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public String getname() {
        return name;
    }
}
