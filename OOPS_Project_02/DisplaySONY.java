package OOPS_Project_02;

public class DisplaySONY extends Display{

    @Override
    public void turningONDisplay() {
        System.out.println("Sony Display: Turning ON");
    }

    @Override
    public void turningOFFDisplay() {
        System.out.println("Sony Display: Turning OFF");
    }

    @Override
    public void changeColour() {
        System.out.println("Sony Display: Changing Colour");
    }

    @Override
    public void adjustBrightness() {
        System.out.println("Sony Display: Adjusting Brightness");
    }

    @Override
    public void adjustContrast() {
        System.out.println("Sony Display: Adjusting Contrast");
    }
}
