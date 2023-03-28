package org.launchcode.java.studios.areaofacircle;


import java.util.Scanner;

public class Area {
    public static void main (String[] args){
        Area areaOfCircle = new Area();
        areaOfCircle.calculateAreaOfCircle();
    }

    public void calculateAreaOfCircle() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is the radius of the circle?");
        double radiusOfCircle = scanner.nextDouble();
        double areaOfCircle = (Math.PI * radiusOfCircle * radiusOfCircle);


        System.out.println("The area of the circle is: " + areaOfCircle);
    }
}
