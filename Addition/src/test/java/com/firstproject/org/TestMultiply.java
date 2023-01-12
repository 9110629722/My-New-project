package com.firstproject.org;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestMultiply {

	@Test
	public void testMultiply() {
		int result = Multiply.multiply(10,4);
		assertEquals(result,40);

}
}
