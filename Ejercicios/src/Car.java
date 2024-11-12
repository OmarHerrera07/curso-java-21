public class Car {
    private Integer year;
    private String model;

    public Car(Integer year, String model){
        this.year = year;
        this.model = model;
    }

    @Override
    public String toString(){
        return "{ year: " + this.year + ", model: " + this.model + "}";
    }
}
