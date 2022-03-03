package Inheritance;

public class Player4 extends PremiumMusicPlayer{
	Player4(int cost){
		super(cost);
	}
	
	@Override
	public void playSong() {
		System.out.println(playlist[3]);
	}
}
