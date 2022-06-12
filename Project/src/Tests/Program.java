package Tests;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;
import java.util.stream.Stream;
class MyThread implements Runnable {
    
    private boolean isActive;
      
    void disable(){
        isActive=false;
    }
      
    MyThread(){
       isActive = true;
    }
      
    public void run(){
    	while(!Thread.currentThread().isInterrupted()){
            
    	    
    	    try{
    	        Thread.sleep(100);
    	    }
    	    catch(InterruptedException e){
    	        System.out.println(Thread.currentThread().getName() + " has been interrupted");
    	             
    	        break;  // выход из цикла
    	    }
}
    }
}
      

class Program {
	
	public static void main(String[] args){
		System.out.println("Main thread started...");
		MyThread myThread = new MyThread();
		new Thread(myThread,"MyThread").start();
		System.out.println("myThread started...");
		try{
		Thread.sleep(1100);
		}
		catch(InterruptedException e){
		System.out.println("Thread has been interrupted");
		}
		System.out.println("Main thread finished...");
	}
	
}
