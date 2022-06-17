package Threads_and_Lambda;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.Semaphore;

class BookWorm implements Runnable{
	
	Semaphore sem;
	int id;
	Random r = new Random();
	
	BookWorm(Semaphore sem, int id){
		this.sem=sem;
		this.id=id;
	}
	
	@Override
	public void run() {
		try {
		System.out.println("BookWorm ¹"+id+" came to library enterence");
		if(sem.tryAcquire()==false) {
			System.out.println("BookWorm ¹"+id+" is waiting near enterence");
				sem.acquire();
			} 
		System.out.println("BookWorm ¹"+id+" entered the library");
		Thread.currentThread().sleep(200);
		System.out.println("BookWorm ¹"+id+" is reading book");
		Thread.currentThread().sleep(r.nextInt(300,3000));
		System.out.println("BookWorm ¹"+id+" going out of the library");
		sem.release();
		}
		catch (InterruptedException e) {
			System.out.println("Fire in building!!!");
		}
		
	}
	
}

public class Library {

	public static void main(String[] args) {
		System.out.print("Enter the number of people: ");
		Scanner sc = new Scanner(System.in);
		int peopleCount = Integer.parseInt(sc.nextLine());
		System.out.print("Enter the number of maximal amount of people that can be in the library: ");
		int maxAmount = Integer.parseInt(sc.nextLine());
		sc.close();
		Semaphore sem = new Semaphore(maxAmount);
		for(int i =0; i<peopleCount;i++) {
			new Thread(new BookWorm(sem, i)).start();
		}
	}

}
