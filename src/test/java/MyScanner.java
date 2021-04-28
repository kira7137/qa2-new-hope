import org.junit.jupiter.api.Test;

import java.util.Scanner;

public class MyScanner {
    @Test
    public static void main(String[] args) {
        //"public" означает, что main() можно вызвать из любого места. Область видимости.
        //"static" означает, что main() не принадлежит определенному объекту
        //"void" означает, что main() не возвращает никакого значения
        //"main" -это имя функции. main() является особенным, потому что это начало программы.
        //"String[]" означает массив строк.
        //"args" -это имя String[] (в теле main()). "args" не является чем-то особенным; вы можете назвать его как угодно, и программа будет работать так же.
        // String[] args -это набор строк, разделенных пробелом, которые можно ввести в программу на terminal.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age:");

        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            System.out.println("You have entered your age: " + number);

        } else  {
            System.out.println("Sorry you have entered the wrong data, try again!");

            scanner.close();
        }

    }

}
