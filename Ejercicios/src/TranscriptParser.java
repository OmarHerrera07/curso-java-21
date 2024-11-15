import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TranscriptParser {
    public static void main(String[] args) {
        String transcipt = """
                Student Number:	1234598872			Grade:		11
                Birthdate:		01/02/2000			Gender:	M
                State ID:		8923827123
                                
                Cumulative GPA (Weighted)		3.82
                Cumulative GPA (Unweighted)	3.46
                """;

        String regex = """
                Student\\sNumber:\\s(?<studentNum>\\d{10}).* #Grab student number
                Grade:\\s+(?<grade>\\d{1,2}).* #Grab the grade
                Birthdate:\\s+(?<birthMonth>\\d{1,2})/(?<birthDay>\\d{1,2})/(?<birthYear>\\d{4}).* #Grab birthdate
                Gender:\\s+(?<gender>\\w+)\\b.* #Grab the gender                       
                State\\sID:\\s+(?<stateId>\\d+)\\b.*? #Grab the state ID                       
                Weighted\\)\\s+(?<weightedGPA>[\\d\\.]+)\\b.* #Grab the weighted GPA                       
                Unweighted\\)\\s+(?<Unweighted>[\\d\\.]+)\\b.* #Grab the unweighted GPA                       
                """;
        Pattern pat = Pattern.compile(regex,Pattern.DOTALL | Pattern.COMMENTS);
        Matcher mat = pat.matcher(transcipt);

        if(mat.matches()){
            System.out.println(mat.group("studentNum"));
            System.out.println(mat.group("grade"));
            System.out.println(mat.group("birthMonth"));
            System.out.println(mat.group("birthDay"));
            System.out.println(mat.group("birthYear"));
            System.out.println(mat.group("gender"));
            System.out.println(mat.group("stateId"));
            System.out.println(mat.group("weightedGPA"));
            System.out.println(mat.group("Unweighted"));
        }
    }
}
