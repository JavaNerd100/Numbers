package PrimitiveDataType;

public class PrimitiveDataTypes {

    public static void main(String[] args) {
        /**
         *
         * Java primitive types include:
         * Integer Types
         * byte
         * short
         * int
         * long
         * Floating-Point Types
         * float
         * double
         * Character Type
         * char
         * Logical Type
         * boolean
         *
         * Java also has a wrapper class corresponding to each of them,
         * which make their primitive versions more versatile.
         * Byte : for byte
         * Short : matching short
         * Integer corresponding to int
         * Long : about long
         *
         */

        //Byte
        System.out.println("Byte data types --> ");
        System.out.println(Byte.SIZE);
        System.out.println(Byte.BYTES);
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE + "\n");

        //Short
        System.out.println("Short data types --> ");
        System.out.println(Short.SIZE);
        System.out.println(Short.BYTES);
        System.out.println(Short.MAX_VALUE);
        System.out.println(Short.MIN_VALUE + "\n");


        //Integer
        System.out.println("Intger data types --> ");
        System.out.println(Integer.SIZE);
        System.out.println(Integer.BYTES);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE + "\n");

        //Long
        System.out.println("Long data types --> ");
        System.out.println(Long.SIZE);
        System.out.println(Long.BYTES);
        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.MIN_VALUE + "\n");




        //Floating point number
        /**
         * Float : A narrower, less precise representation for floating-point data. It has a capacity of 4 bytes.
         * Double : The default type for floating-point literals, with a capacity of 8 bytes
         */

        //Float
        System.out.println("Float Data type --> ");
        System.out.println(Float.SIZE);
        System.out.println(Float.BYTES);

        // A float literal must be accompanied with a trailing f or F
        float myFloat = 34.5f;// or 34.5F
        System.out.println(myFloat);

        double myDouble = 34.568;
        myFloat = (float) myDouble;
        System.out.println(myFloat + "\n");


        //Double
        System.out.println("Double Data type --> ");
        System.out.println(Double.SIZE);
        System.out.println(Double.BYTES);

        double myDoubleTwo = 34.568;
        float myfloatTwo = 34.5f;

        myDoubleTwo = myfloatTwo;
        System.out.println(myDoubleTwo + "\n") ;


        //Character Type
        /**
         * Upper-Case and lower-case letters (A-Z, a-z)
         * Numeric characters (0-9)
         * Punctuation and other special characters (such as ',', '$', '{', etc.)
         * Java supports a much larger family of character encoding sets, called Unicode.
         * All Unicode characters can be input to, understood and processed by,
         * as well as output from your code.
         */

        System.out.println("Character Data type -->");
        System.out.println(Character.SIZE);;
        System.out.println(Character.BYTES);

        char myChar = '"';
        System.out.println(myChar);

        char mychar2 = '\u0022'; // it is a unicode of double quotes
        System.out.println(mychar2);

        char myChar3 = 65;
        System.out.println(myChar3);

        char myChar4 = 'A';
        System.out.println(myChar4 + "\n");


        //Logical Operator
        /**
         * && :  AND ( gives true when both operands are true)
         * || : OR  ( gives false when both operands are false)
         * ! : NOT ( it negates the input value)
         *
         */

        System.out.println("Boolean Data type -->");
        boolean  myBoolean = true;
        System.out.println(myBoolean);

        int i = 12;
        System.out.println( i >= 12 && i<=12);
        System.out.println( i >= 24 || i <= 8);

        int  x = 10;
        System.out.println( !(x > 12) + "\n");


        //Short circuit evaluation
        System.out.println("Short circuit evaluation --->");
        int y = 10;
        int j = 15;

        /**
         * The expression j > 15 && i++ > 5 was scanned from left to right. As the first operand to && evaluated to
         * false , the compiler got lazy. && avoids evaluating expressions that don't affect the final result.
         * The optimization has a name: Short-Circuit Evaluation, also called lazy evaluation.
         */
        System.out.println( y > 15 && j++ >10);
        System.out.println(j);

        System.out.println(  y > 15 & j++ >10);
        System.out.println(j);

        /**
         *   Both logical AND and OR have two versions
         *   1) (&&,||) This exhibits lazy evaluation.
         *   2) (&,|) This exhibits  without lazy evaluation.
         */

    }
}
