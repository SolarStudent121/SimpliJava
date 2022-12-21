package com.solarstudent121.simplijava;



import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.PropertyResourceBundle;
import java.util.ResourceBundle;
import java.util.Scanner;


/**
 *
 */
public final class IO {

    private static ResourceBundle resourceBundle;

    static {
        try {
            resourceBundle = new PropertyResourceBundle(new FileReader((".properties"), StandardCharsets.UTF_8));
        } catch (IOException ignored) {

        }
    }




    /**
     * @return String x
     */
    public static String readLine() {
        Scanner sc = new Scanner(System.in, StandardCharsets.UTF_8);
        String x = sc.nextLine();
        sc.close();
        return x;
    }

    /**
     * @return int
     */
    public static int readint() {
        Scanner sc = new Scanner(System.in, StandardCharsets.UTF_8);
        int x = sc.nextInt();
        sc.close();
        return x;
    }

    /**
     * @return Float
     */
    public static float readfloat() {
        Scanner sc = new Scanner(System.in, StandardCharsets.UTF_8);
        float x = sc.nextFloat();
        sc.close();
        return x;
    }

    /**
     * @return Double
     */
    public static double readdouble() {
        Scanner sc = new Scanner(System.in, StandardCharsets.UTF_8);
        double x = sc.nextInt();
        sc.close();
        return x;
    }

    /**
     * @param pos the position of the char
     * @return a character
     */
    public static char readchar(int pos) {
        Scanner sc = new Scanner(System.in, StandardCharsets.UTF_8);
        String next = sc.next();
        char x;
        x = next.charAt(pos);
        sc.close();
        return x;
    }

    /**
     * @return String
     */
    public static String read() {
        Scanner sc = new Scanner(System.in, StandardCharsets.UTF_8);
        String x = sc.next();
        sc.close();
        return x;
    }


    /**
     * @param path file path
     * @return file
     * @throws IOException if an IO error
     */
    public static File createflie(String path) throws IOException {
        File result = null;
        File file = new File(path);
        if (file.createNewFile()) {
            result = file;
        } else {
            String resourceBundleString = resourceBundle.getString("error.file.already.exists");
            System.out.println(resourceBundleString);
        }
        return result;
    }

    /**
     * @param file input file
     * @param cbuf data to write
     * @throws IOException if an IO Error
     */
    public static void write(String file, char[] cbuf) throws IOException {

        FileWriter writer = new FileWriter(file, StandardCharsets.UTF_8);
        writer.write(cbuf);
        writer.close();
    }

    /**
     * @param filetoread input file
     * @return x
     * @throws IOException if an IO Error
     */
    public static String readfile(File filetoread) throws IOException {
        Scanner sc = new Scanner(filetoread, StandardCharsets.UTF_8);
        String x = sc.nextLine();
        sc.close();
        return x;
    }

    /**
     * @return Console
     */
    public static Console console() {
        return System.console();
    }


    private static ResourceBundle getResourceBundle() {
        return resourceBundle;
    }
}
