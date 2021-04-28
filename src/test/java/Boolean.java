import org.junit.jupiter.api.Test;

import java.util.Scanner;

public class Boolean {
    @Test
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        boolean isSenior = (age > 65);
        if (isSenior)
            System.out.println("Time to rest");

    }
}
