package ConditionOperator;

public class LoginDemo4 {

	public class LoginDemo2 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			String id = args[0];
			String password = args[1];

			if (id.equals("egoing")|| id.equals("k8805") || id.equals("soriagi")) 
				&& password.equals("111111")){  
				System.out.println("right");
			} else {
				System.out.println("wrong");
			}
		}
	}
	}
