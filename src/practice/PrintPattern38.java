/*Assignment 38 write a logic to print below pattern.
*
**
***
****
*/
package practice;

public class PrintPattern38 {
	public static void main(String[] args) {
		for(int i=1;i<=8;i++) {
			for(int j=1;j<=7-i;j++) {
				System.out.print(" & ");
			}
			System.out.println();
			
			
		}
	}
	
}


