package RandomNumber;
import java.util.Random;

public class Approach3 {


        private static final Random random = new Random();

        public static double getRandomNumber() {
            return random.nextDouble();
        }

        public static void main(String[] args) {
            // Create multiple threads to generate random numbers concurrently
            Thread thread1 = new Thread(() -> {
                for (int i = 0; i <5; i++) {
                    System.out.println("Thread 1 - Random Number: " + getRandomNumber());
                }
            });

            Thread thread2 = new Thread(() -> {
                for (int i = 0; i < 5; i++) {
                    System.out.println("Thread 2 - Random Number: " + getRandomNumber());
                }
            });

            // Start the threads
            thread1.start();
            thread2.start();
        }
    }
