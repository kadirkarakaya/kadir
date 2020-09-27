package assigment_3;

public class Question5 {
	
	public static void main(String[] args) {
		
		
		 int inputSeconds, hours, minutes, seconds;
		 
		 
	     inputSeconds=3695;
		 hours= (inputSeconds/3600);
		 minutes=(inputSeconds%3600)/60;
		 seconds=(inputSeconds-3660);
		 
		 System.out.println("inputSeconds is " + inputSeconds);
		 
		 
		 System.out.print( hours + " hours " + minutes + " minutes " + seconds + " seconds ");

}
}