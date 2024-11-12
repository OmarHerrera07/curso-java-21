public class Main {
    public static void main(String[] args) {


//        String[] diasSemana = {"Domingo","Lunes","Martes","Miercoles","Jueves","Viernes","Sabado"};
//        System.out.println("Número de elementos: "+diasSemana.length);
//        System.out.println("Cuarto día: "+diasSemana[3]);
//
//        int[] numeros = {1,2,3,4,5,6,7,8,9,10};
//
//        String[] tablero = {"o","x","o","x","o","x","o","x","o","x"} ;
//        System.out.println("Turno: " + tablero[4]);
//
//        funcion("omar","Herrera");
//
//        Car car = new Car(2009,"modleo");
//        System.out.println(car);

        String adress = "12345  Big  St.,  Alphabet  City,  CA  90210";

        char[] chars = adress.toCharArray();
        System.out.println(chars[32]);

        System.out.println("1. Número del eidificio: " + building(adress));
        System.out.println("2. La calle: " + street(adress));
        System.out.println("3. Ciudad: " + city(adress));
        System.out.println("4. Estado: " + state(adress));
        System.out.println("5. Código postal: " + cp(adress));



    }
    public static String building(String adress){
        int index = adress.indexOf(" ") + 1;
        return adress.substring(0,index).strip();
    }

    public static String street(String adress){
        int startIndex = adress.indexOf(" ") + 1;
        int finalIndex = adress.indexOf(",");
        return adress.substring(startIndex,finalIndex).strip();
    }

    public static String city(String adress){
        int startIndex = adress.indexOf(",") + 1;
        int finalIndex = adress.lastIndexOf(",");
        return adress.substring(startIndex,finalIndex).strip();
    }

    public static String state(String adress){
        int startIndex = adress.lastIndexOf(",")+1;
        int finalIndex = adress.lastIndexOf(" ");
        return adress.substring(startIndex,finalIndex).strip();
    }

    public static String cp(String adress){
        int startIndex = adress.lastIndexOf(" ")+1;
        return adress.substring(startIndex).strip();
    }

    public static String parseExchange(String phoneNumber){
        int index = phoneNumber.indexOf(" ") +  1;
        int index2 = phoneNumber.indexOf("-");
        return phoneNumber.substring(index,index2);
    }

    public static String parseLineNumber(String phoneNumber){
        int index = phoneNumber.indexOf("-") + 1;
        return phoneNumber.substring(index);
    }

    public static void funcion(String... parametros){
        System.out.println(parametros[0]);
    }

}