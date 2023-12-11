package WrapperClasses;

public class ParsingValue {

    public static void main(String[] args) {
        /**
         * All the data that is come from UI are always in the form of String and text.
         * So in order to parse them one of the easiest way to do by using wrapper Classes.
         */

        int age = Integer.parseInt(args[0]);
        System.out.printf("your age is %d age of years after 10 years \n" , age + 10);
    }
}
