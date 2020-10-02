package Programming_Exercises_Loops.Exercise_5_1;

import java.util.Scanner;

public class Exercise_5_1 {

    public static void main(String[] args) {
        //Metode kaldt fra Method

        System.out.println("Enter your score : ");
        Scanner input = new Scanner(System.in);
        int score = input.nextInt();

        System.out.println(Exercise_5_1_Method.passOrFail(score));


    }
}
