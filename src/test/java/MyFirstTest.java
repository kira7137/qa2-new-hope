import org.junit.jupiter.api.Test;

import java.sql.SQLOutput;

public class MyFirstTest {

        @Test
        public void FirstTest () {
            System.out.println("Hello, corona!");

            String firstName = "Kira";
            String lastName = "Kirova";
            String email = "kakashka@gmail.com";
            int age = 34;

            System.out.println("firstName: " + lastName + "\nLast name: ");

            // "\nLastname: " -- \n - перенос на новую строку

            int commentCount = 36;
            int newComments = 22;

            String stringCommentCount = "36";
            String stringNewComments = "22";

            System.out.println(commentCount + newComments);
            System.out.println(stringCommentCount + stringNewComments);

            printSum("15", "3"); //a и b - вызываем кавычками ""
            printSum("250", "250");
            printSum("250", "250");
            printSum("250", "250");
            printSum("250", "250");
            printSum("400", "400");
        }

        private void printSum(String a, String b) {
            int first = Integer.parseInt(a);
            int second = Integer.parseInt(b);
            //printSum - вывести сумму чисел
            //(String a, String b) --входные параметры с назв.переменных
            //Integer.parseInt(a) -- непримитив Integer вызывает функцию parseInt (переделать строку в int)

            System.out.println("Text is: " + (first + second));
            //                                должно быть в скобках, чтобы вызвать сложение чисел

        }
    }