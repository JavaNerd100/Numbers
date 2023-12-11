package CompoundIntrestCalculator;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class CompoundInterestCalc {

    private static final NumberFormat moneyFormatter = NumberFormat.getCurrencyInstance();
    private static final NumberFormat percentFormatter = NumberFormat.getPercentInstance();

    public static BigDecimal calculate(String principal, String rate, int period, String contribution) throws ParseException {
        String percentageRate = percentFormatter.parse(rate).toString();
        BigDecimal a = BigDecimal.ONE.add(new BigDecimal( percentageRate)).pow(period);// (1 + r)*period
        BigDecimal c = a.subtract(BigDecimal.ONE);// ((1 + r)^y -1)
        BigDecimal d = c.divide(new BigDecimal(percentageRate));// ((1 + r)^y -1)/r
        BigDecimal e = d.multiply(new BigDecimal(moneyFormatter.parse(contribution).toString()));// c[((1 + r)^y -1)/r]
        BigDecimal f = a.multiply(new BigDecimal(moneyFormatter.parse(principal).toString()));// p(1+r)^y
        BigDecimal g = f.add(e);// p(1+r)^y +   c[((1 + r)^y -1)/r]
        return g;

    }

    public static void main(String[] args) throws ParseException {
        DecimalFormat df = new DecimalFormat("₹#,###.##;₹-#");
        DecimalFormat pf = new DecimalFormat("#%");
        BigDecimal calculatedBalance = calculate("₹10,000.00", "8%", 10, "₹1,000");
        System.out.println("using money formatter --> " + moneyFormatter.format(calculatedBalance));
        System.out.println("using decimal formatter --> " + df.format(calculatedBalance.negate()));
        System.out.println("using decimal formatter for percentage--> " + pf.format(.08));

        //Another way to format
        String myMoney = String.format("₹%,(.2f%n",calculatedBalance.negate());
        System.out.println(myMoney);
    }

}
