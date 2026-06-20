/* This program just prints out the users age */
import java.util.Scanner;

public class Main2{
     public static void main(String[] args){
       Scanner input = new Scanner(System.in);
         System.out.print("Enter Age:  ");
           int age = input.nextInt();
            System.out.println("Your age is " + age );
    }
}