package org.launchcode.java.exercises.ch3;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Chapter3 {

    public static void main(String[] args) {
        int intArray[]={1, 1, 2, 3, 5, 8};

        for (int i : intArray) {
            if (i % 2 == 0){
            System.out.println(i);
            }
        }

        String quote = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] words = quote.split(" ");
        System.out.println(Arrays.toString(words));

        String[] sentences = quote.split("\\.");
        System.out.println(Arrays.toString(sentences));









    }
}
