package ConditionOperator;

public class LoginDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String id = args[0];
		String password = args[1];

		if (id.equals("egoing") && password.equals("111111")) {   //true�϶� true
			System.out.println("right");
		} else {
			System.out.println("wrong");
		}
	}
}
