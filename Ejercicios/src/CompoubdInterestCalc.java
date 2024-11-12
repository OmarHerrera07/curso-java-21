import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;

public class CompoubdInterestCalc {

    private static final NumberFormat moneyFormatter = NumberFormat.getCurrencyInstance();

    public static void main(String[] args) throws ParseException {
        DecimalFormat df = new DecimalFormat("#,###.00;$(#)");

        BigDecimal balance = calculate("$1,0000.00","0.08",10,"1000");

        System.out.println(df.format(balance));
        System.out.printf("$%,(.2f%n",balance.negate());
        System.out.format("$%,(.2f%n",balance.negate());
        String myMoney = String.format("$%,(.2f%n",balance.negate());

        System.out.println(myMoney);


    }

    public static BigDecimal calculate(String principal, String rate, int period, String contribution) throws ParseException {
        // Balance(Y) = p(1 + r)Y + c[((1 + r)Y - 1) / r]
        BigDecimal a = BigDecimal.ONE.add(new BigDecimal(rate)).pow(period); // (1 + r) ^ period

        //BigDecimal b = a.multiply(new BigDecimal(period));// (1 + r)Y

        BigDecimal c = a.subtract(BigDecimal.ONE); // ((1 + r)^Y - 1)

        BigDecimal d = c.divide(new BigDecimal(rate)); // ((1 + r)^Y - 1) / r

        BigDecimal e = d.multiply(new BigDecimal(contribution)); // c[((1 + r)Y - 1) / r]

        BigDecimal f = a.multiply(new BigDecimal(moneyFormatter.parse(principal).toString())); //p(1 + r)^Y

        BigDecimal result = f.add(e);

        return result;
    }
}
