package BigDecimal;

import java.math.BigDecimal;

public class BigDecimalExampleOne {

    public static void main(String[] args) {
        float num1 = 2.11f;
        float num2 = 1.11f;

        System.out.println(num1 - num2);

        BigDecimal numA = new BigDecimal("2.11");
        BigDecimal numB = new BigDecimal("1.11");

        System.out.println(numA.subtract(numB));
    }
}
