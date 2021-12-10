/*
 * Converting String to integer or any primitive type is called parsing.
 * A sting can be converted with the help of parse method present in the corresponidng wrapper class.
 */
public class Wrppro7 {

	public static void main(String[] args)
	{
	    String str = "true";
	    boolean a= Boolean.parseBoolean(str);
	    System.out.println(!a);

	}

}
