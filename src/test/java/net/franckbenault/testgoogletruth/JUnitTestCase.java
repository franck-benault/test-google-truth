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
		Truth.assertThat(ints1).named("int tab").isEqualTo(ints2);
		
	}
	
	@Test
	public void t02aAssertEquals() {
		String val1 = "String";
		String val2 = "String";
		
		Truth.assertThat(val1).isEqualTo(val2);
		Truth.assertThat(val1).named("value 1").isEqualTo(val2);

	}
	
	@Test
	public void t02bAssertNotEquals() {
		String val1 = "String1";
		String val2 = "String2";
		
		Truth.assertThat(val1).isNotEqualTo(val2);
		Truth.assertThat(val1).named("first value").isNotEqualTo(val2);
	}
	
	@Test
	public void t03aAssertTrue() {
		
		boolean exp = true;
		
		Truth.assertThat(exp).isTrue();
		Truth.assertThat(exp).named("expression").isTrue();
	}
	
	@Test
	public void t03bAssertFalse() {
		boolean exp = false;
		
		Truth.assertThat(exp).isFalse();
		Truth.assertThat(exp).named("expression").isFalse();
	}
	
	@Test
	public void t04aAssertNull() {
		
		Object obj = null;
				
		Truth.assertThat(obj).isNull();
		Truth.assertThat(obj).named("my object ").isNull();
	}
	
	@Test
	public void t04bAssertNotNull() {
		Object obj = new Object();
		
		Truth.assertThat(obj).isNotNull();
		Truth.assertThat(obj).named("my object").isNotNull();
	}
	
	@Test
	public void t05aAssertSame() {
		Object obj = new Object();
		
		Truth.assertThat(obj).isSameAs(obj);
		Truth.assertThat(obj).named("my object").isSameAs(obj);
	}
	
	@Test
	public void t05bAssertNotSame() {
		Object obj1 = new Object();
		Object obj2 = new Object();
		
		Truth.assertThat(obj1).isNotSameAs(obj2);
		Truth.assertThat(obj1).named("my object ").isNotSameAs(obj2);
		

	}
}
