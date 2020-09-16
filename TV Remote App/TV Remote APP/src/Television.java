public class Television {

	private boolean power;
	private int channel;
	private int volume;
	private int maxChannel;

	// default constructor
	public Television() {
		power = false;
		maxChannel = 10;
		volume=0;
		channel=1;
	}
	
	// constructor which set maxChannel to max
	public Television(int max) {
		maxChannel = max;
		if (max <2) {
			max=10;
		}
	}
	
	// getter methods for power
	public boolean getPower() {
		return power;
	}

	// setter methods for power
	public void setPower(boolean power) {
		this.power = power;
	}

	// getter for channel
	public int getChannel() {
		return channel;
	}

	// setter for channel
	public void setChannel(int channel) {
		if ((channel > 1) && (channel < maxChannel)) {
			this.channel = channel;
		}
	}

	// get method for volume
	public int getVolume() {
		return volume;
	}

	// private set method for volume
	private void setVolume(int volume) {
		if ((volume >= 0) && (volume <= 100)) {
			this.volume = volume;
		}
	}

	// volumeDown function
	public void volumeDown() {
		if(power==true) {
			volume--;
		}
	}

	// volumeUp function
	public void volumeUp() {
		if(power==true) {
			volume++;
		}
	}

	// get method for maxChannel
	public int getMaxChannel() {
		return maxChannel;
	}
	// Constructor
	public Television (boolean power, int channel, int volume) {
		this.setPower(power);
		this.setChannel(channel);
		this.setVolume(volume);
	}
	// toString methods
	public String toString() {
		return this.power + "." + this.channel + "/10." + this.volume+"%";

	}

}