package com.firstproject.org;

import static org.junit.Assert.*;

import org.junit.Test;

public class testDivision {

	@SuppressWarnings("deprecation")
	@Test
	public void Testdivision() {
		int result = Division.division(10,4);
		assertEquals(result,0.4);

		
	}

}
