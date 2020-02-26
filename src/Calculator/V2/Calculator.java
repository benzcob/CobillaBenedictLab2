package Calculator.V2;

public class Calculator {
	
	private int mode;
	private double num1;
	private double num2;
	private double num;
	
	public Calculator(int mode, double num1, double num2) {
		this.mode = mode;
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public void calculator() {
		System.out.println("1 = Addition \t\t3 = Multiplication \n2 = Subtraction \t4 = Division\n");
		switch(mode) {
		case 1: System.out.println("Addition: " + this.num1 + " + " + this.num2);
				num = this.num1+this.num2;
				System.out.println("= " + num + "\n");
				break;
		case 2: System.out.println("Subtraction: " + this.num1 + " - " + this.num2);
				num = this.num1-this.num2;
				System.out.println("= " + num + "\n");
				break;
		case 3: System.out.println("Multiplication: " + this.num1 + " x " + this.num2);
				num = this.num1*this.num2;
				System.out.println("= " + num + "\n");
				break;
		case 4: System.out.println("Division: " + this.num1 + " ÷ " + this.num2);
				num = this.num1/this.num2;
				System.out.println("= " + num + "\n");
				break;
		default: System.out.println("Error");
				break;
		}	
	}
}
