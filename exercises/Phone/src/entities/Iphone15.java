package entities;

public class Iphone15 extends Phone {

    private final String waterRes = "Yes";
    private final String conn = "Wi-Fi | Bluetooth | GPS | USB-TypeC 2.0";
    private final String sensor = "Proximity | Barometer | Compass | Gyroscope";
    private final String video = "HighDefinition | 60FPS | SlowMotion | StereoSound ";
    private final String function = "Vibration | Voice | Wi-FiHotspot";




    // Get
    public String getWaterRes() {
        return waterRes;
    }

    public String getConn() {
        return conn;
    }

    public String getSensor() {
        return sensor;
    }

    public String getVideo() {
        return video;
    }

    public String getFunction() {
        return function;
    }




    // Constructor
    public Iphone15(String name, String color, String size, String brand, String os, String sim, String cpu, String gpu, String ram, String battery, String display, String camera, String gps) {
        super(name, color, size, brand, os, sim, cpu, gpu, ram, battery, display, camera, gps);
        String waterRes = this.waterRes;
        String conn = this.conn;
        String video = this.video;
        String sensor = this.sensor;
        String function = this.function;
    }





    // Methods
    public String toString() {
        return  "\n ~ Device Information " +
                "\nName: " + getName() +
                "\nColor: " + getColor() +
                "\nSize: " + getSize() +
                "\nBrand: " + getBrand() +
                "\nOS: " + getOs() +
                "\nSIM Chip: " + getSim() +
                "\nCPU: " + getCpu() +
                "\nGPU: " + getGpu() +
                "\nRAM: " + getRam() +
                "\nBattery: " + getBattery() +
                "\nDisplay: " + getDisplay() +
                "\nCamera: " + getCamera() +
                "\nGPS: " + getGps() +
                "\nConnection: " + getConn() +
                "\nVideo: " + getVideo() +
                "\nSensors: " + getSensor() +
                "\nFunctions: " + getFunction() +
                "\nWater Resistence: " + getWaterRes();
    }


}