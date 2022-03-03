package Inheritance;

class BasicMusicPlayer {
	private int cost;
	protected static String[] playlist = new String[] {"She ne wmerla", "Best wishes", "Summer Time", "Cave Embient"};
	BasicMusicPlayer(int cost) {
		this.cost=cost;
	}
	public void playSong() {
		System.out.println("Playing: "+playlist[0]);
	} 
	public int getCost() {
		return cost;
	}
}
