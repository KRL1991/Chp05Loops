package Programming_Exercises_Chp_05;

public class Exercise_5_1_Method {
    static String pass = "You pass the exam";
    static String failed = "You failed the exam";
    static String outside_parameter = "Invalid score input, input must be between 0 and 100 ";

    public static String passOrFail(int score) {


        if (score >= 60) {
            return pass;

        } else if (score >= 0) {
            return failed;

        } else {
            return outside_parameter;
        }


    }
}
