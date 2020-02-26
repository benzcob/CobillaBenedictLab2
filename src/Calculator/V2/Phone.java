package Calculator.V2;

public class Phone extends Calculator{
	
	private String alarm;
	private String calendar;
	
	public Phone(int mode, double num1, double num2) {
		super(mode, num1, num2);
	}
	
	public String Alarm(String alarm) {	//setter
		return this.alarm = alarm;
	}
	public String Alarm() {				//getter
		return this.alarm;
	}
	
	public String Calendar(String calendar) {	//setter
		return this.calendar = calendar;
	}
	public String Calendar() {					//getter
		return this.calendar;
	}
}