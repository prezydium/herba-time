package org.prezydium.herbatime.util;

import java.util.Random;

public class RandomRGBGenerator {

    public static String generateRandomRGB() {
        Integer[] rgbArr = new Integer[3];
        rgbArr[0] = new Random().nextInt(256);
        rgbArr[1] = new Random().nextInt(256);
        rgbArr[2] = new Random().nextInt(256);
        return String.format("rgb(%d, %d, %d)", rgbArr[0], rgbArr[1], rgbArr[2]);
    }
}
