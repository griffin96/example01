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
            System.out.println("���� ���ð� ���� �����ư� ����.");
        } else {
        	System.out.println("���� ���ð� ���� �����ư�  �ٸ���.");
        }
    }
}
