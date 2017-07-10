package com.mkrooted.Factory;

import com.mkrooted.CuteNarwhal;

/**
 * Factory producing average narwhals. No AVG_FREQUENCY in argument because these narwhals'll talk on the most average AVG_FREQUENCY
 */
public class MediumNarwhalsFactory {
    public static Double AVG_FREQUENCY;

    public static double MIN_WEIGHT = CuteNarwhal.MIN_WEIGHT + (CuteNarwhal.MAX_WEIGHT - CuteNarwhal.MIN_WEIGHT) * 0.3;
    public static double MAX_WEIGHT = CuteNarwhal.MIN_WEIGHT + (CuteNarwhal.MAX_WEIGHT - CuteNarwhal.MIN_WEIGHT) * 0.7;
    public static double MIN_TUSK_LEN = CuteNarwhal.MIN_TUSK_LEN + (CuteNarwhal.MAX_TUSK_LEN - CuteNarwhal.MIN_TUSK_LEN) * 0.3;
    public static double MAX_TUSK_LEN = CuteNarwhal.MIN_TUSK_LEN + (CuteNarwhal.MAX_TUSK_LEN - CuteNarwhal.MIN_TUSK_LEN) * 0.7;

    public MediumNarwhalsFactory() {
        if (AVG_FREQUENCY == null) {
            AVG_FREQUENCY = Math.random()*500;
        }
    }

    public CuteNarwhal nextNarwhal() {
        double new_weight = Math.random() * (MAX_WEIGHT - MIN_WEIGHT) + MIN_WEIGHT;
        double new_tusk_length = Math.random() * (MAX_TUSK_LEN - MIN_TUSK_LEN) + MIN_TUSK_LEN;
        CuteNarwhal narwhal = new CuteNarwhal(
                new_weight,
                new_tusk_length,
                AVG_FREQUENCY
        );
        System.out.print(String.format("New average narwhal born! Weight - %5f, Tusk length - %5f\n", new_weight, new_tusk_length));
        narwhal.communicate();
        return narwhal;
    }
}
