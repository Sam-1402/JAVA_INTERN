package OOPS_Project_02;

public abstract class Display implements IDisplay{
    public int resolution;
    public String displayPanel;
    public String displayType;
    public int displayFPS;

    public final void startingDisplay(){
        System.out.println("Starting Display!!  (This is same for all child classes)");
    }
    public abstract void turningONDisplay();
    public abstract void turningOFFDisplay();
    public abstract void changeColour();
    public abstract void adjustBrightness();
    public abstract void adjustContrast();
}
