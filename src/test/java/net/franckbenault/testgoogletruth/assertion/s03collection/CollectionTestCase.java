package net.franckbenault.testgoogletruth.assertion.s03collection;

import org.junit.Test;

import com.google.common.collect.ImmutableSet;
import com.google.common.truth.Truth;

public class CollectionTestCase {

	@Test
	public void testContains() {
		
		ImmutableSet<String> colors = ImmutableSet.of("red", "green", "blue");
		Truth.assertThat(colors).contains("green");
	}

}
