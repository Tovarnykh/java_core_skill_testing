package Polymorphism_exercieses;

import java.util.Random;

public class FlowerStore{
	
	static int pocket=0;
	
	static Random r = new Random();
	//r.nextInt(11)
	static int ts = 5;
	static int rs = 3;
	static int cs = 1;
	
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
		display();
		sell(2,2,0);
		display();
		sellSequence(3, 1,1);
		display();
		displayBouquet();
		FlowersLoader.read();
	}
	static void sell(int t, int r, int c) {
		
		for(int i = 0; i< t;i++) {
			if(x==3) {
				x=0;
				index = index +1;

			}
			bouquet[x][index] = tulips[i];
			pocket+=45;
			x++;
		}
		for(int i = 0; i< r;i++) {
			if(x==3) {
				x=0;
				index = index +1;
				
			}
			bouquet[x][index] = roses[i];
			pocket+=100;
			x++;
		}
		for(int i = 0; i< c;i++) {
			if(x==3) {
				x=0;
				index = index +1;
			}
			bouquet[x][index] = chamomilies[i];
			pocket+=70;
			x++;
			
		}
		if(x!=0) {
			index = index +1;
			x=0;}
		
		
		ts -= t;
		rs = rs -r;
		cs -= c;
		update();
	}
	
	static void sellSequence(int t, int r, int c) {
		if((t>ts) || (r>rs )|| (c>cs)) {
			System.out.print("error");
		}else {
			rs = rs -r;
			ts = ts - t;
			cs = cs - c;
		while((t+r+c)>0) {
			if(r>0) {
				if(x>2) {
					x=0;
					index = index +1;
				}
				if(roses.length!=0) {
				bouquet[x][index] = roses[r-1];}
				r--;
				pocket+=100;
				x++;
			}
			if(c>0) {
				if(x>2) {
					x=0;
					index = index +1;
				}
				if(chamomilies.length!=0) {
				bouquet[x][index] = chamomilies[c-1];}
				c--;
				pocket+=70;
				x++;
			}
			if(t>0) {
				
				if(x==3) {
					x=0;
					index = index +1;

				}
				if(tulips.length!=0) {
				bouquet[x][index] = tulips[0];}
				t--;
				pocket+=45;
				x++;
			}
			
			
		}
		
		
		if(x!=0) {
			index = index +1;
			x=0;}
		update();
	}
		}
	
	static void update() {
		tulips = new Tulip[ts]; 
		chamomilies = new Chamomile[cs]; 
		roses = new Rose[rs];
		for(int i = 0; i<ts-1; i++) {
			Tulip t = new Tulip(45);
			tulips[i] = t;
		}
		
		for(int i = 0; i<rs; i++) {
			Rose ros = new Rose(100);
			roses[i]=ros;
		}
		
		for(int i = 0; i<cs; i++) {
			Chamomile cha = new Chamomile(70);
			chamomilies[i] = cha;
		}
	}
	
	static void display() {
		System.out.println("\nКоличество тюльпанов: "+ tulips.length);
		System.out.println("Количество роз: "+ roses.length);
		System.out.println("Количество ромашек: "+ chamomilies.length);
		System.out.println("Количество букетов продано: "+ index);
	}
	
	static void displayBouquet() {
		System.out.println();
		for(int i = 0; i<index; i++) {
			for(int g =0; g<3; g++) {
				if(bouquet[g][i] instanceof Tulip) {
					System.out.print("T ");
				}
				if(bouquet[g][i] instanceof Rose) {
					System.out.print("R ");
				}
				if(bouquet[g][i] instanceof Chamomile) {
					System.out.print("C ");
				}
			}
			System.out.println();
		}
		System.out.println("\n\nCash:"+pocket);
	}

}
