package roman;

import org.junit.Assert;
import org.junit.Test;


public class RomanConverterTest {

	@Test
	public void convertI() {
		Assert.assertEquals(1, new RomanConverter().convert("I"));
	}
	
	@Test
	public void convertII() {
		Assert.assertEquals(2, new RomanConverter().convert("II"));
	}	

}
