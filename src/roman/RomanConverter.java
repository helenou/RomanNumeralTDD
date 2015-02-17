package roman;

import java.util.Hashtable;

public class RomanConverter {

	private Hashtable<Character, Integer> symbols = new Hashtable<Character, Integer>(){{
		put('I', 1);
		put('V', 5);
	}};

	public int convert(String roman) {
		int sum=0;
		int current;
		int previous;
		
		for (int index=0; index < roman.length(); index++){
			if(doesRomanCharacterExistInSymbols(roman, index)){

				current = getIntValue(roman, index);
				previous = (index == 0)? 0 : getIntValue(roman, index-1);
				if(previous >= current){
					sum += current;
				}else{
					sum -= previous;
					sum += (current - previous);
				}
			}
			else{		
				throw new IllegalArgumentException("Illegal roman character " +roman.toCharArray()[index]);
			}//end if
		}//end for loop
		
		return sum;
	}//end convert()

	private boolean doesRomanCharacterExistInSymbols(String roman, int index) {
		return symbols.containsKey(roman.toCharArray()[index]);
	}

	private Integer getIntValue(String roman, int index) {
		return symbols.get(roman.toCharArray()[index]);
	}

}//end class

	