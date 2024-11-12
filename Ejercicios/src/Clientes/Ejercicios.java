package Clientes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicios {

    public static void main(String[] args) {

//        String name = "Stark";
//        String regex = "[D,d,B,b,L,l,S,s]t?ark";

//        String name = "Abracadabra";
//        String regex = "A(b|g)racada\\1ra";

        String name = "omar.herrera13@uabc.edu.mx";
        String regex = "[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,}";
        //Agracadagra
        Pattern pattern = Pattern.compile(regex);

        Matcher mat = pattern.matcher(name);

        System.out.println(mat.matches());
    }
}
