package exerciseGenerics;

import java.util.Scanner;


public class holderOfThreeObjects<T> {
	private T a, b, c;
	
	public T getA() {
		return a;
	}

	public void setA(T a) {
		this.a = a;
	}

	public T getB() {
		return b;
	}

	public void setB(T b) {
		this.b = b;
	}

	public T getC() {
		return c;
	}

	public void setC(T c) {
		this.c = c;
	}

	holderOfThreeObjects(T aVar, T bVar, T cVar){
		this.a = aVar;
		this.b = bVar;
		this.c = cVar;
	}
	
	public static void main(String[] args) {
		
		holderOfThreeObjects<Object> h = new holderOfThreeObjects<Object>("A",1,1234.6);
		
		//Exercise1
		System.out.println(h.getA());
		System.out.println(h.getB());
		System.out.println(h.getC());
		
		//Exercise 2
		h.setA(null);
		try {
			if(h.getA().equals(h.getB())) {
				
			}
		}catch(NullPointerException a){
			System.out.println("Caught Exception: " + a.toString());
		}
		
		Thrower2 thr = new Thrower2();
		try {
			thr.f();
		} catch (newTypeException1 e) {
			System.out.println(e);
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (newTypeException2 e) {
			System.out.println(e);
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (newTypeException3 e) {
			System.out.println(e);
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
class exBase extends Exception{}
class newTypeException1 extends exBase{ }
class newTypeException2 extends exBase{ }
class newTypeException3 extends exBase{ }

class Thrower2{
	void f() throws newTypeException1,newTypeException2,newTypeException3{
		throw new newTypeException1();
	}
	
}

