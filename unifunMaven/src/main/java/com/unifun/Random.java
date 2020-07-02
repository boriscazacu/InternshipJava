package com.unifun;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


public class Random {
    private static final Logger LOGGER = Logger.getLogger(Random.class);

    private int[] array;
    private int[] weight;
    Map<Integer, Float> map = new HashMap<Integer, Float>();
    int max = 0, sum = 0;


    public Random(int[] array, int[] weight) {
        this.array = array;
        this.weight = weight;
        generateWeight();

    }

    private void generateWeight() {
        for (int val : weight) {
            max += val;
        }
        for (int i = 0; i < max; i++) {
            sum += i;
        }
        for (int i = 0; i < weight.length; i++) {
            map.put(array[i], (float) weight[i] * 100 / max);
        }
    }

    public int generate() {
        int random = (int) (Math.random() * 100 + 1);
        float temp = (float) random;
        //System.out.print("rand = " + random + "\t" + temp + "\t");
        for (int i = 1; i < weight.length + 1; i++) {
            if (temp <= map.get(i)) {
                return i;
            } else if (i == weight.length && temp > map.get(i))
                return weight.length;
        }
        return random;
    }


    public Map<Integer, Float> getMap() {
        return map;
    }

    @Override
    public String toString() {
        return "Random{" +
                "array=" + Arrays.toString(array) +
                ", weight=" + Arrays.toString(weight) +
                '}';
    }



}
