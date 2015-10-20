import java.util.Scanner;
public class ExerciseTwoPtOne {
	public static void main(String[]args){
		Scanner input= new Scanner(System.in);
		System.out.println("Please enter your name");
		String name = input.nextLine();
		String message = "Hello, my name is " + name;
		System.out.println(message);
	}
}
