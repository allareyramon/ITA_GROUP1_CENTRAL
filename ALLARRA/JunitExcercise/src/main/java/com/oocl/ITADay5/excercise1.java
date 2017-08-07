package com.oocl.ITADay5;

import java.util.ArrayList;

public class excercise1 {

	public String[] Excercise1(){
		int i=1;
		
		String[] stringreturn =new String[3];
		ArrayList<String> ret = new ArrayList<String>();
		for (int j=0; j<5;j=j+2)
		{
		i= (i*i) +j;
		}
		switch (i)
		{
		case 3:
		System.out.println ("zero");
		ret.add("zero");
		break;
		case 13:
		System.out.println ("one");
		ret.add("one");
		stringreturn[0] = "one";
		case 175:
		System.out.println ("two");
		ret.add("two");
		stringreturn[1] = "two";
		default:
		System.out.println ("default");
		stringreturn[2] = "default";
		ret.add("default");
		}
		
		return stringreturn;	
	}
	
	
	public int Excercise2() {
		
		int n;
		int F_0=1,F_1=1;
		int F_n=0;
		System.out.println ("Enter the number");
		n = 5;
		for (int i=1; i<n; i++)
		{
		F_n=F_0+F_1;
		F_0=F_1;
		F_1=F_n;
		}
		System.out.println (F_n);
		return F_n;
	}
	
	public int Excercise3() {
		int inner=2, outer=2;
		int result=0;
		
		int i=0;
		
		while(i<outer){
			int j=0;
			while(j<inner){
				
				result = (result*result)+1;
				j++;
		};
			i++;
		};
		System.out.println(result);
		return result;
	}
	public int Excercise3A() {
		int inner=2, outer=2;
		int result=0;
		for (int i=0; i<outer; i++)
		{
			for (int j=0; j<inner; j++)
			{
				result = (result*result)+1;
			}
		}
		System.out.println(result);
		return result;
	}
	
	public int Excercise4() {
		int x = 3;
		int y = 10;
		int ct = 0;
		while (x < y)
		{System.out.println ("Hello");
		x = x + 1;
		y = y - 1;
		ct++;
		}
		System.out.println(ct);
		return ct;
	}
	

		public int Excercise7(int integer_value) {
			// Declare Local Variables
			boolean done = false; 
			int count = 1; int current = integer_value + 2;
			while (! done) { current = current / count; if (current % 3 == 0) done = true; else if (current < 1) done = true; else count += 1; System.out.println(current); }
			System.out.println (count); return count;
			} // method compute_value
		
		
		public double Excercise10a() {
			double count;
			int limit;
			count = 9.0;
			limit = 43/4;
			for (; count <= limit; count = count + 0.5)
			{
			System.out.println ("in for:" + count);
			}
			System.out.println ("after for" + count);
			return count;
		}
		
		public static void Excercise10C(){
			int value = 5;
			int value2 = 1;
			while (value2 < 4)
			{
				for (;value >= value2; value--){
				System.out.println("*");
				}
			value2++;
			}
		}
		
		static int value = 10;
		public int Excercise10b()
		{
			System.out.println("Main before p1: " + value);
			value = p1(value);
			System.out.println("Main before p2: " + value);
			value = p2(value);
			System.out.println("Main at the end: " + value);
			System.out.println("-----");
			int value = 30;
			System.out.println("Main before p1: " + value);
			value = p1(value);
			System.out.println("Main before p2: " + value);
			value = p2(value);
			System.out.println("Main at the end: " + value);
			return excercise1.value;
		}
		static int p1(int input)
		{
		value = input * value;
		System.out.println("In p1: " + value);
		return value;
		}
		static int p2(int input)
		{
		int value = 5;
		value = input / value;
		System.out.println("In p2: " + value);
		return value;
		}
		
		public ArrayList<String> Excercise10c() {
			int value = 5;
			int value2 = 1;
			String temp= new String();
			ArrayList<String> AL = new ArrayList<String>();
			while (value2 < 4)
			{
				
			for (;value >= value2; value--)
			{
				temp += "\n*";
				System.out.println("*");
				
			}
			
			value2++;
			}
			AL.add(temp);
			
			return AL;
		}
		
		static boolean a,b,c;
		public ArrayList<String> Excercise10d() {
		
		ArrayList<String>results = new ArrayList<String>();
		a = true;
		b = false;
		c = false;
		System.out.println (a + ", " + b + ", " + c);
		results.add(a + ", " + b + ", " + c);
		do
		{
		if (b == c)
		b = a;
		else if (a == c)
		b = c;
		else
		a = c;
		results.add(a + ", " + b + ", " + c);
		System.out.println(a + ", " + b + ", " + c);
		
		}
		while ( a || b || c);

		return results;
		}
		public String Excercise10e()
		{
			int one = 3/* type a value here */;
			int two = 2/* type a value here */;
			int three = 1/* type a value here */;
			String x = new String();
			do
			{
			one++;
			System.out.print("cart");
			x+="cart";
			}
			while ( one < 3);
			for (int i = 0; i < two; i++)
			{
			System.out.print("o");
			x+="o";
			}
			while (true)
			{
			three++;
			if (three == 5)
			{
			break;
			
			}
			System.out.print("n");
			x+="n";
			}
			return x;
		}
		
		
		public ArrayList<Excercise6> Excercise6() {
			
			 ArrayList<Excercise6> result = new ArrayList<Excercise6>();
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
				 result.add(x);
				 x = null;
			 }
			
//			 x = new Excercise6();
//			 x = result.get(3);
//			 System.out.print(x.getSpecific(3));
//			 for(int i = 0; i<result.size();i++) {
//				 x = new Excercise6();
//				 x = result.get(i);
//				 for(int j=0; j<result.size(); j++) {
//					 System.out.print(x.getSpecific(j)+"\t");
//				 }
//				 x= null;
//				 System.out.println();
//			 }
//			 
			return result;		
		}
	
}

class Excercise6{
	private ArrayList <Float> x = new ArrayList<Float>();

	public ArrayList<Float> GetList() {
		return x;
	}
	public void SetList(ArrayList<Float> z){
		x = z;
	}

	public void setX(float num) {
		x.add(num);
	}
	public float getSpecific(int pos) {
		return x.get(pos);
	}	
}

