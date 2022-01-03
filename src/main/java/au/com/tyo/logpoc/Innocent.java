package au.com.tyo.logpoc;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

class Innocent {
    public static final Logger logger = LogManager.getLogger();

    public static void main(String[] args) {
        System.out.println("Hi, I am innocent!");
        logger.error(args[0]);
        System.out.println("Innocent is leaving.");
    }
    
}