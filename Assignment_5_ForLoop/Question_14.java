package Assignment_5_ForLoop;

public class Question_14 {

	public static void main(String[] args) {
		/*      Write nested loop to draw this pattern

		##
		#  #
		#   #
		#    #
		#     #
		#      #
		#        #                                */

for (int i = 1; i <= 7; i++) {
			
			System.out.print("#");
			
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			
			System.out.println("#");
		}
		
		
		
		
		
		
		
	}

}
