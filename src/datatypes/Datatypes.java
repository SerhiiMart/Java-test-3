package datatypes;



import java.time.LocalDate;
import java.util.Date;



public class Datatypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	////Primitive datatypes
//		byte theByte = -128;
//		short theShort = -32_768;
//		int theInt = -2_147_483_648;
//		long theLong = -9_223_372_036_854_775_808L;
//		float theFloat = -3.4028235F;
//		double theDouble = -1.7976931348623157E+308;
//		
//		boolean theBoolean = true;
//		char theSingleLetter = 'S';
//		
//		System.out.println(theByte);
//		System.out.println(theShort);
//		System.out.println(theInt);
//		System.out.println(theLong);
//		System.out.println(theFloat);
//		System.out.println(theDouble);
//		System.out.println(theBoolean);
//		System.out.println(theSingleLetter);
		
	//// Class String type
		
		String name = new String("Serhii");		
//		System.out.println(name.toUpperCase());	
//		System.out.println(name.toLowerCase());	
//		System.out.println(name.charAt(3));	
//		System.out.println(name.contains("r"));	
//		System.out.println(name.equals("Alex"));	
		
		String lastname = "Lamost";
		String fullName = name.concat(" ").concat(lastname);
		System.out.println(fullName);
		
		String fullName1 = name + " " + lastname;
		System.out.println(fullName1);
		
	////  Reference Types
		
		LocalDate now = LocalDate.now();
		System.out.println(now);
		
	////prim and ref difference
//		int a = 20;
//		int b = a;
//		a = 350;
//		System.out.println("a=" + a + ", " + "b=" + b);
//		
//		Person alex = new Person("Alex");
//		Person amber = alex;
//		
//		
//		System.out.println("Before change of alexPerson : " + alex.name + ", " + amber.name);
//		alex.name = "Alexandra";
//		System.out.println("After change of alexPerson : " + alex.name + ", " + amber.name);
		
	////Complex datatypes
			Date date = new Date();
			System.out.println(date);
			
	}
	//Ref type / Object
	static class Person {
		String name;
		
		Person(String name) {
			this.name = name;
		}
	}

}
