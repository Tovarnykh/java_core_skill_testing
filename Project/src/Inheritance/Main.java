package Inheritance;

public class Main {

	public static void main(String[] args) {
		Player1 playerone = new Player1(100);
		System.out.println(playerone.getCost());
		Player2 playertwo = new Player2(50);
		playertwo.playSong();
		Player3 playerthree = new Player3(200);
		playerthree.playSong();
		playerthree.playAllSongs();
		Player5 playerfifth = new Player5(300);
		playerfifth.playAllSongs();
	}

}
