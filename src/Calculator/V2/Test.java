package Calculator.V2;

public class Test {

	public static void main(String[] args) {
		
		Calculator calc = new Calculator(1, 12, 13);
		Phone phone = new Phone(1, 13 ,13);
		
		System.out.println("==== Calculator ====");
		calc.calculator();
		System.out.println("==== Phone ====");
		phone.calculator();
		
		phone.Alarm("Alarm: 	4:00AM");
		phone.Calendar("Date: 	February 27, 2020");
		
		System.out.println(phone.Alarm());
		System.out.println(phone.Calendar());
	}
}