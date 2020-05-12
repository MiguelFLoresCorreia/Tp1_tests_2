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

}
