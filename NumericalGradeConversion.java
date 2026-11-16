import java.util.Scanner;

public class NumericalGradeConversion {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Chapter 2: Variables and Data Types
        double[] percentage = new double[2];
        String[] category = {"Lecture", "Laboratory"};

        double finalGrade;
        double numericalGrade;
        String remark;
        int choice;

        do {

            System.out.println("==================================");
            System.out.println(" NUMERICAL GRADE CONVERSION SYSTEM");
            System.out.println("==================================");

            // Chapter 4 and 5: Loop and Arrays
            for (int i = 0; i < percentage.length; i++) {

                System.out.print("Enter " + category[i] + " Percentage: ");
                percentage[i] = input.nextDouble();

                // Input Validation
                while (percentage[i] < 0 || percentage[i] > 100) {
                    System.out.println("Invalid! Enter 0 to 100 only.");
                    System.out.print("Enter " + category[i] + " Percentage: ");
                    percentage[i] = input.nextDouble();
                }
            }

            // Calculate Overall Subject Percentage
            finalGrade = (percentage[0] * 0.60) +
                         (percentage[1] * 0.40);

            // Round to nearest whole percentage
            int gradePercentage = (int) Math.round(finalGrade);

            // Chapter 3: Decision Control Structure
            if (gradePercentage >= 98) {
                numericalGrade = 1.00;
            } else if (gradePercentage >= 95) {
                numericalGrade = 1.25;
            } else if (gradePercentage >= 92) {
                numericalGrade = 1.50;
            } else if (gradePercentage >= 89) {
                numericalGrade = 1.75;
            } else if (gradePercentage >= 86) {
                numericalGrade = 2.00;
            } else if (gradePercentage >= 83) {
                numericalGrade = 2.25;
            } else if (gradePercentage >= 80) {
                numericalGrade = 2.50;
            } else if (gradePercentage >= 77) {
                numericalGrade = 2.75;
            } else if (gradePercentage >= 75) {
                numericalGrade = 3.00;
            } else {
                numericalGrade = 5.00;
            }

            // Determine Remark
            if (numericalGrade <= 3.00) {
                remark = "PASSED";
            } else {
                remark = "FAILED";
            }

            // Display Results
            System.out.println("\n==================================");
            System.out.println("          FINAL RESULTS");
            System.out.println("==================================");

            System.out.printf("Lecture Percentage: %.2f%%\n", percentage[0]);
            System.out.printf("Laboratory Percentage: %.2f%%\n", percentage[1]);

            System.out.printf("Overall Subject Percentage: %.2f%%\n", finalGrade);
            System.out.printf("Numerical Grade: %.2f\n", numericalGrade);

            System.out.println("Remark: " + remark);

            System.out.println("==================================");

            // Menu
            System.out.println("\n1. Compute Again");
            System.out.println("2. Exit");
            System.out.print("Enter Choice: ");

            choice = input.nextInt();

            // Switch Statement
            switch (choice) {
                case 1:
                    System.out.println("\nComputing again...\n");
                    break;
                case 2:
                    System.out.println("Thank you!");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice == 1);

        input.close();
    }
}
