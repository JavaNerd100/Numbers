package TypeConversion;

public class TypeCasting {

    public static void main(String[] args) {
        /**
         * Type casting precedence
         * byte>short>int>long
         *
         * for floating point
         * float>double
         *
         * Casting types
         * 1) Explicit cast -> Storing large value to smaller bin
         * 2) Implicit cast -> Storing smaller value to larger bin
         */

        // range ( -128 to 127)
        byte myByte = 127;
        System.out.println(myByte);

          //casting to byte
        // rounding off (unexpected behaviour)
        byte myByteTwo = (byte) -135;
        System.out.println(myByteTwo);

        //short
        //range (-32768 to 32767)
        short myShort = 32767;
        System.out.println(myShort);

        //int
        //range (-2147483648 to 2147483647)
        int myInt = 214783647;
        System.out.println(myInt );

        //long
        //range (-9223372036854775808 to  9223372036854775807)
        long myLong =  50000000000l; // or 50000000000L
        System.out.println(myLong);

        myInt = (int) myLong;
        System.out.println(myInt);

        short myShort2 = 3456;
        int myInt2 = 4567;

        myShort2 = (short) myInt2;
        //it is giving same output because the myInt2 is well within the range of short
        System.out.println(myShort2);

        //Storing & representing binary ,octal and hexadecimal in java
        //binary
        //first way
        int binary = 0b11;
        System.out.println(binary);

        //second way
        int binary2 = 0b01 | 0b10;
        int binary3 = 1 | 2;
        System.out.println(binary2);
        System.out.println(binary3);

        //hexadecimal
        int hexadecimal = 0xf;
        System.out.println(hexadecimal);

        //octal
         int octal =011;
        System.out.println(octal);












    }
}
