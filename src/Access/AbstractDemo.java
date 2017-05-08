package Access;

abstract class Calculator2 {
	int left, right;

	public void setOprands(int left, int right) {
		this.left = left;
		this.right = right;
	}

	public abstract void sum();

	public abstract void avg();

	protected int _sum() {
		return this.left + this.right;

	}

	public void run() {
		sum();
		avg();
	}
}

class CalculatorDecoPlus extends Calculator2 {
	public void sum() {
		System.out.println("+ sum :" + _sum());
	}

	public void avg() {
		System.out.println("+ avg :" + _sum() / 2);
	}
}

class CalculatorDecoMinus extends Calculator2 {
	public void sum() {
		System.out.println("- sum :" + _sum());
	}

	public void avg() {
		System.out.println("- avg :" + _sum() / 2);
	}
}

public class AbstractDemo {
	public static void main(String[] args) {
		CalculatorDecoPlus c1 = new CalculatorDecoPlus();
		c1.setOprands(10, 20);
		c1.run();

		CalculatorDecoMinus c2 = new CalculatorDecoMinus();
		c2.setOprands(10, 20);
		c2.run();
	}

}