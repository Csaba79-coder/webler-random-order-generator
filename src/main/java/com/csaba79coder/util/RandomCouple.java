package com.csaba79coder.util;

import com.csaba79coder.model.Matching;

import java.util.*;

public class RandomCouple {

    private final static List<String> names = Arrays.asList(
            "Földházi László", "Kovács János Pál", "Ábrahám Miklós", "Antal Peter Attila", "Szőke Roland", "Futó Péter",
            "Perczel Gábor");

    private final static List<String> tasks = Arrays.asList(
            "Eldöntés", "Kiválasztás", "Keresés", "Minimum / maximum keresés", "Rendezés", "Kiválogatás", "Kiválogatás");

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