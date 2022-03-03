package Inheritance;

public class Player5 extends PremiumMusicPlayer{
	Player5(int cost){
		super(cost);
	}
	
	@Override
	public void playAllSongs(){
		int s = playlist.length;
		for(int i = s-1; i>=0;i--) {
			System.out.println(playlist[i]);
		}
	}
}
