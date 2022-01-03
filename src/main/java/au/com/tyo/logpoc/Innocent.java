package au.com.tyo.logpoc;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

class Innocent {
    
    public static final Logger logger = LogManager.getLogger(Innocent.class);

    static {
        System.setProperty("com.sun.jndi.ldap.object.trustURLCodebase","true");
    }

    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Usage: java Innocent something-like-a-jndi-url");
            System.exit(1);
        }
        logger.error("Hi, I am innocent!");
        logger.error(args[0]);
        logger.error("Innocent is leaving.");
    }
    
}