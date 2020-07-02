package com.unifun;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Main {

   private static final Logger LOGGER = Logger.getLogger(Main.class);


    public static void main(String[] args) {
        PropertyConfigurator.configure("log4j.properties");
        try {
           float vat = 2/0;
        }catch (Exception e) {


            LOGGER.debug("Helo World !!!");
            LOGGER.info("Helo World !!!");
        }
    }
}
