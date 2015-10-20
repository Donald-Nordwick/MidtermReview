import java.util.Scanner;
import javax.swing.JOptionPane;
public class ExerciseTwoPtTwo {
	public static void main(String[]args){
		Scanner input= new Scanner(System.in);
		String name = JOptionPane.showInputDialog("What is your name?");
		String message= String.format("Hello, my name is %s.",name);
		JOptionPane.showMessageDialog(null,message);
	}
}
