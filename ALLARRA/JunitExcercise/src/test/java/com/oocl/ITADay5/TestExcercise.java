package com.oocl.ITADay5;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class TestExcercise {
	
	
	excercise1 e1 = new excercise1();

	@Test
	public void test1() {
		String[] exec1Expected = {"one","two","default"};
		assertArrayEquals("test", exec1Expected, e1.Excercise1());
	}
	@Test
	public void test2() {
		assertEquals(8, e1.Excercise2());
	}
	@Test
	public void test3() {
		assertEquals(e1.Excercise3A(), e1.Excercise3());				
		}
//		assertEquals(Execresult6, result6);
//		System.out.println(result6.size() + "\t*" + Execresult6.size());
	@Test
	public void test4() {
		assertEquals(4, e1.Excercise4());		
	}
	@Test
	public void test5() {
	}
	@Test
	public void test6() {
		ArrayList<Excercise6> Execresult6 = new ArrayList<Excercise6>();
		ArrayList<Excercise6> result6 = new ArrayList<Excercise6>();
		
		Execresult6 = Listsetter();
		result6 = e1.Excercise6();
		for(int x = 0;x<4;x++) {
			Excercise6 temp1 = new Excercise6();
			Excercise6 temp2 = new Excercise6();
			temp1 = Execresult6.get(x);
			temp2 = result6.get(x);
			assertEquals(temp1.GetList(),temp2.GetList());
		}
	}
	@Test
	public void test7() {
		assertEquals(5, e1.Excercise7(60));
		//e1.Excercise7(60);
	}

	@Test
	public void test10a() {
		assertEquals(10.5, e1.Excercise10a(),0);	
	}
	@Test
	public void test10b() {
		assertEquals(600, e1.Excercise10b(),0);	
	}
	@Test
	public void test10c() {
		ArrayList<String> result = new ArrayList<String>();
		result.add("\n*\n*\n*\n*\n*");
		assertEquals(result,e1.Excercise10c());
	}
	@Test
	public void test10d(){
		
		ArrayList<String> x = new ArrayList<String>();
		x.add("true, false, false");
		x.add("true, true, false");
		x.add("false, true, false");
		x.add("false, false, false");
	
		assertEquals(x,e1.Excercise10d());
		
	}
	@Test
	public void test10e() {
		assertEquals("cartoonnn", e1.Excercise10e());
	}
	public ArrayList<Excercise6> Listsetter() {
		ArrayList<Excercise6> results = new ArrayList<Excercise6>();
		 Excercise6 x = new Excercise6();
		 int n = 4;
		 for(float i=1;i<=n; i++) {
			 x = new Excercise6();
			 for(float j=1; j<=n; j++) {
				 float temp = (float)((float)(i/n) + (float)(j/n));
				 x.setX(temp);
				 System.out.print(temp +"\t");
			}
			 System.out.println();
			 results.add(x);
			 x = null;
	}
		return results;
}
}
