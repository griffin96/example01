package Condition;

public class SwitchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("switch(1)");
		switch (3) { //break���� ������, 2�� �����, 2 ���� ����, 3���� ������, 3���� ����
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
