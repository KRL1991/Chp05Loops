package Programming_Exercises_Loops.Exercise_5_3;

import java.util.Scanner;

public class Exercise_05_3_Method {

    public static void Conversion() {

        System.out.println(" Please enter Celcius");
        Scanner input = new Scanner(System.in);
        double celcius= input.nextDouble();

        double fahrenheitToCelcius = celcius * 9/5 +32;

        System.out.println( celcius + " Celcius is " + fahrenheitToCelcius + " Fahrenheit");


    }
}
