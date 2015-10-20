import javax.swing.JOptionPane;
public class ExerciseSixPtOne {
	public static void main(String[]args){
		int i=0;
		do{
			int random = 1 + (int)(Math.random()*100);
			int answer = Integer.parseInt(JOptionPane.showInputDialog("Guess a number between 1 and 100"));
			if ((answer <1)||(answer >100)){
				System.out.println("Please enter a number that is between 1 and 100");	
			}
			else if (answer == random){
				JOptionPane.showMessageDialog(null,"You have guessed correctly");
				
			}
			String response = "The computers number is "+ random + " while your number is "+ answer +".";
			JOptionPane.showMessageDialog(null,response);
			i++;
		}while (i<3);
	}
}
