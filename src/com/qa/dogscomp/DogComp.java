package com.qa.dogscomp;

import java.util.ArrayList;
import java.util.Scanner;

public class DogComp {
    public static void main(String[] args) {
        ArrayList<String> places = new ArrayList<>();
        String position;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter dog's placement:");
        int input = scanner.nextInt();
        
        // ADDING THE SUFFIXES

        for (int i=1; i<100; i++) {

            int endPosition = finalPosition(i);
            switch (endPosition) {
                case 1:
                    position = "st";
                    break;
                case 2:
                    position = "nd";
                    break;
                case 3:
                    position = "rd";
                    break;
                default:
                    position = "th";
                    break;
            }

            if ((i == 11) || (i == 12) || (i == 13)) {
                position = "th";
            }
            
            // COMBINING
            
            String value = String.valueOf(i);
            places.add(value+position);
        }
        places.remove(input);
        for (String s : places) {
            System.out.println(s);
        }
    }

    public static int finalPosition(int d) {
        return Math.abs(d % 10);
    }
}