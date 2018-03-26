import java.util.Arrays;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class CashNow {
		
		public static void main(String args[]) {
			
			String[] payKeywords = {"owe", "debt", "pay", "arrears", "send", "give", "borrow", "lend"};
			String [] info = new String[100];
			String[] words = new String [100];
			int count = 0;
			String amount = "";
			 String answer;
			
			boolean open = true;
			boolean pay = false;
			
			System.out.print("The text:");
			
			while (open) {
				 Scanner scan = new Scanner(System.in); 
				 String input = scan.nextLine();
				 words = input.split(" ");
				 info[count] = input;
				 count++;
				 
				 for (int k = 0; k < words.length; k++) {
					 for (int i=0;i<payKeywords.length;i++) {
						 if (words[k].equals(payKeywords[i])) {
							 pay = true;
						 }
					 }
						
					 if (words[k].charAt(0) == '$') {
						 amount = words[k];
					 }
				 }
				 
				 if(pay) {
					 answer = JOptionPane.showInputDialog("Would you like to send " + amount + "?");
					
					 if(answer.equals("yes")) {
						 JOptionPane.showMessageDialog(null, "Would you like to open the Scotiabank app?");
					 }
					
					 pay = false;
				 } 
			}	
		}
}
