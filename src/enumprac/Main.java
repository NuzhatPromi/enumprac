package enumprac;

public class Main {
	
		int employee_number;
		double hourly_rate;
		double hours_worked;
		
		void changeEmpNo(int en) {
			employee_number = en;
		}
		
		void changeHrRate(double hr) {
			hourly_rate = hr;
		}
		
		void changeHrWorked(double hw) {
			hours_worked = hw;
		}
		
		double calcPayment(double bonus) {
			double pay = hourly_rate * hours_worked + bonus;
			return pay;
		}
		
		void printStates() {
	         System.out.println("Employee Number: " +
	        		 employee_number + " Hourly Rate: " + 
	        		 hourly_rate + " Hours Worked: " + hours_worked + "\n");
	    }
	
	
	
	public static void main(String[] args) {
		//System.out.println("Hello");
		
		Main emp1 = new Main();
		Main emp2 = new Main();
		
		emp1.changeEmpNo(1005);
		emp1.changeHrRate(80);
		emp1.changeHrWorked(400.2);
		double monthly_payment1 = emp1.calcPayment(500);
		System.out.println("Monthly Payment: " + monthly_payment1);
		emp1.printStates();
		
		emp2.changeEmpNo(1046);
		emp2.changeHrRate(53);
		emp2.changeHrWorked(285.5);
		double monthly_payment2 = emp2.calcPayment(250);
		System.out.println("Monthly Payment: " + monthly_payment2);
		emp2.printStates();
		
		
		//Enum
		Color c1 = Color.RED; 
        System.out.println(c1);
        
        //Methods of enum
        
        Color arr[] = Color.values();
        
        for (Color color : arr) {
			System.out.println(color + " at index " + color.ordinal());
		}
        
        System.out.println(Color.valueOf("RED"));
			
	}
}
