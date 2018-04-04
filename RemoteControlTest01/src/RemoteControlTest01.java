interface RemoteControl {
	public abstract void turnOn();
	void turnOff();
}

class Television implements RemoteControl {
	
	@Override
	public void turnOn() {
		System.out.println("Television Power On...");
	}
	@Override
	public void turnOff() {
		System.out.println("Television Power Off...");		
	}
}

public class RemoteControlTest01 {
	public static void main(String[] args) {
		Television t = new Television();
		t.turnOn();
		
		RemoteControl r = new Television();
		r.turnOn();
	}
}
