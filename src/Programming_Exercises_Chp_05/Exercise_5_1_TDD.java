package Programming_Exercises_Chp_05;

import static Programming_Exercises_Chp_05.Exercise_5_1_Method.passOrFail;

public class Exercise_5_1_TDD {

    public static void main(String[] args) {
        //Testcase 1:
        // 80 chosen as variable
        //Expected output: You pass the exam
        System.out.println("Test case 1 ");

        if (Exercise_5_1_Method.passOrFail(80) == Exercise_5_1_Method.pass) {
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
        }

        //Testcase 2:
        // 59 chosen as variable
        //Expected output: You pass the exam
        System.out.println("Test case 2 ");

        if (Exercise_5_1_Method.passOrFail(59) == Exercise_5_1_Method.failed) {
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
        }

        //Testcase 3:
        // -1 chosen as variable
        //Expected output: You pass the exam
        System.out.println("Test case 3");
        if (Exercise_5_1_Method.passOrFail(-1) == Exercise_5_1_Method.outside_parameter) {
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
        }


    }
}





