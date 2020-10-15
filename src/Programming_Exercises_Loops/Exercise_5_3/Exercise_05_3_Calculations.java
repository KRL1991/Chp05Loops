package Programming_Exercises_Loops.Exercise_5_3;


import java.sql.SQLOutput;

public class Exercise_05_3_Calculations {

    public static void Conversion() {

        System.out.println("           Celcius to Fahrenheit");

        // Display the number title
        System.out.print("    ");
        for (int j = 0; j <= 200; j++)
            System.out.print("   " + j);

        System.out.println("\n-----------------------------------------");

        // Print table body
        for (int i = 0; i <= 200; i++) {
            System.out.print(i + " | ");
            for (int j = 0; j <= 200; j++) {
                // Display the product and align properly
                System.out.printf("%4d", i * ((9/ 5 +32)));
            }
            System.out.println();

        }
    }
}


