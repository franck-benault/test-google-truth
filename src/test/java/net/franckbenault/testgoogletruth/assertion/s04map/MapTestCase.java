package net.franckbenault.testgoogletruth.assertion.s04map;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import com.google.common.truth.Truth;

public class MapTestCase {

	@Test
	public void testContainsEntry() {
		
		Map<Integer,String> months = new HashMap<Integer,String>();
		months.put(3,"March");
		Truth.assertThat(months).containsEntry(3,"March");
	}

}
