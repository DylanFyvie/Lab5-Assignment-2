import java.util.Scanner;
/**
 * 
 */

/**
 * @author d.fyvie
 *
 */
/**

*

* Name: Dylan Fyvie

* Teacher: Mr.Hardman

* Assignment #5, Program #B

* Date Last Modified: 11/29/2016

*

*/

public class Mike_Keane {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userInput = new Scanner(System.in);
		
		int userElement;
		int index = 0;
		int numberOfNums = 0;
		int values[] = new int [10];
		
		for(int i = 0; i < values.length; i ++){
			
		System.out.println("Please Enter A Interger: ");
		values[i] = userInput.nextInt();
		
		}
		
		System.out.println("What Interger Do You Want To Search?");
		userElement = userInput.nextInt();
		
		for(int i = 0; i< values.length; i++){
			if(values[i] == userElement){
				numberOfNums ++;
			}
		}
		
		System.out.println("Your Element has been entered " + numberOfNums + " Times");
		
		
		userInput.close();
	}

}
