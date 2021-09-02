package datatypes;
import java.util.Date;


public class Datatypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	////Simple datatypes
		byte theByte = -128;
		short theShort = -32_768;
		int theInt = -2_147_483_648;
		long theLong = -9_223_372_036_854_775_808L;
		float theFloat = -3.4028235F;
		double theDouble = -1.7976931348623157E+308;
		
		boolean theBoolean = true;
		char theSingleLetter = 'S';
		System.out.println(theByte);
		System.out.println(theShort);
		System.out.println(theInt);
		System.out.println(theLong);
		System.out.println(theFloat);
		System.out.println(theDouble);
		System.out.println(theBoolean);
		System.out.println(theSingleLetter);
		
	////Complex datatypes
			Date date = new Date();
			System.out.println(date);
			
	}

}
