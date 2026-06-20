import java.util.*;

public class BMI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.println("How tall are you (in centimeters)?");
            int height = input.nextInt();

            System.out.println("What is your weight (in kilograms)?");
            int mass = input.nextInt();

            int heightInMeters = height / 100;

            int bmi = mass / (heightInMeters * heightInMeters);

            if (bmi < 18) {
                System.out.println("You are underweight." + bmi);
            } else if (bmi >= 18 && bmi < 24) {
                System.out.println("You are doing great!!" + bmi);
            } else {
                System.out.println("You are obese." + bmi);
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter numeric values.");
        } catch (ArithmeticException e) {
            System.out.println("you can't devide by zero" + e.getMessage());
        } finally {
            input.close();
        }
    }
}