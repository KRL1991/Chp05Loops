package Programming_Exercises_Loops.Exercise_5_10;

public class Exercise_5_10_Calculations {

    public static void findNumbers(){

int count = 1;
        for (int i = 100; i <= 1000 ; i++) {

            if( i % 3 == 0 && i % 4 == 0) {
                System.out.print((count++ % 10 != 0) ? i + " ": i + "\n");
            }

        }
    }
}
