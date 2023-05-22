package OOPS_Project_02;

public abstract class SoundSystem implements ISoundSystem{
    public int no_of_speakers;
    public int speakerDecibel;
    public int sizeOfSpeakerDrivers;
    public String soundChannel;
    public String soundMode;

    public final void checkSoundSystem(){
        System.out.println("Sound System is Working!!  (This is same for all child Classes)");
    }

    public abstract void increaseVolume();
    public abstract void decreaseVolume();
    public abstract void adjustTreble();
    public abstract void adjustBass();
    public abstract void adjustSoundMode();

}
