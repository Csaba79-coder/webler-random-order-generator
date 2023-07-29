package com.csaba79coder.util;

import com.csaba79coder.model.Matching;

import java.util.*;

public class RandomCouple {

    private final static List<String> names = Arrays.asList(
            "First Person", "Second Person", "Third Person", "Fourth Person", "Fifth Person");

    private final static List<String> tasks = Arrays.asList(
            "Task 1", "Task 2", "Task 3", "Task 4", "Task 5");

    public static List<Matching> generateRandomMatching() {
        // Shuffle the tasks to ensure uniqueness
        List<String> shuffledTasks = new ArrayList<>(tasks);
        Collections.shuffle(shuffledTasks);

        // Create a list to hold the matches
        List<Matching> matches = new ArrayList<>();

        // Assign tasks to each person
        for (int i = 0; i < names.size(); i++) {
            String name = names.get(i);
            String task = shuffledTasks.get(i);
            matches.add(new Matching(name, task));
        }

        return matches;
    }

    private RandomCouple() {

    }
}