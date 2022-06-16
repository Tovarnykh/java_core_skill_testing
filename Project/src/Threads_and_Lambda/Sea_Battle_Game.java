package Threads_and_Lambda;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Exchanger;

enum ShipType{
	CRUISER, DESTROYER, FRIGATE, CORVETTE
}

class Ship implements Runnable{
	
	private int hp;
	
	private final int damage;
	
	private final int coolDawn;
	
	private ShipType typeOfShip;
	
	private double accuracy;
	
	
	Random r = new Random();
	
	Ship(ShipType type, int hp, int damage, int coolDawn, double accuracy){
		this.typeOfShip=type;
		this.hp=hp;
		this.damage=damage;
		this.coolDawn=coolDawn;
		this.accuracy=accuracy;
	}

	@Override
	public void run(){
		int id = Integer.parseInt(Thread.currentThread().getName());
			try {
				System.out.println("----------------------------\n"+typeOfShip+" ¹"+Thread.currentThread().getName()+" is ready for battle!");
				Sea_Battle_Game.BATTLEFIELD_ARRIVING.countDown();
				Sea_Battle_Game.BATTLEFIELD_ARRIVING.await();
				
				
				while(Sea_Battle_Game.healthpoints.get(id)>0) {
					
					synchronized(Sea_Battle_Game.ships) {
						synchronized(Sea_Battle_Game.healthpoints) {
							
					if(Sea_Battle_Game.ships.size()==1) {
						System.out.println("----------------------------\n\n"+typeOfShip+" ¹"+Thread.currentThread().getName()+" has won!");
						Sea_Battle_Game.healthpoints.put(id, 0);
					}else {
					
					int tmp = findPrey();
					Sea_Battle_Game.healthpoints.put(tmp, Sea_Battle_Game.healthpoints.get(tmp)-damage);
					System.out.println("----------------------------\n"+typeOfShip+" ¹"+Thread.currentThread().getName()+" is attacking ship ¹"+tmp+"\nNow it`s HP is - "+Sea_Battle_Game.healthpoints.get(tmp));
					if(Sea_Battle_Game.healthpoints.get(tmp)==0)
						Sea_Battle_Game.ships.remove(tmp);
					Thread.sleep(coolDawn);
						}
					}
					}
				}
				Sea_Battle_Game.healthpoints.remove(id);
				} catch (InterruptedException e) {
				System.out.println(typeOfShip+" ¹"+Thread.currentThread().getName()+" have got a riot on board!");
					}
	}
	
	private int findPrey() {
		int id = Integer.parseInt(Thread.currentThread().getName());
		int prey = r.nextInt(Sea_Battle_Game.n);
		if(Sea_Battle_Game.ships.containsKey(prey) && (prey!=id)) {
		return prey;
		}else {
			return findPrey();
		}
	}
	
}

public class Sea_Battle_Game {

    static CountDownLatch BATTLEFIELD_ARRIVING= null;

    static HashMap<Integer, Integer> healthpoints= new HashMap<>();;
	
	static Random r = new Random();
	
	static HashMap<Integer, Thread> ships = new HashMap<>();
	
	static int n = r.nextInt(5, 10);
	
	public static void main(String[] args) throws InterruptedException {
	
		
		BATTLEFIELD_ARRIVING = new CountDownLatch(n+1);
		
		for(int i=0; i<n; i++) {
			Thread t = new Thread(new Ship(ShipType.CORVETTE, 10, 2, 1000, 0.4), i+"");
			healthpoints.put(i, 10);
			t.start();
			ships.put(i, t);
		}
		
		while(BATTLEFIELD_ARRIVING.getCount()>1)
			Thread.currentThread().sleep(100);
		System.out.println("\nBattle has started!");
		Sea_Battle_Game.BATTLEFIELD_ARRIVING.countDown();
		
	}
}
