package com.mkrooted.Factory;

import com.mkrooted.CuteNarwhal;

import java.util.HashSet;

/**
 * Factory producing little narwhals
 */
public class TinyNarwhalsFactory {
    public static HashSet<Double> frequencies;

    public static double MIN_WEIGHT = CuteNarwhal.MIN_WEIGHT;
    public static double MAX_WEIGHT = CuteNarwhal.MAX_WEIGHT * 0.33;
    public static double MIN_TUSK_LEN = CuteNarwhal.MIN_TUSK_LEN;
    public static double MAX_TUSK_LEN = CuteNarwhal.MAX_TUSK_LEN * 0.33;

    public CuteNarwhal nextNarwhal(double frequency) {
        CuteNarwhal narwhal = new CuteNarwhal(
                Math.random() * (MAX_WEIGHT - MIN_WEIGHT) + MIN_WEIGHT,
                Math.random() * (CuteNarwhal.MAX_TUSK_LEN - CuteNarwhal.MIN_TUSK_LEN) + CuteNarwhal.MIN_TUSK_LEN,
                frequency
        );
        narwhal.communicate();
        return narwhal;
    }
}
