import org.junit.jupiter.api.Test;

import java.util.Scanner;

//оператор цикла While
// состоит из двух частей: условие и тело цикла.
// Тело цикла выполняется снова и снова, пока условие равно true.

public class While {
    @Test
    public static void main(String[] args) {
        String quote= "Some random text";

        int a = 0;
        while (a < 100)//условие
        {
            System.out.println(quote); //команда или блок команд
            a++;
        }
    }

    @Test
    private static void WhileTrue (){
        Scanner scanner = new Scanner(System.in);

        while(true)
        {
            String a = scanner.nextLine();

            if (a.equals("enough"))
                break;
            System.out.println(a);

        }

    }
}
