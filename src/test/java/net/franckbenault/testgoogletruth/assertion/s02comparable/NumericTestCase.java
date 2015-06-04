package net.franckbenault.testgoogletruth.assertion.s02comparable;

import org.junit.Test;

import com.google.common.truth.Truth;

public class NumericTestCase {

	@Test
	public void testGreaterThan() {
		int val =6;
		Truth.assertThat(val).isGreaterThan(5);
	}

	
	@Test
	public void testAtLeast() {
		int val =6;
		Truth.assertThat(val).isAtLeast(6);
	}
}
