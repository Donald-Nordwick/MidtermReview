import javax.swing.JOptionPane;
public class ExerciseSixPtThree {
	public static void main(String[]args){
		int i=0;
		String response1 = null;
		String response2 = null;
		do{
			int random = 1 + (int)(Math.random()*100);
			
			int answer = Integer.parseInt(JOptionPane.showInputDialog("Guess a number between 1 and 100"));
			if ((answer <1)||(answer >100)){
				System.out.println("Please enter a number that is between 1 and 100");	
			}
			else if (answer == random){
				response1 = "You have guessed correctly";
				
			}
			else if (answer < random){
				response1= "Your answer is too low. ";
			}
			else {
				response1= "Your answer is too high. ";
			}
			response2 = response1 +"The computers number is "+ random + " while your number is "+ answer +".";
			JOptionPane.showMessageDialog(null,response2);
			i++;
		}while (i<3);
	}
}
