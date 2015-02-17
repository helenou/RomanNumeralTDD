package roman;

public class RomanConverter {

	public int convert(String roman) {
		
		if("I".equals(roman)){
			return 1;	
		} else if("II".equals(roman)){
			return 2;
		} else {
			throw new IllegalArgumentException();
		}
	}//end convert()

}//end class

	