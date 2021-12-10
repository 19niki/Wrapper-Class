/*
 * The formal argument of a method is an object type then it can accept any primitive and non - primitive type.
 * ----------------------------------------------------------
 * | Primitive type | Wrapper class |    Boxing             |
 * ----------------------------------------------------------
 * | byte           |  Byte         |    Byte.valueOf()     |
 * | short          |  Short        |    Short.valueOf()    |
 * | int            |  Integer      |    Integer.valueOf()  |
 * | long           |  Long         |    Long.valueOf()     |
 * | float          |  Float        |    Float.valueOf()    |
 * | double         |  Double       |    Double.valueOf()   |
 * | char           | Character     |    Char.valueOf()     |
 * ----------------------------------------------------------
 */
public class Wprpro4 {

	static void print(Object o)
	{
		System.out.println("object");
	}
	static void print(Integer I)
	{
		System.out.println("Integer");
	}
	static void print(int a)
	{
		System.out.println("int");
	}
	static void print(long l)
	{
		System.out.println("Long");
	}
	
	public static void main(String[] args)
	{
		print(10); //int
	   	print(Integer.valueOf(10)); //Integer
	   	print("hi"); //Object
	   	print(null); //Integer
	}

}
