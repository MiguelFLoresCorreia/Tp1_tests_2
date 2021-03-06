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

	@Test
	void testConvert_11_Into_XI() {
		RomanNumber roman = new RomanNumber();

		assertEquals("XI", roman.convert(11));
	}

	@Test
	void testConvert_5_Into_V() {
		RomanNumber roman = new RomanNumber();

		assertEquals("V", roman.convert(5));
	}

	@Test
	void testConvert_4_Into_IV() {
		RomanNumber roman = new RomanNumber();

		assertEquals("IV", roman.convert(4));
	}

	@Test
	void testConvert_9_Into_IX() {
		RomanNumber roman = new RomanNumber();

		assertEquals("IX", roman.convert(9));
	}

	@Test
	void testConvert_50_Into_L() {
		RomanNumber roman = new RomanNumber();

		assertEquals("L", roman.convert(50));
	}

	@Test
	void testConvert_40_Into_XL() {
		RomanNumber roman = new RomanNumber();

		assertEquals("XL", roman.convert(40));
	}

	@Test
	void testConvert_100_Into_C() {
		RomanNumber roman = new RomanNumber();

		assertEquals("C", roman.convert(100));
	}

	@Test
	void testConvert_90_Into_XC() {
		RomanNumber roman = new RomanNumber();

		assertEquals("XC", roman.convert(90));
	}
	
	@Test
	void testConvert_99_Into_XC() {
		RomanNumber roman = new RomanNumber();

		assertEquals("XCIX", roman.convert(99));
	}
	
	@Test
	void testConvert_1000_Into_M() {
		RomanNumber roman = new RomanNumber();

		assertEquals("M", roman.convert(1000));
	}
	
	@Test
	void testConvert_500_Into_D() {
		RomanNumber roman = new RomanNumber();

		assertEquals("D", roman.convert(500));
	}
	
	@Test
	void testConvert_400_Into_CD() {
		RomanNumber roman = new RomanNumber();

		assertEquals("CD", roman.convert(400));
	}
	
	@Test
	void testConvert_900_Into_CM() {
		RomanNumber roman = new RomanNumber();

		assertEquals("CM", roman.convert(900));
	}
	
	@Test
	void testConvert_3000_Into_MMM() {
		RomanNumber roman = new RomanNumber();

		assertEquals("MMM", roman.convert(3000));
	}
	
	@Test
	void testConvert_3999_Into_MMMCMXCIX() {
		RomanNumber roman = new RomanNumber();

		assertEquals("MMMCMXCIX", roman.convert(3999));
	}
	
	@Test
	void testTryToConvert_4000() {
		RomanNumber roman = new RomanNumber();

		assertEquals("error : out of limit", roman.convert(4000));
	}
	
	@Test
	void testTryToConvert_0() {
		RomanNumber roman = new RomanNumber();

		assertEquals("error : not allowed", roman.convert(0));
	}
	
	@Test
	void testTryToConvertNegativeNumber() {
		RomanNumber roman = new RomanNumber();

		assertEquals("error : not allowed", roman.convert(-5));
	}
}
