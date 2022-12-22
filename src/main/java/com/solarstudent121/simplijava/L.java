package com.solarstudent121.simplijava;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * The {@code L} class provides logging support
 * @version 1.0
 * @author SolarStudent121
 */
public final class L {
    private static final Logger logger =  LogManager.getLogger(L.class);

    /**
     *
     * @param msg the message to log
     */
    public static void loginfo(Object msg)
    {
        getLogger().info(msg);
    }
    /**
     *
     * @param msg the message to log
     */
    public static void logwarn(Object msg)
    {
        getLogger().warn(msg);
    }
    /**
     *
     * @param msg the message to log
     */
        public static void logerror(java.io.IOException msg)
    {
        getLogger().error(msg);
    }
    /**
     *
     * @param msg the message to log
     */
    public static void logfatal(Object msg)
    {
        getLogger().fatal(msg);
    }
    /**
     *
     * @param msg the message to log
     */
    public static void logdebug(Object msg)
    {
        getLogger().debug(msg);
    }
    /**
     *
     * @param msg the message to log
     */
    public static void logtrace(Object msg)
    {
        getLogger().trace(msg);
    }

    private static Logger getLogger() {
        return logger;
    }
}
