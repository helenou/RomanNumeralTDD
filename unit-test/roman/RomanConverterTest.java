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

	@Test
	public void convertV() {
		Assert.assertEquals(5, new RomanConverter().convert("V"));
	}
	
	@Test
	public void convertVI() {
		Assert.assertEquals(6, new RomanConverter().convert("VI"));
	}
	
	@Test
	public void convertIV() {
		Assert.assertEquals(4, new RomanConverter().convert("IV"));
	}
	
	@Test
	public void convertVIII() {
		Assert.assertEquals(8, new RomanConverter().convert("VIII"));
	}
	
	@Test
	public void convertX() {
		Assert.assertEquals(10, new RomanConverter().convert("X"));
	}
	
	@Test
	public void convertIX() {
		Assert.assertEquals(9, new RomanConverter().convert("IX"));
	}
	
	@Test
	public void convertXII() {
		Assert.assertEquals(12, new RomanConverter().convert("XII"));
	}
	
	@Test
	public void convertXIV() {
		Assert.assertEquals(14, new RomanConverter().convert("XIV"));
	}

	@Test
	public void convertXVI() {
		Assert.assertEquals(16, new RomanConverter().convert("XVI"));
	}
	
	@Test
	public void convertXVIII() {
		Assert.assertEquals(18, new RomanConverter().convert("XVIII"));
	}
	
	@Test
	public void convertXIX() {
		Assert.assertEquals(19, new RomanConverter().convert("XIX"));
	}
	
	@Test
	public void convertXX() {
		Assert.assertEquals(20, new RomanConverter().convert("XX"));
	}

}
