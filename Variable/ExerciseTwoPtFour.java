import java.util.Scanner;
import javax.swing.JOptionPane;
public class ExerciseTwoPtFour {
	public static void main(String[]args){
		Scanner input= new Scanner(System.in);
		String name = JOptionPane.showInputDialog("What is your name?");
		String message= String.format("Hello, my name is %s.",name);
		JOptionPane.showMessageDialog(null,message);
	}
}
