package RandomNumber;

import java.security.SecureRandom;
import java.util.Random;

public class RandomNumber {

    public static void main(String[] args) {

        Random random = new Random();
        System.out.println(random.nextInt(10));
        System.out.println(random.nextInt(10));
        System.out.println(random.nextInt(10));
        System.out.println(random.nextInt(10) + "\n");

        SecureRandom random1 = new SecureRandom();
        System.out.println(random1.nextInt(10));
        System.out.println(random1.nextInt(10));
        System.out.println(random1.nextInt(10));
        System.out.println(random1.nextInt(10));
    }
}
