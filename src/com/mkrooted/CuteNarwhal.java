package com.mkrooted;

import java.io.Console;
import java.util.ArrayList;
import java.util.Random;

/**
 * Main character - class featuring cute average narwhal
 */
public class CuteNarwhal {
    private double weight;          // in kg
    private double tusk_length;     // in m
    private double voice_frequency; // in MHz
    private Random randomizer;

    public static final double MIN_WEIGHT = 800;
    public static final double MAX_WEIGHT = 1600;
    public static final double MIN_TUSK_LEN = 1.2;
    public static final double MAX_TUSK_LEN = 3.5;
    public static final double MIN_FREQ = 0.005;
    public static final double MAX_FREQ = 20.0;

    private static String[] DICTIONARY = new String[]{
            "auuuuw",
            "auuuuuuuuw",
            "tktktkt",
            "I AM A UNICORN",
            "uiiiiiii",
            "*whistle*",
            "crcrcrcrcr",
            "awwwww",
            "<3"
    };

    public CuteNarwhal(double weight, double tusk_length, double voice_frequency) {
        randomizer = new Random();

        this.weight = weight;
        this.tusk_length = tusk_length;
        this.voice_frequency = voice_frequency;
    }

    public void communicate() {
        if (voice_frequency >= MIN_FREQ && voice_frequency <= MAX_FREQ) {
            System.out.print(String.format("On %3fMHz: %s\n", voice_frequency, DICTIONARY[randomizer.nextInt(DICTIONARY.length)]));
        } else {
            StringBuilder msg = new StringBuilder();
            int len = DICTIONARY[randomizer.nextInt(DICTIONARY.length)].length();
            for (int i = 0; i < len; i++) {
                msg.append("-");
            }
            System.out.print(String.format("On %3fMHz: %s\n", voice_frequency, msg));
        }
    };
}
