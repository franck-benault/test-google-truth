package net.franckbenault.testgoogletruth;

import org.junit.Test;

import com.google.common.truth.Truth;

public class JUnitTestCase {

	//01assertArrayEquals
	
	@Test
	public void t01AssertArrayEquals() {
		int[] ints1 = {1,3};
		int[] ints2 = {1,3};
		Truth.assertThat(ints1).isEqualTo(ints2);
	}
	
	@Test
	public void t02aAssertEquals() {
		String val1 = "String";
		String val2 = "String";
		Truth.assertThat(val1).isEqualTo(val2);

	}
	
	@Test
	public void t02bAssertNotEquals() {
		String val1 = "String1";
		String val2 = "String2";
		Truth.assertThat(val1).isNotEqualTo(val2);;

	}
	

	//assertTrue / assertFalse
	//assertNull / assertNotNull
	//assertSame /assertNotSame
}
