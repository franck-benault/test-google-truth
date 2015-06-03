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
		
		Truth.assertThat("String").isEqualTo("String");

	}
	
	@Test
	public void t02bAssertNotEquals() {
		
		Truth.assertThat("String1").isNotEqualTo("String2");

	}
	

	//assertTrue / assertFalse
	//assertNull / assertNotNull
	//assertSame /assertNotSame
}
