package javatutorials;

class C {
	
	static int v = 10;
    
	void m() {
    	int v = 20;
        System.out.println(v);
    }
     
    }
 
public class ScopeDemo7 {

    public static void main(String[] args) {
        C c1 = new C();
        c1.m();
               
     //   System.out.println(v);
    }
     
}