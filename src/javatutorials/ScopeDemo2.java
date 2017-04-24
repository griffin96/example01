package javatutorials;

public class ScopeDemo2 {
    
	static int i;
     
    static void a() {
       i = 0;
    }
 
    public static void main(String[] args) {
        for (i = 0; i < 5; i++) {    // 이미 선넌된 변수를 사용한다.
            a();
            System.out.println(i);
        }
    }
 
}