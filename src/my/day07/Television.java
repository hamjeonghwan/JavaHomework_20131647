package my.day07;

public class Television {
	private int channel;
	private int volume;
	private boolean onOff;
	
	public Television(int channel, int volume) {
		this.channel = channel;
		this.volume= volume;
	}
	public Television(int channel, int volume, boolean onOff) {
		this(channel,volume);
		this.onOff= onOff;	
	}
	public void print() {
		System.out.println("채널은" +channel+ "이고 볼륨은" +volume+ "입니다");
	}
	public static void main(String[] args) {
		Television t= new Television(7, 10, true);
		t.print();
		Television v= new Television(11, 20, true);
		v.print();
	}
}