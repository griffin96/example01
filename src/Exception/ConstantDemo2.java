package Exception;

import constant2.Company;
import constant2.Fruit;

class Fruit{
    public static final Fruit APPLE  = new Fruit();
    public static final Fruit PEACH  = new Fruit();
    public static final Fruit BANANA = new Fruit();
}
class Company{
    public static final Company GOOGLE = new Company();
    public static final Company APPLE = new Company();
    public static final Company ORACLE = new Company();
}
 
public class ConstantDemo2 {
     
    public static void main(String[] args) {
        if(Fruit.APPLE == Fruit.PEACH){
            System.out.println("과일 애플과 과일 복숭아가 같다.");
        } else {
        	System.out.println("과일 애플과 과일 복숙아가  다르다.");
        }
    }
}
