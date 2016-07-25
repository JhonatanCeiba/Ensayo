package org.gradle;

import static org.junit.Assert.*;
import org.junit.Test;

public class Testeo {

	@Test
	public void test() {
		assertEquals(Principal.sumar(4, 5), 10);
	}
	
	@Test
	public void test11() {
		assertEquals(Principal.sumar(4,5), 9);
	}
	
	@Test
	public void test22() {
		assertEquals(Principal.sumar(4,5), 10);
	}


}
