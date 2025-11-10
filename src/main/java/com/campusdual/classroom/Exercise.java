package com.campusdual.classroom;

import java.util.ArrayList;
import java.util.List;

class Exercise {

    static List<String> createArrayList() {
        List<String> list = new ArrayList<>();
        list.add("GKFFD");
        list.add("TNANA");
        list.add("MPMSL");
        list.add("PSWME");
        list.add("LZMLF");
        list.add("JYEBV");
        list.add("YELNT");
        list.add("JSNKR");
        list.add("JFESF");
        list.add("TMJLL");
        return list;
    }

    static boolean addElementToList(List<String> list, String element) {
        return list.add(element);
    }

    static void printElementsAndIndex(List<String> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(i + ": " + list.get(i));
        }
    }

    public static void main(String[] args) {
        List<String> myList = createArrayList();
        addElementToList(myList, "AAAAA");
        printElementsAndIndex(myList);
    }
}
