package Inheritance;

class MultiplicationableCalculator extends Calculator {
    public void multiplication() {
        System.out.println(this.left * this.right);
    }
}
 
public class CalculatorDemo2 {
 
    public static void main(String[] args) {
 
        MultiplicationableCalculator c1 = new MultiplicationableCalculator();
        c1.setOprands(10, 20);
        c1.sum();
        c1.avg();
        c1.multiplication();
        

        Calculator c2 = new Calculator();
         c2.setOprands(10, 20);
         c2.sum();
         c2.avg();
         //c2.multiplication();
    }
 
}