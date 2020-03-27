package Maven.Junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StringManipulationTest {
    /*
     * TODO list for my feature
     * 
     */
	@Test
	void test1chars() {
		StringManipulation a=new StringManipulation();
		String result=a.manipulate("ABCD");
		assertEquals("BCD",result);
	}
	@Test
	void test2chars() {
		StringManipulation a=new StringManipulation();
		String result=a.manipulate("AACD");
		assertEquals("CD",result);
	}
	@Test
	void test3chars() {
		StringManipulation a=new StringManipulation();
		String result=a.manipulate("BACD");
		assertEquals("BCD",result);
	}
	@Test
	void test4chars() {
		StringManipulation a=new StringManipulation();
		String result=a.manipulate("BBAA");
		assertEquals("BBAA",result);
	}
	@Test
	void test5chars() {
		StringManipulation a=new StringManipulation();
		String result=a.manipulate("AABAA");
		assertEquals("B",result);
	}
}
