import org.junit.jupiter.api.Test;

public class For {
    @Test
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++)
        {
                for (int j = 0; j < i; j++)
                    System.out.print("8");
            System.out.println();
        }
    }
}