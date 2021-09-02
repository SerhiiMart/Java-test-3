package datatypes;
import java.util.Date;


public class Datatypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	////Simple datatypes
		byte theByte = -128;
		short theShort = -32768;
		int theInt = -2147483648;
		long theLong = -9223372036854775808L;
		float theFloat = -3.4028235F;
		double theDouble = -1.7976931348623157E+308;
		
		boolean theBoolean = true;
		char theSingleLetter = 'S';
		System.out.println(theDouble);
		
	////Complex datatypes
			Date date = new Date();
			System.out.println(date);

	}

}
