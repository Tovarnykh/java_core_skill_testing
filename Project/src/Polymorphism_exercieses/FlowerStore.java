package Polymorphism_exercieses;

import java.util.Random;

public class FlowerStore{
	
	static Random r = new Random();
	static int ts = r.nextInt(11);
	static int rs = r.nextInt(11);
	static int cs = r.nextInt(11);
	static Tulip[] tulips;
	static Rose[] roses; 
	static Chamomile[] chamomilies;
	static Flower[][] bouquet = new Flower[3][((ts+rs+cs)/3)+1];
	
	static {
		update();
	}
	
	
	private static int index = 0;
	private static int x=0;
	
	
	public static void main(String[] args) {
		
		for(int i = 0; i<ts-1; i++) {
			Tulip t = new Tulip();
			tulips[i] = t;
		}
		
		for(int i = 0; i<rs; i++) {
			Rose ros = new Rose();
			roses[i]=ros;
		}
		
		for(int i = 0; i<cs; i++) {
			Chamomile cha = new Chamomile();
			chamomilies[i] = cha;
		}
		
		display();
		sell(ts/2,rs/2,cs/2);
		display();
		sellSequence(ts,rs,cs);
		display();
		
		
	}
	static void sell(int t, int r, int c) {
		
		for(int i = 0; i< t;i++) {
			if(x==3) {
				x=0;
				index = index +1;

			}
			bouquet[x][index] = tulips[i];
			x++;
		}
		for(int i = 0; i< r;i++) {
			if(x==3) {
				x=0;
				index = index +1;

			}
			bouquet[x][index] = roses[i];
			x++;
		}
		for(int i = 0; i< c;i++) {
			if(x==3) {
				x=0;
				index = index +1;
			}
			bouquet[x][index] = chamomilies[i];
			x++;
			
		}
		if(x!=0) {
			index = index +1;
			x=0;}
		
		rs-=r;
		ts -= t;
		cs -= c;
		update();
	}
	
	static void sellSequence(int t, int r, int c) {
		if((t>ts) || (r>rs )|| (c>cs)) {
			System.out.print("error");
		}else {
		
		while((t+r+c)>0) {
			if(t>0) {
				
				if(x==3) {
					x=0;
					index = index +1;

				}
				bouquet[x][index] = tulips[0];
				t--;
				x++;
			}
			if(r>0) {
				if(x==3) {
					x=0;
					index = index +1;
				}
				bouquet[x][index] = roses[0];
				r--;
				x++;
			}
			if(c>0) {
				if(x==3) {
					x=0;
					index = index +1;
				}
				bouquet[x][index] = chamomilies[0];
				c--;
				x++;
			}
		}
		rs-=r;
		ts -= t;
		cs -= c;
		if(x!=0) {
			index = index +1;
			x=0;}
		update();
		
	}}
	
	static void update() {
		tulips = new Tulip[ts]; 
		chamomilies = new Chamomile[cs]; 
		roses = new Rose[rs];
	}
	
	static void display() {
		System.out.println("\nКоличество тюльпанов: "+ tulips.length);
		System.out.println("Количество роз: "+ roses.length);
		System.out.println("Количество ромашек: "+ chamomilies.length);
		System.out.println("Количество букетов продано: "+ index);
	}

}
