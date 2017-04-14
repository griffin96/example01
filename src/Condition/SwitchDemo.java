package Condition;

public class SwitchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("switch(1)");
		switch (3) { //break문이 없으면, 2로 변경시, 2 이하 실행, 3으로 벽녁잇, 3이하 실행
		case 1:
			System.out.println("one");
			break;
		case 2:
			System.out.println("two");
			break;
		case 3:
			System.out.println("three");
			break;

		default:
			System.out.println("default");
		}

	}

}
