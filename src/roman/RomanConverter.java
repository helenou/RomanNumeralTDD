package roman;

public class RomanConverter {

	public int convert(String roman) {
		int sum=0;
		for (char ch: roman.toCharArray()){
			if(ch=='I'){
				sum +=1;
			}else {
				throw new IllegalArgumentException("Illegal roman character " +ch);
			}//end if
		}//end for loop
		
		return sum;
	}//end convert()

}//end class

	