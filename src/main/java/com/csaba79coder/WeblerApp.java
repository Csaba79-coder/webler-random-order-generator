package com.csaba79coder;

import com.csaba79coder.model.Matching;
import com.csaba79coder.util.Printer;
import com.csaba79coder.util.RandomCouple;

import java.util.List;

public class WeblerApp {

    public static void main(String[] args) {
        List<Matching> matches = RandomCouple.generateRandomMatching();

        for (Matching match : matches) {
            Printer.renderMatch(match);
        }
    }
}
