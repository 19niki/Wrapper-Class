import java.util.Scanner;

/*
 * Any primitive type can be converted into a string using String.valueOf() method
 */
public class Wrppro6 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int n =s.nextInt();
		String str = String.valueOf(n);
		System.out.println(str);

	}

}
