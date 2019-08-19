package exercicios;


public class contaSeg {
	/**
	 * You can write C code here or look at the examples.
	 * It will be translated as "demo/demo_translation.c".
	 * There are also translations of full programs below.
	 */
	public static void main(String[] args) {
	
		double days,hours,minutes,hoursTotal,minutesTotal,secondsTotal,seconds;
		
		days= 365;
		
		hours = 24;
		
		hoursTotal = days*hours;
		
		minutes = 60;
		seconds = 60;
		
		minutesTotal= hoursTotal*minutes;
		
		secondsTotal = minutesTotal*seconds;
		
		
		System.out.println(hoursTotal + "h");
		System.out.println(minutesTotal + "min");
		System.out.println(secondsTotal + "s");
			
			
			
			
	
}
	
}