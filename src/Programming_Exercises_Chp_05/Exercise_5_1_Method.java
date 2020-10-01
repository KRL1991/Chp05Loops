package Programming_Exercises_Chp_05;

import java.util.Scanner;

public class Exercise_5_1_Method {

    public static void passOrFail(){

        String pass = " You pass the exam";
        String failed = " You failed the exam";
        String outside_parameter = " Invalid score input, input must be between 0 and 100 ";


        System.out.println("Enter your score : ");
        Scanner input = new Scanner(System.in);
        int score = input.nextInt();

        if (score >= 60) {
            System.out.println(pass);

        } else if (score < 60 ) {
            System.out.println(failed);

        } else {
            System.out.println(outside_parameter);
        }







    }
}
