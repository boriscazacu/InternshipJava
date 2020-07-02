package com.unifun;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Main {

   private static final Logger LOGGER = Logger.getLogger(Main.class);

    public static void main(String[] args) {
        PropertyConfigurator.configure("log4j.properties");
        int[] arr1 = new int[]{1, 2, 3};
        int[] arr2 = new int[]{1, 2, 10};
        Random random = new Random(arr1, arr2);


        for (int i = 0; i < 5; i++) {
            LOGGER.debug(random.generate());
            LOGGER.debug(random.generate());
        }
        LOGGER.info(random.toString());


    }
}
