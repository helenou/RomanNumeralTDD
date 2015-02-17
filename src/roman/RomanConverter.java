package roman;

import java.util.Hashtable;

public class RomanConverter {

	private Hashtable<Character, Integer> symbols = new Hashtable<Character, Integer>(){{
		put('I', 1);
		put('V', 5);
	}};

	public int convert(String roman) {
		int sum=0;
		for (char ch: roman.toCharArray()){
			if(symbols.containsKey(ch)){
				sum += symbols.get(ch);
			}else{		
				throw new IllegalArgumentException("Illegal roman character " +ch);
			}//end if
		}//end for loop
		
		return sum;
	}//end convert()

}//end class

	