//Sean Fallon
//COMP-171
//Fall-19
//Lab 11

public class useTheDateClass {

	public static void main(String[] args) {
		java.util.Date date = new java.util.Date();
		
		for (long i = 10000; i <= 1e11; i*= 10 ) {
			date.setTime(i);
			System.out.println(date.toString());
		}
	}
}
