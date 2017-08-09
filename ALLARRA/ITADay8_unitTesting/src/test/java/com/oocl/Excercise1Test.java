package com.oocl;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
@RunWith(Parameterized.class)
public class Excercise1Test {

	public Excercise1Test(String input, String expectedOutput) {
		super();
		this.input = input;
		this.expectedOutput = expectedOutput;
	}
	
	Excercise1 e1;
	String input;
	String expectedOutput;
	@Before
	public void before() {
		System.out.println("check");
		e1 = new Excercise1();
	}
	
	@Test
	public void testTrnc() {
		assertEquals("CD", e1.trnc("AACD"));
		//
		//assertEquals(expected, actual);
	}

//	@Test
//	public void testAreFirstAndLastTwiCharactersTheSame() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testExcercise6() {
//		fail("Not yet implemented");
//	}

//	@Test (timeout = 23)
//	public void test1() {
//		for(int i=0; i<1000000; i++)
//			Arrays.sort(new int[]{i,i-1,i+1});
//	}

	@Test
	public void TestArraySort_RandomArray() {
		int[] numbers = {12,3,4,1};
		int[] expected = {1,3,4,12};
		Arrays.sort(numbers);
		assertArrayEquals(expected, numbers);
	}
	
	@Test(expected = NullPointerException.class)
	public void test() {
		int[] x = null;
		Arrays.sort(x);
	}
	
	@Parameters
	public static Collection<String[]> testconditions(){
		String a[][] = {{"AACD", "CD"},{"ACD","CD"},{"AAACD","ACD"}};
		return (Arrays.asList(a));
	}
	@Test
	public void test4() {
		System.out.println(input);
		assertEquals(expectedOutput, e1.trnc(input));
	}
	
	
	

}
