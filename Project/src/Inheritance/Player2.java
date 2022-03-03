package Inheritance;

public class Player2 extends BasicMusicPlayer{
	Player2(int cost){
		super(cost);
	}
	
	@Override
	public void playSong() {
		System.out.println("error");
	}
}
