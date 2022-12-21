package com.solarstudent121.simplijava;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public final class L {
    private static final Logger logger =  LogManager.getLogger(L.class);

    public static void loginfo(Object msg)
    {
        getLogger().info(msg);
    }
    public static void logwarn(Object msg)
    {
        getLogger().warn(msg);
    }
        public static void logerror(Object msg)
    {
        getLogger().error(msg);
    }
    public static void logfatal(Object msg)
    {
        getLogger().fatal(msg);
    }
    public static void logdebug(Object msg)
    {
        getLogger().debug(msg);
    }
    public static void logtrace(Object msg)
    {
        getLogger().trace(msg);
    }

    static Logger getLogger() {
        return logger;
    }
}
