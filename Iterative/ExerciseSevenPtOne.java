import javax.swing.JOptionPane;
import java.util.Scanner;
public class ExerciseSevenPtOne {
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		int i=0;
		int b=0;
		do{
			int random = 1 + (int)(Math.random()*100);
			int answer = Integer.parseInt(JOptionPane.showInputDialog("Guess a number between 1 and 100"));
			if ((answer <1)||(answer >100)){
				JOptionPane.showMessageDialog(null,"Please enter a number that is between 1 and 100");	
			}
			else if (answer == random){
				JOptionPane.showMessageDialog(null,"You have guessed correctly");
				
			}
			String response = "The computers number is "+ random + " while your number is "+ answer +".";
			JOptionPane.showMessageDialog(null,response);
			i++;
			if (i==3){
				b = Integer.parseInt(JOptionPane.showInputDialog("Would you like to continue?\nPress 1 for yes"));
				if (b==1){
					i--;
				}
			}
		}while (i<3);
	}
}
