package Threads_and_Lambda;

class MyThread implements Runnable{
	
    private boolean isActive;
    void disable(){
        isActive=false;
    }
      
    MyThread(){
       isActive = true;
    }
      
	
	public void run() {
		while(isActive) {
			System.out.println(Thread.currentThread().getName()+"is running");
			try {
				Thread.currentThread().sleep(5000);
			} catch (InterruptedException e) {
				System.out.println("Thread got sick and took a vacation");
			}
		}
	}
	
	static void info(Thread t) {
		System.out.println("------------------\nThread name: "+t.getName()+"\nThread id: "+t.getId());
		if(t.getId()==1) {
			System.out.println("Main thread");
		}else {
			System.out.println("Not Main thread");

		}
		System.out.println("------------------");
	}
}

public class Exercise {
	public static void main(String[] args) {
		Thread myT = new Thread(new MyThread(), "First");
		myT.start();
		MyThread.info(Thread.currentThread());
		MyThread.info(myT);

	}
}
