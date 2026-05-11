import java.util.Scanner;

public class GradeAVG {
    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);

        float grade;
        float sum;
        float AVG;
        float max;
        float min;
        int i;

        //Set sum = 0 to initialize the variable
        sum = 0;

        //Prompt user for 10 inputs
        System.out.println("Enter 10 floating-point grades.");

        //Read first grade seperately to initialize mx & min
        grade = scnr.nextFloat();

        max = grade;
        min = grade;
        sum = grade;

        //for loop to start iterating through scanner inputs
        for (i = 1; i < 10; ++i) {
            grade = scnr.nextFloat();
            sum = sum + grade;

            //Update Maximum
            if (grade > max) {
                max = grade;
            }

            //Update Minimum
            if (grade < min) {
                min = grade;
            }
        }
        //Calculate Average
        AVG = sum / 10;

        System.out.println("Average: " + AVG);
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
        
        scnr.close();
        
    }

}

