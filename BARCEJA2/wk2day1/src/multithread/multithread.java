package multithread;

class runner extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		//super.run();
		
		for(int i = 0; i <= 10; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class multithread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		runner rn1 = new runner();
		rn1.start();
		
		runner rn2 = new runner();
		rn2.start();
		

	}

}
