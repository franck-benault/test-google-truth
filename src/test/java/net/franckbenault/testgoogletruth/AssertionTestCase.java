package net.franckbenault.testgoogletruth;

import org.junit.Test;

import com.google.common.truth.Truth;

public class AssertionTestCase {

	@Test
	public void test() {
		int val =6;
		Truth.assertThat(val).isGreaterThan(5);
	}

}
