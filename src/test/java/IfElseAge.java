import org.junit.jupiter.api.Test;

import java.util.Scanner;

public class IfElseAge {
    @Test
    public static void main(String[] args) {
        System.out.println("Hello! Please enter your first name!");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        System.out.println("Now enter your age");
        int age = scanner.nextInt();

        String text1 = ", you have access!";

        if (age >= 18 && age <= 70) {
            System.out.println(name + text1);
        }
        else {
            System.out.println(name + " ,sorry access denied!");
        }
    }
}

