package Task05_Calculator;

public class Main {
    public static void main(String[] args) {
        Calculator cal=new SimpleCalculator();
        int sum= cal.add(10,20);
        System.out.println("Sum of a & b is :"+(sum));
        int diff=cal.subtract(20,10);
        System.out.println("Subtract of a & b is :"+(diff));
        int mult=cal.multiply(10,20);
        System.out.println("Multiplication of a & b is :"+(mult));
        int div=cal.divide(20,2);
        System.out.println("Division of a & b is :"+(div));

    }
}
