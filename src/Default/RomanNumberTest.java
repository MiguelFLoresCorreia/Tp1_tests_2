package Default;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RomanNumberTest {

	@Test
	void testConvert_1_Into_I() {
		RomanNumber roman = new RomanNumber();
		
		assertEquals("I", roman.convert(1));
	}
	
	@Test
	void testConvert_2_Into_II() {
		RomanNumber roman = new RomanNumber();
		
		assertEquals("II", roman.convert(2));
	}
	
	@Test
	void testConvert_3_Into_III() {
		RomanNumber roman = new RomanNumber();
		
		assertEquals("III", roman.convert(3));
	}
	
	@Test
	void testConvert_10_Into_X() {
		RomanNumber roman = new RomanNumber();
		
		assertEquals("X", roman.convert(10));
	}
	
	@Test
	void testConvert_20_Into_XX() {
		RomanNumber roman = new RomanNumber();
		
		assertEquals("XX", roman.convert(20));
	}

	@Test
	void testConvert_30_Into_XXX() {
		RomanNumber roman = new RomanNumber();
		
		assertEquals("XXX", roman.convert(30));
	}
}
