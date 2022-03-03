package Inheritance;

public class PremiumMusicPlayer extends BasicMusicPlayer{
		PremiumMusicPlayer(int cost){
			super(cost);
		}
		public void playAllSongs() {
			for(String i : playlist) {
				System.out.println("Playing: "+i);
			}
		}
}
