import org.junit.jupiter.api.Test;

import java.util.Scanner;

public class ScannerSimple {
    @Test
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();

        System.out.println(s);
    }
}
