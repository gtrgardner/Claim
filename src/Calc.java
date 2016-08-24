// Get user  to input Birth date mm/dd/yyyy
// Calculate age.
// Display "You are "?" years old.  DOB mm/dd/yyyy


import java.util.*;

public class Calc {

	public Calc(){
		
		int now = (int) Calendar.getInstance().get(1);
		int age;
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter day of birth: ");
		int day = sc.nextInt();
		System.out.println("Enter the month you were born in: ");
		int month = sc.nextInt();
		System.out.println("Enter year of birth: ");
		int birthYear =sc.nextInt();
		sc.close();
		
		age = now - birthYear;
		
		System.out.println("You are " + age + " years old. " + day +"/" + month+ "/" + birthYear);		
		System.out.println(now);
}
	
	
	
	public static void main(String[] args) {
		Calc c = new Calc();
	
		
		
	}

}
