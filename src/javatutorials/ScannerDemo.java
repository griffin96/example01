package javatutorials;

import java.util.Scanner;

public class ScannerDemo {

	/**
	     * <B>History</B>
	     * <ul>
	     * <li>Date : 2017. 4. 19.
	     * <li>Developer : sjyim
	     * <li>���⿡ Method ���� ������ ����Ѵ�. 
	     * </ul>
	     * <ul>
	     * <li>Date : 2017. 4. 19.
	     * <li>Developer : sjyim
	     * <li>�ʱ⿡ Method�� �����ϴ� ��� ���� ul~/ul �±׸� �����Ͽ� �Ʒ��� �ٿ� �ְ� ������ ���뿡 ���� ����� �Ѵ�.
	     * </ul>
	     *  alt shift J
	     * @param args
	     */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc = new Scanner(System.in); 
       // ����ڰ� Ű���带 ���� �Է��� ���� �˾Ƴ��� ���
       
       int i = sc.nextInt();
       System.out.println(i*1000);
       sc.close();
	}

}
