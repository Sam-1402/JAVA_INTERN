package OOPS_Project_02;

public class TVSpecifications {
    SoundSystem mySS;
    Display myDisplay;
    public TVSpecifications(String make, String ss){
        myDisplay = DisplayAdapter.getDisplay(make);
        mySS = SoundSystemAdapter.getSoundSystem(ss);
    }

    public void startTV(){
        myDisplay.startingDisplay();
        myDisplay.turningONDisplay();
        myDisplay.adjustBrightness();
        myDisplay.adjustContrast();;
        myDisplay.changeColour();

        mySS.checkSoundSystem();
        mySS.increaseVolume();
        mySS.adjustTreble();
        mySS.adjustBass();
        mySS.adjustSoundMode();
    }
    public void switchOffTV(){
        mySS.decreaseVolume();
        myDisplay.turningOFFDisplay();
    }

}
