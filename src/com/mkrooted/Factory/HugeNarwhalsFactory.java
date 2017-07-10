package com.mkrooted.Factory;

import com.mkrooted.CuteNarwhal;

import java.util.HashSet;

/**
 * Factory producing huge narwhals. Frequency slightly lower, than needed because they are huge!
 */
public class HugeNarwhalsFactory {
    public static double MIN_WEIGHT = CuteNarwhal.MIN_WEIGHT + (CuteNarwhal.MAX_WEIGHT - CuteNarwhal.MIN_WEIGHT) * 0.66;
    public static double MAX_WEIGHT = CuteNarwhal.MAX_WEIGHT;
    public static double MIN_TUSK_LEN = CuteNarwhal.MIN_TUSK_LEN + (CuteNarwhal.MAX_TUSK_LEN - CuteNarwhal.MIN_TUSK_LEN) * 0.66;
    public static double MAX_TUSK_LEN = CuteNarwhal.MAX_TUSK_LEN;

    public CuteNarwhal nextNarwhal(double frequency) {
        double new_weight = Math.random() * (MAX_WEIGHT - MIN_WEIGHT) + MIN_WEIGHT;
        double new_tusk_length = Math.random() * (MAX_TUSK_LEN - MIN_TUSK_LEN) + MIN_TUSK_LEN;
        CuteNarwhal narwhal = new CuteNarwhal(
                new_weight,
                new_tusk_length,
                frequency * 0.75
        );
        System.out.print(String.format("Hu-u-u-uge narwhal born! Weight - %5f, Tusk length - %5f\n", new_weight, new_tusk_length));
        narwhal.communicate();
        return narwhal;
    }
}
