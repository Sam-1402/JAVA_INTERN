package OOPS_Project_02;

public class SoundSystemBOSE extends SoundSystem{

    @Override
    public void increaseVolume() {
        System.out.println("Bose SoundSystem: Increasing Volume");
    }

    @Override
    public void decreaseVolume() {
        System.out.println("Bose SoundSystem: Decreasing Volume");
    }

    @Override
    public void adjustTreble() {
        System.out.println("Bose SoundSystem: Adjusting Treble");
    }

    @Override
    public void adjustBass() {
        System.out.println("Bose SoundSystem: Adjusting Bass");
    }

    @Override
    public void adjustSoundMode() {
        System.out.println("Bose SoundSystem: Changing Sound Mode");
    }
}
