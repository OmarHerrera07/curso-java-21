public class LearnStrings {


    public static void main(String[] args) {
        String myText = "apple";
        String myNewText = myText.substring(0,1).toUpperCase().concat(myText.substring(1));
        System.out.println(myNewText);

    }

//    public static int compareToIgnoreCase(String text1, String text2){
//        String lowerText1 = text1.toLowerCase();
//        String lowerText2 = text2.toLowerCase();
//        return lowerText1.compareToIgnoreCase(lowerText2);
//    }
}
