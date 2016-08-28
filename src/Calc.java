// Get user  to input Birth date mm/dd/yyyy
// Calculate age.
// Display "You are "?" years old.  DOB mm/dd/yyyy


import java.util.Scanner;
import java.util.Calendar;

public class Calc {
	
	static int now = (int) Calendar.getInstance().get(1);
	static int age;
	static int day;
	static int month;
	static int birthYear;
	
			
	
		public Calc(int age, int now, int day, int month, int birthYear){
			
			Calc.now = now;
			Calc.day = day;
			Calc.month = month;
			Calc.birthYear = birthYear;
			
			return;
			
		}
		
		public void calculateAge(){
			
			age=(now-birthYear);
			System.out.println("Your age is " + age + " " + day +"/" + month + "/" + birthYear);
		}
		
		public void userInput(){
			
			Scanner in = new Scanner(System.in);

	        System.out.print("Enter day of birth: ");
	        Calc.day  = (in.nextInt());
	        System.out.print("Enter month of birth: ");
	        Calc.month = (in.nextInt());
	        System.out.print("Enter year you were born: ");
	        Calc.birthYear = (in.nextInt());
		
		in.close();
			
			
		}
		
		public static void main(String[] args) {
			
			 Calc c = new Calc( age, now, day, month, birthYear);
			 c.userInput();
			 c.calculateAge();
			 
	}

		
}

	

