package StandardMathFunctions;

public class StandardMathFunctions {

    public static void main(String[] args) {
        System.out.println(Math.abs(-5) + "\n");

        System.out.println(Math.ceil(5.0));
        System.out.println(Math.ceil(5.01));
        System.out.println(Math.ceil(5.5));
        System.out.println(Math.ceil(5.6) + "\n");

        System.out.println(Math.floor(5.0));
        System.out.println(Math.floor(5.999));
        System.out.println(Math.floor(5.10) + "\n");

        System.out.println(Math.min(3,5) + "\n");

        System.out.println(Math.pow(2,3) + "\n");

        System.out.println(Math.round(5.0));
        System.out.println(Math.round(5.1));
        System.out.println(Math.round(5.4));
        System.out.println(Math.round(5.5));
        System.out.println(Math.round(5.6) + "\n");

        System.out.println(Math.sqrt(81) + "\n");

        System.out.println((int)(Math.random() * 10) + "\n");

        //Constants in Math class
        System.out.println("Constants in Math Class -->");
        System.out.println(Math.PI);
        System.out.println(Math.E);
    }
}
