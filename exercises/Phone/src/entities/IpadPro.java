package entities;

public class IpadPro extends Phone{
    // Attribute
    private final String maxFps = "120fps";
    private final String waterRes = "None";
    private final String conn = "Wi-Fi | Bluetooth | USB-TypeC 3.1";
    private final String sensor = "Proximity | Gyroscope | Barometer";
    private final String function = "Vibration | Voice | Wi-Fi Hotspot | Style Pen";
    private final String video = " High Definition | 60fps | Slow Motion | Face Detection";


    // Get
    public String getMaxFps() {
        return maxFps;
    }

    public String getWaterRes() {
        return waterRes;
    }

    public String getConn() {
        return conn;
    }

    public String getSensor() {
        return sensor;
    }

    public String getFunction() {
        return function;
    }

    public String getVideo() {
        return video;
    }





    // Constructor
    public IpadPro(String name, String color, String size, String brand, String os, String sim, String cpu, String gpu, String ram, String battery, String display, String camera, String gps) {
        super(name, color, size, brand, os, sim, cpu, gpu, ram, battery, display, camera, gps);
        String fps = this.maxFps;
        String waterRes = this.waterRes;
        String conn = this.conn;
        String sensor = this.sensor;
        String video = this.video;
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
                "\nDisplay Maximum Frames: " + getMaxFps() +
                "\nCamera: " + getCamera() +
                "\nGPS: " + getGps() +
                "\nConnection: " + getConn() +
                "\nVideo: " + getVideo() +
                "\nSensors: " + getSensor() +
                "\nFunctions: " + getFunction() +
                "\nWater Resistence: " + getWaterRes();
    }


}