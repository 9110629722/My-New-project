package com.firstproject.org;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyClassTest {

	@Test
	public void test() {

			MyClass ob = new MyClass();
			assertEquals(9, ob.sum(3,6));
	}

}
