package com.oocl;

public class DeadLock {

	public static Object Lock1 = new Object();
	public static Object Lock2 = new Object();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadDemo1 T1=new ThreadDemo1();
		ThreadDemo2 T2 = new ThreadDemo2();
		T1.start();
		T2.start();
		
	}

	private static class ThreadDemo1 extends Thread {

		@Override
		public void run() {
			// TODO Auto-generated method stub
			synchronized (Lock1) {
				System.out.println("Thread1: holding lock1...");
				try {
					Thread.sleep(100);
				}catch (InterruptedException e) {
					
				}
				System.out.println("Thread1: waiting for lock2...");
				synchronized (Lock2) {
					System.out.println("Thread1: holding lock 1&2...");
				}
			}
			

		}
	}
	private static class ThreadDemo2 extends Thread{
		@Override
		public void run() {
			// TODO Auto-generated method stub
			synchronized (Lock2) {
				System.out.println("Thread2: holding lock2...");
				try {
					Thread.sleep(100);
				}catch (InterruptedException e) {
					
				}
				System.out.println("Thread2: waiting for lock1...");
				synchronized (Lock2) {
					System.out.println("Thread2: holding lock 1&2...");
				}
			}
		}
	}
	

}
