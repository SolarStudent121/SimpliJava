package com.solarstudent121.simplijava;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.net.URI;

/**
 * The {@code G} class contains the methods in java associated to GUI.
 * 
 * @version 1.0
 */
public final class G {

    /**
     * @param uri URI to browse
     * @throws IOException IO Error
     */
    public static void Browse(URI uri) throws IOException {
        Desktop.getDesktop().browse(uri);
    }

    /**
     * @param file file to print
     * @throws IOException IO Error
     */
    public static void sysprint(File file) throws IOException {
        Desktop.getDesktop().print(file);
    }

    /**
     * @throws IOException IO Error
     */
    public static void mail() throws IOException {
        Desktop.getDesktop().mail();
    }

    /**
     * @param file file to open
     * @throws IOException IO Error
     */
    public static void openFile(File file) throws IOException {
        Desktop.getDesktop().open(file);
    }

    /**
     * @param file file to edit
     * @throws IOException IO Error
     */
    public static void editFile(File file) throws IOException {
        Desktop.getDesktop().edit(file);
    }

    /**
     * @return java.awt.Desktop
     */
    public static Desktop desk() {
        return Desktop.getDesktop();
    }
}