package com.roka.rokaapp.models;

import java.util.ArrayList;

public class Fox {
    private String name;
    private ArrayList<String> trickList;

    public Fox(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getTrickList() {
        return trickList;
    }

    public void setTrickList(ArrayList<String> trickList) {
        this.trickList = trickList;
    }
}
