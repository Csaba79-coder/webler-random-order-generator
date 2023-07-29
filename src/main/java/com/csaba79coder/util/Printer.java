package com.csaba79coder.util;

import com.csaba79coder.model.Matching;

public class Printer {

    private final static String SEPARATOR = "--------------------------";

    public static void renderMatch(Matching matching) {
        System.out.println(SEPARATOR);
        System.out.println("Match: ");
        System.out.println("Person: " + matching.getName());
        System.out.println("Task: " + matching.getTask());
        System.out.println(SEPARATOR);
    }

    private Printer() {

    }
}
