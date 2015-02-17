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
			if(symbols.containsKey(roman.toCharArray()[index])){

				current = symbols.get(roman.toCharArray()[index]);
				previous = (index == 0)? 0 : symbols.get(roman.toCharArray()[index-1]);
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

}//end class

	