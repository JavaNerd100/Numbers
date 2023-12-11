package MathExercise;

import java.util.Scanner;

public class MathExercise {

    public static void main(String[] args) {

        System.out.println("Enter the shape you want to find the area ?" );
        Scanner userInput = new Scanner(System.in);
        String shape = userInput.next();
        findSomething(shape);



    }

    private static void findSomething(String shape) {
        if (shape.matches("Circle")) {
            System.out.println("Enter the radius ");
            Scanner userInputTwo = new Scanner(System.in);
            double radius = userInputTwo.nextInt();
            AreaOfShapes shapes = new AreaOfShapes();
            double areaOfCircle = shapes.areaOfCircle(radius);
            System.out.println(areaOfCircle);
        }
        else {
            System.out.println("You have given the wrong shape");
        }

    }



}
