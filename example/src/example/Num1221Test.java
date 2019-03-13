package example;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Num1221Test {
	Num1221 test=new Num1221();
	@Before
	public void setUp() throws Exception {
		System.out.println("≤‚ ‘÷Æ«∞");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("≤‚ ‘Ω· ¯");
	}

	@Test
	public void testChu10() {
     //∂œ—‘
		boolean result=test.chu10(10,2);
		assertEquals(0,result);
	}

	@Test
	public void testChu7() {
		boolean result=test.chu10(21,7);
		assertEquals(false,result);
	}

}
