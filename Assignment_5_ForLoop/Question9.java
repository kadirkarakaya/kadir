package Assignment_5_ForLoop;

public class Question9 {

	public static void main(String[] args) {
		 
      //Write a program for the following logic:
	//Print all the odd numbers in comma-separated form from 1 till the end (you may change it):
	//if end = 10, OUTPUT = 1, 3, 5, 7, 9
    //if end = 11, OUTPUT = 1, 3, 5, 7, 9, 11
    //You should use while loop and if-else statements. Note that, there should not be any comma after the last digit.
		
		 
		
			// TODO Auto-generated method stub
			int end=10;
			int i=1;
			while(i<=end) {
				if((end%2!=0 && i==end )|| (end%2==0 && i==(end-1))) {
					System.out.print(i);
				}else if (i%2!=0) {
					System.out.print(i + ", ");
					
					}
				i++;
				}
			}
		}

