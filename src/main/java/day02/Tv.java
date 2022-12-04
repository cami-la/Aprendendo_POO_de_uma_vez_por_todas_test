package main.java.day02;

public class Tv {
  //attributes
  private int channelNumber;
  private int volume;

  //construct method
  public Tv(int channelNumber) {
    this.channelNumber = channelNumber;
    this.volume = 5;
  }

  //methods
  public void turnUpVolume() {
    this.volume++;
    if(this.volume > 10) {
      this.volume = 10;
      throw new RuntimeException("It's already at full volume");
    }
  }

  public void turnDownVolume() {
    this.volume--;
    if(this.volume < 0) {
      this.volume = 0;
      throw new RuntimeException("It's already at minimum volume");
    }
  }

  public int getChannelNumber() {
    return channelNumber;
  }

  public void setChannelNumber(int channelNumber) {
    this.channelNumber = channelNumber;
  }

  public int getVolume() {
    return volume;
  }

  public void setVolume(int volume) {
    this.volume = volume;
  }
}
