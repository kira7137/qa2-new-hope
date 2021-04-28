import java.util.Scanner;

public class Double {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int radius = scanner.nextInt();

        double pi = 3.14;

        int result = (int)(pi * radius * radius);
        System.out.println(result);
    }


    }
