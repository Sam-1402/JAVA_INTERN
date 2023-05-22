package Exercise_2;

public class Smartphone {
    private String smartphone_Model;
    private String Manufacturer;
    RAM ram1;
    Internal_Storage internalStorage1;
    Battery battery1;
    Processor processor1;
    Camera camera1;
    Speakers speakers1;
    Network network1;

    public Smartphone(String manufacturer, String model,
                      int Ram_size, String Ram_type, Boolean virtualRamAvailable,
                      int memory_Size, String memory_Type,
                      int battery_MAH, String battery_type,
                      String proc_manufacturer,String proc_generation, int no_of_cores,
                      int megapixels, int no_Of_cameras, String camera_manufacturer,
                      String speaker_manufacturer, int no_of_speaker,
                      int network_generation, int no_of_network_bands)
    {
        this.Manufacturer = manufacturer;
        this.smartphone_Model = model;
        ram1= new RAM(Ram_size, Ram_type, virtualRamAvailable);
        internalStorage1 = new Internal_Storage(memory_Size, memory_Type);
        battery1 = new Battery(battery_MAH, battery_type);
        processor1 = new Processor(proc_manufacturer, proc_generation, no_of_cores);
        camera1 = new Camera(megapixels, no_Of_cameras, camera_manufacturer);
        speakers1 = new Speakers(speaker_manufacturer, no_of_speaker);
        network1 = new Network(network_generation, no_of_network_bands);
    }

    public void turnOn(){

    }
    public void openApp(){

    }
    public void switchOff(){

    }

}
