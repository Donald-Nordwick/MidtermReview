import javax.swing.JOptionPane;
public class ExerciseFivePtThree {
	public static void main(String[]args){
		int i=0;
		do{
		int random = 1 + (int)(Math.random()*100);
		JOptionPane.showMessageDialog(null,random);
		i++;
		}while (i<3);
	}
}
