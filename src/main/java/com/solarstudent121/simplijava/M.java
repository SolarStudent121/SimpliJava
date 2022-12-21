package com.solarstudent121.simplijava;

/**
 *
 */
public final class M {
    /**
     * @param x number
     * @return square of number
     */
    public static int sq(int x) {
        return x*x;
    }
    /**
     * @param x number
     * @return square of number
     */
    public static float sq(float x) {
        return x*x;
    }
    /**
     * @param x number
     * @return square of number
     */
    public static double sq(double x) {
        return x*x;
    }
    /**
     * @param x number
     * @return cube of number
     */
    public static int cb(int x) {
        return x*x*x;
    }
    /**
     * @param x number
     * @return cube of number
     */
    public static double cb(double x) {
        return x * x * x;
    }
    /**
     * @param x number
     * @return cube of number
     */
    public static float cb(float x) {
        return x * x * x;
    }
    /**
     * @param x number
     * @return cube root of number
     */
    public static int cbrt(int x) {
        return (int) StrictMath.cbrt(x);
    }
    /**
     * @param x number
     * @return cube root of number
     */
    public static double cbrt(double x) {
        return StrictMath.cbrt(x);
    }
    /**
     * @param x number
     * @return cube root of number
     */
    public static float cbrt(float x) {
        return (float) StrictMath.cbrt(x);
    }
    /**
     * @param x number
     * @return square root of number
     */
    public static int sqrt(int x) {
        return (int) Math.sqrt(x);
    }
    /**
     * @param x number
     * @return square root of number
     */
    public static double sqrt(double x) {
        return Math.sqrt(x);
    }
    /**
     * @param x number
     * @return square root of number
     */
    public static float sqrt(float x) {
        return (float) Math.sqrt(x);
    }
    /**
     * @return value of PI
     */
    public static double pi() {
        return Math.PI;
    }
}
