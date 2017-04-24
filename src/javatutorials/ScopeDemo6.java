package javatutorials;

public class ScopeDemo6 {

	//static int i = 5;    정적인 유효범위, 동적인 유효범위
 
    static void a() {
        int i = 10;
        b();
    }
 
    static void b() {
    	int i = 30;
        System.out.println(i);
    }
 
    public static void main(String[] args) {
        a();
    }
 
}