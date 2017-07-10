package com.mkrooted;

import com.mkrooted.Factory.HugeNarwhalsFactory;
import com.mkrooted.Factory.MediumNarwhalsFactory;
import com.mkrooted.Factory.TinyNarwhalsFactory;

public class Main {

    public static void main(String[] args) {
        factory();
    }

    private static void factory() {
        TinyNarwhalsFactory tinyFactory = new TinyNarwhalsFactory();
        MediumNarwhalsFactory mediumFactory = new MediumNarwhalsFactory();
        HugeNarwhalsFactory hugeFactory = new HugeNarwhalsFactory();

        tinyFactory.nextNarwhal(433);
        mediumFactory.nextNarwhal();
        hugeFactory.nextNarwhal(0.150);
    }
}
