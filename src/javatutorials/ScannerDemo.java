package javatutorials;

import java.util.Scanner;

public class ScannerDemo {

	/**
	     * <B>History</B>
	     * <ul>
	     * <li>Date : 2017. 4. 19.
	     * <li>Developer : sjyim
	     * <li>여기에 Method 관련 설명을 기록한다. 
	     * </ul>
	     * <ul>
	     * <li>Date : 2017. 4. 19.
	     * <li>Developer : sjyim
	     * <li>초기에 Method를 수정하는 경우 위의 ul~/ul 태그를 복사하여 아래에 붙여 넣고 수정된 내용에 대한 기록을 한다.
	     * </ul>
	     *  alt shift J
	     * @param args
	     */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc = new Scanner(System.in); 
       // 사용자가 키보드를 통해 입력한 값을 알아내는 기능
       
       int i = sc.nextInt();
       System.out.println(i*1000);
       sc.close();
	}

}
