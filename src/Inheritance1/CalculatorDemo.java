package Inheritance1;

class Calculator{
    int left, right;
    int third = 0;   //값이 들어올수 도 있고,안 들어올수도 있기때문에 초기화
      
    public void setOprands(int left, int right){
        System.out.println("setOprands(int left, int right)");
        
        this.left = left;
        this.right = right;
    }
     
    public void setOprands(int left, int right, int third){
    	this.setOprands(left, right);
    	
        System.out.println("setOprands(int left, int right, int third)");
        this.left = left;
        this.right = right;
        this.third = third;
    }
     
    public void sum(){
        System.out.println(this.left+this.right+this.third);
    }
      
    public void avg(){
        System.out.println((this.left+this.right+this.third)/3);
    }
}
  
public class CalculatorDemo {
      
    public static void main(String[] args) {
          
        Calculator c1 = new Calculator();
        c1.setOprands(10, 20);
        c1.sum();       
        c1.avg();
        c1.setOprands(10, 20, 30);
        c1.sum();       
        c1.avg();
         
    }
  
}