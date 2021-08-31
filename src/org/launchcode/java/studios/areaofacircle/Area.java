package org.launchcode.java.studios.areaofacircle;
import java.util.Scanner;

public class Area {
    public static void main(String[] args){
        double area;
        double radius;
        double pi = 3.14;
        Scanner input;

        input = new Scanner(System.in);

    System.out.println("Enter a radius:");

    radius=input.nextDouble();

//    if (radius < 0 ){
//        System.out.println("Please enter a positive number.");
//    }
//    else if(radius){
//        System.out.println("Please enter a number.");
//    }


    area=Circle.getArea(radius);

    System.out.println(area);



    }
}
