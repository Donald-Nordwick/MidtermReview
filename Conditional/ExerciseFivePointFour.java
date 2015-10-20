
import javax.swing.JOptionPane;
public class ExerciseFivePointFour {
	public static void main(String[]args){
		int i=0;
		String response1=null;
		String response2=null;
		do{
		int random = 1 + (int)(Math.random()*100);
		if (random <50){
			if (random < 10){
				response1="The number is less than 10. ";
			}
			else {
				response1 = "The number is less than 50 but greater than 10. ";
			}
		}
		else if (random >50){
			response1 = "The number is more than 50. ";
		}
		response2= response1 + "The number is "+ random+ ".";
		JOptionPane.showMessageDialog(null,response2);
		i++;
		}while (i<3);
	}
}
