package com.notjuststudio.fpnt;

/**
 * Created by George on 25.06.2017.
 */
public class FPNTConstants {

    public static final char MAGIC_NUMBER = 0xFA1A;

    public static final byte[] MAGIC_NUMBER_ARRAY;

    static {
        MAGIC_NUMBER_ARRAY = new byte[2];
        MAGIC_NUMBER_ARRAY[0] = (byte) (MAGIC_NUMBER >>> 8);
        MAGIC_NUMBER_ARRAY[1] = (byte) (MAGIC_NUMBER);
    }

    public static final byte
            BOOLEAN = 0,
            BYTE = 1,
            CHAR = 2,
            INT = 3,
            LONG = 4,
            BOOLEAN_ARRAY = 5,
            BYTE_ARRAY = 6,
            CHAR_ARRAY = 7,
            INT_ARRAY = 8,
            LONG_ARRAY = 9,
            STRING = 10;

}
