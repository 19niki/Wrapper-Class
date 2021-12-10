/*
 *  Boxing:
 *  - The process of converting primitive type to non - primitive type is called as the Boxing
 *  - Every wrapper class we have a static valueOf() method which is used to perform boxing
 *  - valueOf() must be called using the class name because it is a static method
 *           Integer.valueOf(10) 
 * 
 */
public class Wprpro2 
{
static void print(int i)
{
	System.out.println(i);
}
static void print(Integer i)
{
System.out.println(i);	
}
	public static void main(String[] args) 
	{
        print(10);
        print(Integer.valueOf(89));

	}

}
