package org.launchcode.java.studios.areaofacircle;


import java.util.Scanner;

public class Area {
    public static void main (String[] args){
        Area areaOfCircle = new Area();
        areaOfCircle.calculateAreaOfCircle();
    }

    public void calculateAreaOfCircle() {
        Scanner scanner = new Scanner(System.in);

        try {
            boolean keepOnLooping = true;
                while(keepOnLooping) {
                    System.out.println("What is the radius of the circle?");
                    double radiusOfCircle = scanner.nextDouble();

                    if (radiusOfCircle < 0) {
                        System.out.println("Error negative radius entered");

                    } else {

                        double areaOfCircle = Circle.getArea(radiusOfCircle);

                        System.out.println("The area of the circle is: " + areaOfCircle);

                        keepOnLooping = false;
                    }
                }
        } catch(Exception error) {
            System.out.println("Must be a number");
        }
    }
}
