package com.example;

import cc.polyfrost.oneconfig.config.annotations.Number;
import cc.polyfrost.oneconfig.config.data.Mod;
import cc.polyfrost.oneconfig.config.data.ModType;

public class Config extends cc.polyfrost.oneconfig.config.Config {
    @Number(
            name = "Some delay",
            category = "Settings",
            subcategory = "Some setting",
            min = 1,
            max = 20,
            size = 2
    )
    public static int someDelay = 10;

    public Config() {
        super(new Mod("CodecClient", ModType.UTIL_QOL), "config.json");
        initialize();
    }
}
