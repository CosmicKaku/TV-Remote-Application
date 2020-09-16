import java.util.Scanner;

public class TVApplication {
	
	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		
		Television tv = new Television();
		RemoteControl rc = new RemoteControl(tv);
		

		System.out.println("Press a button on the Remote Control");
		System.out.println("1.Power 2.Volume Up by 50% 3.Volume Down by 50% 4.Channel Up 5.Channel Down 6.Go outside");

		int number = keyboard.nextInt();
		while (number!=6) {

			if (number == 1) {
				System.out.println("Power button Pressed");
				tv.setPower(true);
				
			} else if (number == 2) {
				System.out.println("Volume Up by 50% Button Pressed");
				rc.volumeUpByHalf(number);
				tv.getVolume();
				
			} else if (number == 3) {
				System.out.println("Volume Down by 50% Button Pressed");
				rc.volumeDownByHalf(number);
				tv.getVolume();
				
			} else if (number == 4) {
				System.out.println("Channel Up Button Pressed");
				rc.channelUpButton();
				tv.getChannel();
				
			} else if (number == 5) {
				System.out.println("Channel Down Button Pressed");
				rc.channelDownButton();
				tv.getChannel();
			}
			System.out.println("[television is:on? "+tv.getPower()+" CHANNEL: "+tv.getChannel()+"/10"+" VOLUME: "+tv.getVolume()+"%");
			number = keyboard.nextInt();
		}
		if (number == 6) {
			System.out.println("Stop watching TV and go outside");
		}
		
	
	}


}
