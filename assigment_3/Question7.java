package assigment_3;

public class Question7 {

	public static void main(String[] args) {
 
		int changeInQuarters = ((100-costAsInt)/25);
    	int changeInDimes = ((100-costAsInt-(changeInQuarters*25))/10);
    	int changeInNickles = ((100-costAsInt-(changeInQuarters*25) - (changeInDimes*10))/5);
    	int changeInPennies = ((100-costAsInt-(changeInQuarters*25) - (changeInDimes*10))%5);
		

	}

}
