package BasicMathOperations;

public class BasicMathOperations {

    public static void main(String[] args) {

        /**
         * Basic math operations
         * 1) Addition  -> +
         * 2) Subtraction -> -
         * 3) Division -> /
         * 4) Multiplication -> *
         * 5) Modulo -> %
         */

       //Addition
        System.out.println("Addition example -->");
        System.out.println( 2 + 2 + 2);
        System.out.println( 2.12 + 2.12);
        System.out.println( 2.12f + 2.12);
        System.out.println( 2.12f + 2.12f + "\n");

        //Subtraction
        System.out.println("Substraction example -->");
        System.out.println( 10-2);
        System.out.println( 2 - 10);
        System.out.println( 2 - 10 - 3);
        System.out.println(10.12 - 2);
        System.out.println(2 - 10.12);
        System.out.println(10.12f - 2.12f);
        System.out.println(2.12f - 10.12f);
        System.out.println(10.12f - 2 + "\n");

        //Divison
        System.out.println("Divison example -->");
        System.out.println(64 / 8);
        System.out.println(64 / 8 / 2);
        System.out.println(11 / 2); // Integer / Integer = Integer
        System.out.println(11f / 2); // float / Integer = float
        System.out.println(11 / 2f);
        System.out.println(11f / 2f);
        System.out.println(11d / 2 ); // double / integer = double
        System.out.println(11d / 2f ); // double / float = double
        System.out.println(11d / 2d );
        System.out.println(1269.12 / 2  + "\n");


        //Multiplication
        System.out.println("Multiplication example -->");
        System.out.println( 10 * 2);
        System.out.println( 12.13 * 2);
        System.out.println( 12.13 * 2.3 + "\n");


        //Modulus ( gives remainder )
        System.out.println("Modulo example -->");
        System.out.println(4 % 2);
        System.out.println(3 % 2);
        System.out.println(10 % 4 + "\n");


        // Operator precedence
        /**
         * Parentheses have higher precedence
         * Multiplication , Division and Modulus have same level precedence but higher than addition & subtraction
         * and associativity is left to right
         * Addition and subtraction have same level precedence and associativity is left to right
         *
         */
        System.out.println("Precedence example -->");
        System.out.println(10-7+2);
        System.out.println(10+2-2);
        System.out.println(10*2/2);
        System.out.println(10/2*5);
        System.out.println(10+2-2*4);
        System.out.println(10+2-4/2);
        System.out.println(10+2-4*2/4);
        System.out.println(10*2/(2+2));







    }
}
