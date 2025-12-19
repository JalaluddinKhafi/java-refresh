package com.dahishClub;

import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        List<String> names = List.of("Ali", "Mohammad", "Naser");
        List<Integer> ages = List.of(20, 21, 22);

        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i) + " " + ages.get(i));
        }
    }
}