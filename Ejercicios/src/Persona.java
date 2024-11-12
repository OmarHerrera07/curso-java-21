public class Persona {
    // 1.  Modele  una  Persona  con  un  nombre  y  apellido  y  asegúrese  de  que  incluso  si  el  nombre  es
    // ingresado  todo  en  minúsculas,  se  almacenará  todo  en  mayúsculas.

    private String nombre;
    private String apellido;

    public Persona(String nombre, String apellido) {
        this.nombre = nombre.toUpperCase();
        this.apellido = apellido.toUpperCase();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre.toUpperCase();
    }

    public String remplazarGato(String frase){
        return frase.replaceAll("gato","perro");
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido.toUpperCase();
    }

    public String quitarEspacios(String palabra){
        return  palabra.trim();
    }

    public String printAdress(String adress){
        String[] adressArray = adress.split(",");
        System.out.println(adressArray.length);
        return adress;
    }



    public static void main(String[] args) {
        String name = "Omar Herrera";
        System.out.println(STR."Me llamo \{name}");
    }

    public static String parseAreaCode(String phoneNumber){
        int index = phoneNumber.indexOf(")") + 1;
        return phoneNumber.substring(0,index);
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
}
