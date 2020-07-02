package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Colection {
    static class ArayList {
        String string = new String("ArrayList");
        ArrayList<Integer> arrayList = new ArrayList<>();


        public ArayList(int... array) {
            for (int value : array) {
                this.arrayList.add(value);
            }
        }

        public ArrayList<Integer> getArrayList() {
            return arrayList;
        }


        public void addElement(int element, int position) {
            this.arrayList.add(position, element);
        }

        public void deleteElement(int position) {
            this.arrayList.remove(position);
        }

        @Override
        public String toString() {
            return "Colection{" +
                    "arrayList=" + arrayList +
                    '}';
        }
    }

    static class listMap{
        String string = new String("Map");
        Map<String, Integer> map = new HashMap<String, Integer>();

        public listMap() {
            this.map.put("a", 100);
            this.map.put("b", 200);
            this.map.put("c", 300);
            this.map.put("d", 400);
        }

        public Map<String, Integer> getMap() {
            return map;
        }

        public void replaceElement(String key, int value){
            this.map.put(key, value);
        }

        public void removeElement(String key){
            this.map.remove(key);
        }



    }
}
