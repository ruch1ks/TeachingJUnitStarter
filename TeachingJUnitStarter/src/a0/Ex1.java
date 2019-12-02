package a0;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class Ex1 {

	/*
	 * 1. Write the names of the tests that passed: {}
	 *    Write the names of the tests that failed: {}
	 *    Write the names of the tests that error'ed: {}
	 *    
	 * 2. Write at least three more tests using assertNull, assertNotNull, and assertArrayEquals
	 * 		- At least one test using each method must pass
	 * 		- Be sure to include @Test annotations on the tests you want to run
	 * 
	 * 3. Add or change a failure message in any failing test
	 */
	@Test
	void testEquals() {
		int a = 0;
		int b = 0;
		
		//should pass
		assertEquals(a, b, "this message won't show");
	}
	
	@Test
	void testNotEquals() {
		int a = 0;
		int b = 0;
		
		//should fail		
		assertNotEquals(a, b, "this message will show");
	}
	
	@Test
	void testTrue() {
		boolean test = true;
		
		//should pass
		assertTrue(test);
	}
	
	@Test
	void testFalse() {
		boolean test = true;
		
		//should pass
		assertFalse(test);
	}
	
	@Test 
	void testEqual2() {
		String a = null;
		String b = "aaa";
		
		assertEquals(a.length(), b.length(), "will this message show?");
	}
}