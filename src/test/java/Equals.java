import org.junit.jupiter.api.Test;

public class Equals {
    @Test
    public static void main(String[] args) {

        String s1 = "JavaRush - лучший сайт для изучения Java!";
        String s2 = new String("JavaRush - лучший сайт для изучения Java!");
        System.out.println(s1.equals(s2));
    }
}
