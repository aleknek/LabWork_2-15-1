package com.brainacad.oop.testcollection1;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        for (int i = 0; i < 11; i++) {
            list.add("number_" + i);
        }
        for (String item : list) {
            System.out.println(item);
        }
    }
}
