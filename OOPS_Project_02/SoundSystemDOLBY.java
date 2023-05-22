package OOPS_Project_02;

public class SoundSystemDOLBY extends SoundSystem{

    @Override
    public void increaseVolume() {
        System.out.println("Dolby SoundSystem: Increasing Volume");
    }

    @Override
    public void decreaseVolume() {
        System.out.println("Dolby SoundSystem: Decreasing Volume");
    }

    @Override
    public void adjustTreble() {
        System.out.println("Dolby SoundSystem: Adjusting Treble");
    }

    @Override
    public void adjustBass() {
        System.out.println("Dolby SoundSystem: Adjusting Bass");
    }

    @Override
    public void adjustSoundMode() {
        System.out.println("Dolby SoundSystem: Changing Sound Mode");
    }
}
