package controller;

public class ThreadId extends Thread{
	public static void main(String[] args) {
		ThreadId thread = new ThreadId();
		thread.start();
	}//Thread principal;
		// TODO Auto-generated method stub
	
	Thread t = Thread.currentThread();
	public void run() {
		for (int i = 0; i < 10; i++){
			System.out.println("Thread running: "+i);
		try {
			Thread.sleep(Math.round(Math.random()*1000));
		}catch(InterruptedException e) {
			System.err.println("Thread interrupted!");
		}
		}
		}
	
	Runnable MeuRunnable = new Runnable() {
	void sleep() {
	//Segunda Thread;
	Thread t1 = new Thread(new Runnable());
	 t1.start(); //executa uma nova thread
	//a.run() executa a mesma thread
	sleep();
	 System.out.println(t.getName());
	 
	 Thread t2 = new Thread(new Runnable());
	 t2.start();
	 sleep();
	 System.out.println(t.getName());
	 //nova thread
	 
	 Thread t3 = new Thread(new Runnable());
	 t3.start();
	 sleep();
	 System.out.println(t.getName());
	 // nova thread
	 
	 Thread t4 = new Thread(new Runnable());
	 t4.start();
	 sleep();
	 System.out.println(t.getName());
	 
}
	public class Thread implements Runnable {
		public void run() {
			System.out.println("Thread inicilizada");
		}
		public static void main(String args[]) {
			Thread t = new Thread(obj);
			t.start();
}
	}
}
}

	