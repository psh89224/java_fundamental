package player;

public class CDPlayer implements Player {
	
	@Override
	public void play() {
		System.out.println("CDplayer �÷����մϴ�.");
	}
	
	@Override
	public void stop() {
		System.out.println("CDplayer ��ž�մϴ�.");
	}
	
	public void cleaning() {
		System.out.println("CDplayer û���մϴ�.");
	}
}