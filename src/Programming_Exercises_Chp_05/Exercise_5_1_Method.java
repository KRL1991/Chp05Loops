package Programming_Exercises_Chp_05;

import java.util.Scanner;

public class Exercise_5_1_Method {

    public static String passOrFail(int score){

        String pass = " You pass the exam";
        String failed = " You failed the exam";
        String outside_parameter = " Invalid score input, input must be between 0 and 100 ";

        System.out.println();


        if (score >= 60) {
            return pass;

        } else if (score >=0) {
         return failed;

        } else {
            return outside_parameter;
        }


    }
}
