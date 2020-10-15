package Programming_Exercises_Loops.Exercise_5_4;

public class Exercise_5_4_Calculations {

    public static void inchesToCentimeters() {

        System.out.println("           Inches to Centimeters");

        // Display the number title
        System.out.print("    ");
        for (int j = 1; j <= 10; j++)
            System.out.print("   " + j);

        System.out.println("\n-----------------------------------------");

        // Print table body
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " | ");
            for (int j = 1; j <= 10; j++) {
                // Display the product and align properly
                System.out.println(i * 2.54);
            }


        }
    }
}