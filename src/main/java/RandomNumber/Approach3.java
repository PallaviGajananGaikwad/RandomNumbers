package RandomNumber;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
public class Approach3 {

        public static void main(String[] args) {
            // Generate random integers within a range using ThreadLocalRandom
            // Generates random integer between 1 (inclusive) and 101 (exclusive)
            int randomInt1 = ThreadLocalRandom.current().nextInt(1, 101);
            System.out.println("Random Integer 1: " + randomInt1);

            // Generate random doubles within a range using ThreadLocalRandom
            // Generates random double between 0.0 (inclusive) and 1.0 (exclusive)
            double randomDouble1 = ThreadLocalRandom.current().nextDouble(0.0, 1.0);
            System.out.println("Random Double 1: " + randomDouble1);

            // Generate random integers within a range with a specified origin
            // Generates random integer between 10 (inclusive) and 21 (exclusive)
            int randomInt2 = ThreadLocalRandom.current().nextInt(10, 21);
            System.out.println("Random Integer 2: " + randomInt2);

        }
}

