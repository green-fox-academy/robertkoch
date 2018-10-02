package com.roka.rokaapp.models;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TaskRepository {
    List<Fox> foxList = new ArrayList<>();

    public void addFox(String name) {
        foxList.add(new Fox(name));
    }

    public String printFox() {
        return foxList.get(0).getName();
    }

    enum Food {MUSHROOM, PIZZA, RABBIT, BOAR;}

}

