package player;

public class CDPlayer implements Player {
	
	@Override
	public void play() {
		System.out.println("CDplayer 플레이합니다.");
	}
	
	@Override
	public void stop() {
		System.out.println("CDplayer 스탑합니다.");
	}
	
	public void cleaning() {
		System.out.println("CDplayer 청소합니다.");
	}
}