package constant2;

enum Fruit {
	APPLE("red"), PEACH("pink"), BANANA("yellow");
	private String color;

	Fruit(String color) {
		System.out.println("Call Constructor " + this);
		this.color = color;
	}

	String getColor() {
		return this.color;
	}
}

enum Company {
	GOOGLE, APPLE, ORACLE;
}

public class ConstantDemo3 {

	public static void main(String[] args) {

		/*
		 * if(Fruit.APPLE == Company.APPLE){ System.out.println(
		 * "과일 애플과 회사 애플이 같다."); }
		 */
		Fruit type = Fruit.APPLE;
		switch (type) {
		case APPLE:
			System.out.println(57 + " kcal");
			break;
		case PEACH:
			System.out.println(34 + " kcal");
			break;
		case BANANA:
			System.out.println(93 + " kcal");
			break;
		}
		for (Fruit f : Fruit.values()) {
			System.out.println(f + ", " + f.getColor());

		}
	}
}