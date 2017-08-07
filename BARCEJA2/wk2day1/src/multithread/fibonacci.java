package multithread;

import java.util.*;
import java.lang.Integer;

class fibonacciThread implements Generator<Integer>, Runnable{
	
	private int count;
	private final int n;
	
	public fibonacciThread(int n) { this.n = n;}
	public Integer next() {return fib(count++);}
	private int fib(int n) {
		if (n<2) return 1;
		return fib(n-2) + fib(n-1);
	}
	
	public void run() {
		Integer[] seq = new Integer[n];
		for(int i = 0; i<n; i++) {
			seq[i] = next();
		}
		System.out.println("Seq of: " + n + ": " + Arrays.toString(seq));
		
		List<Integer> a = new ArrayList<Integer>();
	}
}

public class fibonacci{
	public static void main(String[] args) {
		
		for (int i = 1; i<= 10; i++) {
			new Thread(new fibonacciThread(i)).start();
		}
	}
	
}