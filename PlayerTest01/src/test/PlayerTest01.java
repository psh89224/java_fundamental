package test;
import player.*;

public class PlayerTest01 {
	public static void main(String[] args) {
		Player[] players = {
				new VideoPlayer(),
				new CDPlayer(),
				new VideoPlayer(),
				new CDPlayer(),
				new VideoPlayer()
		};
		for(Player p : players) {
			p.play();
			
			if(p instanceof VideoPlayer) {
				((VideoPlayer)p).printInfo();
			}
			if(p instanceof CDPlayer) {
				((CDPlayer)p).cleaning();
			}
			p.stop();
			System.out.println();
		}
	}

}
