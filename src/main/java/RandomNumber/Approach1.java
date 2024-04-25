package RandomNumber;
import java.util.Random;
public class Approach1
{
    public static void main(String[] args) {
        Random random = new Random();
        //Approach 1
        // Generate a random integer between 0 (inclusive) and 100 (exclusive)
        int randomNumber = random.nextInt(100);
        System.out.println("Random integer Number: " + randomNumber);

        double rand_double= random.nextDouble(); //range 0.0 and less than 1.0
        System.out.println("Random double Number: " +rand_double);
    }
}
