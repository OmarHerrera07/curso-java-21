public class MathStuff {
    public static void main(String[] args) {
        System.out.println( calcAreaOfCircle(3) );
        System.out.println( calcPathVelocity(0.8,3) );
    }

    /**
     *
     * @param radius
     * @return
     */
    public static double calcAreaOfCircle(double radius){
        // A = PI * r^2
        return Math.PI * Math.pow(radius,2);

    }
    public static double calcPathVelocity(double radius, double period){
        double circumference = 2 * Math.PI * radius;
        return circumference / period;
    }
}
