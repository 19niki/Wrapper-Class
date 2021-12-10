/* What is wrapper class?
 * 
 * Java is not 100% oop language because the values as Integer char and boolen stored in the Primitive data type
 * In java we have the wrapper classes for each primitive data type such that the value can be stored in the object.
 * 
 * slno  Primitive type       Wrapper class
 * 1.    byte                 Byte
 * 2.    short                Short
 * 3.    int                  Int
 * 4.    long                 Long
 * 5.    float                Float
 * 6.    double               Double
 * 7.    char                 Char
 * 8.    boolean              Boolean
 * 
 * Wrapper class are used to store the type of primitive data type into objects
 * Every wrapper class is the final class
 * Every wrapper class implemets the comparable and seriziable interface
 * In every wrapper class object class methods toString(),Equals and hashcode() method are overriden.
 * 
 */
public class Wprpro1 {

	public static void main(String[] args) 
	{
		// Using int
		int i =55;
		System.out.println(i);
		//System.out.println(i.toString()); //cte
		
		// Using Integer
		
		Integer j = 25; //boxing
		Integer k= i;
		System.out.println(j);
		System.out.println(k);
		System.out.println(j.toString());
		
		

	}

}
