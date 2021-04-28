import org.junit.jupiter.api.Test;

import java.util.Scanner;

public class IfElseTemp {
    @Test
    public static void main(String[] args) {
        System.out.println("Hello! Please enter temperature!");
        Scanner scanner = new Scanner(System.in); // создаем объект Scanner
        int temperature = scanner.nextInt(); // читаем с клавиатуры число

        if (temperature > 20)
            System.out.println("Let' s go outside and have fun!");
        else if (temperature > 10)
                System.out.println("Please wear a warm coat and a hat!");
            else if (temperature > 0)
                    System.out.println("You better stay home and make a tea!");
                else
                    System.out.println("Just make a tea");
    }
    //Если в конструкции if-else не расставлены фигурные скобки, else относится к предыдущему (ближайшему к нему) if-у.
}
