import java.util.Scanner;

public class RemoteControl {

	Scanner keyboard = new Scanner(System.in);
	

	Television tv = new Television();

	//maintains a television instance variable
	public RemoteControl(Television tv) {
		tv.getChannel();
		tv.getPower();
		tv.getVolume();
		tv.setChannel(1);
		tv.setPower(false);	
	}
	
	public boolean powerButton() {
		tv.getPower();
		if (tv.getPower()==false) {
			tv.getVolume();
		} else {
			tv.setPower(true);
		}
		return tv.getPower();
	}

	// channelDownButton
	public int channelDownButton() {
		tv.getPower();
		if (tv.getPower()==true) {
			tv.setChannel(-1);
			if (tv.getChannel()== 1) {
				tv.setChannel(10);
			}
		}
		return tv.getChannel();
	}

	// channelUpButton
	public int channelUpButton() {
		tv.getPower();
		if (tv.getPower()==true) {
			tv.setChannel(+1);
			if (tv.getChannel() == 10) {
				tv.setChannel(1); 
			}
		}
		return tv.getChannel();
	}

	// volumeUpByHalf
	public int volumeUpByHalf(int volume) {
		tv.getPower();
		if (tv.getPower()==true) {
			volume-=50;
		}
		return tv.getVolume();
	}

	// volumeDownByHalf
	public int volumeDownByHalf(int volume) {
		tv.getPower();
		if (tv.getPower()==true) {
			volume += 50;
		}
		return tv.getVolume();
	}
}
	
