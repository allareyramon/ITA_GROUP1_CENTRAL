package com.oocl.mvnTest;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.*;

public class StringHelperTest {

	StringHelper helper;
	
	@Before
	public void before() {
		helper = new StringHelper();
	}
	@Test
	public void testTruncateAInFirst2Positions() {
		assertEquals("CD", helper.truncateAInFirst2Positions("AACD"));
	}

//	@Test
	public void testAreFirstAndLastTwoCharactersTheSame() {
		fail("Not yet implemented");
	}
	
	@After
	public void testFinished(){
		System.out.println("A test is finished");
	}
	
	@AfterClass
	public static void allTestsDone() {
		System.out.println("All tests finished");
	}
	

}
