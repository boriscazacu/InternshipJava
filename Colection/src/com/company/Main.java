package com.company;

public class Main {

    public static void main(String[] args) {

        Colection colection = new Colection();
        Colection.ArayList arayList = new Colection.ArayList(1,2,3,4);
        System.out.println(arayList.string);

        System.out.println(arayList.getArrayList());

        arayList.addElement(8,2);
        System.out.println(arayList.getArrayList());

        arayList.deleteElement(1);
        System.out.println(arayList.getArrayList());


        // MAP
        Colection.listMap map = new Colection.listMap();
        System.out.println("\n"+map.string);

        System.out.println(map.getMap());
        map.replaceElement("b", 500);
        System.out.println(map.getMap());

        map.removeElement("a");
        System.out.println(map.getMap());





    }


}
