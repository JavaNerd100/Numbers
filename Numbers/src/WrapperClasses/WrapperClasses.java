package WrapperClasses;

public class WrapperClasses {

    public static void main(String[] args) {
        int num1 = 10;
        /**
         *   The below method call should give error because we are trying to
         *   store primitive data type(i.e int) into a class "Object"
         *   which is mismatch.But internally java is converting this to there
         *   particular wrapper class for this case it is Integer
         */
         Integer num2 = Integer.valueOf(num1);
            storeData(num2);
        /**
         * Java also has a wrapper class corresponding to each of them,
         * which make their primitive versions more versatile.
         * Byte : for byte
         * Short : matching short
         * Integer corresponding to int
         * Long : about long
         * Float : float
         * Double : double
          */

        Byte myByte = Byte.valueOf("125");
        Short myShort = Short.valueOf("3244");
        Long myLong = Long.valueOf("3555");
        Float myFloat = Float.valueOf("32.55f");
        Double myDouble = Double.valueOf("32.55");

    }

    public static void storeData(Object obj){
        //we want to store any data here and want to do something with it.
    }
}
