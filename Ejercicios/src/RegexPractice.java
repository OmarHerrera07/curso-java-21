import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexPractice {

    public static void main(String[] args) {
        String phoneNumber = "233 233-4344";
        String regex = "(?:(?<countryCode>\\d{1,2})[-.,\\s])?(?<areaCode>\\d{3})[-.,\\s]?(?<exchange>\\d{3})[-.,\\s]?(?<lineNumber>\\d{4})";

        Pattern pat = Pattern.compile(regex);

        Matcher mat = pat.matcher(phoneNumber);

        if(mat.matches()){
            System.out.format("Country code: %s\n",mat.group("countryCode"));
            System.out.format("Area code: %s\n",mat.group("areaCode"));
            System.out.format("Exchange: %s\n",mat.group("exchange"));
            System.out.format("Line number: %s\n",mat.group("lineNumber"));
        }
    }
}
