package OOPS_Project_02;

public class DisplaySAMSUNG extends Display{

    @Override
    public void turningONDisplay() {
        System.out.println("Samsung Display: Turning ON");
    }

    @Override
    public void turningOFFDisplay() {
        System.out.println("Samsung Display: Turning OFF");
    }

    @Override
    public void changeColour() {
        System.out.println("Samsung Display: Changing Colour");
    }

    @Override
    public void adjustBrightness() {
        System.out.println("Samsung Display: Adjusting Brightness");
    }

    @Override
    public void adjustContrast() {
        System.out.println("Samsung Display: Adjusting Contrast");
    }
}
