import java.lang.Math;

public class Calculator {
    private double total;
    public Calculator(){
        total = 0;
    }

    public void add(double num){
        total = total + num;
        System.out.println("Running Total: " + total);
    }
    public void subtract(double num){
        total = total - num;
        System.out.println("Running Total: " + total);
    }
    public void divide(double num){
        total = total/num;
        System.out.println("Running Total: " + total);
    }
    public void multiply(double num){
        total = total*num;
        System.out.println("Running Total: " + total);
    }
    public void square(){
        total = total*total;
        System.out.println("Running Total: " + total);
    }
    public void squareRoot(){
        total = Math.sqrt(total);
        System.out.println("Running Total: " + total);
    }
    public void clear(){
        total = 0;
    }
}
