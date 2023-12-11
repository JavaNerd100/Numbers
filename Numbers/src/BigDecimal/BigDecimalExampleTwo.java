package BigDecimal;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.math.RoundingMode;

public class BigDecimalExampleTwo {

    public static void main(String[] args) {
        System.out.println(new BigDecimal("2.111").add(new BigDecimal("1.111")));
        System.out.println(new BigDecimal("2.111").subtract(new BigDecimal("1.111")));

        //Divide Method
        MathContext mc = new MathContext(7, RoundingMode.HALF_UP);
        System.out.println(new BigDecimal("2.111").divide(new BigDecimal("1.111"),mc));

        //SquareRoot method
        System.out.println(new BigDecimal("25").sqrt(mc));

        //Max and Min method
        System.out.println(new BigDecimal("25").max(new BigDecimal(12)));
        System.out.println(new BigDecimal("25").min(new BigDecimal(12)));

        //Absolute method
        System.out.println(new BigDecimal("-7").abs());

        //Remainder method
        System.out.println(new BigDecimal("25").remainder(new BigDecimal(12)));


        /**
         * There are three ways to initialize numbers in BigDecimal rather then strings. some of them are as follows-->
         * 1) Using character array
         * 2) using direct primitive
         * 3) using strings
         */

        BigDecimal myNum = new BigDecimal(3.12355);
        double myInt = myNum.doubleValue();
        System.out.println(myInt);


        /**
         * As BigDecimal used for representing arbitrary big decimal number and for maintaining precision between them.
         * Similar for large integer number we used BigInteger class.
         */
        BigInteger myBigInt = new BigInteger("1234557909998888");
        System.out.println(myBigInt);


    }
}
