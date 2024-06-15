package entities;

public class Phone {
    // Attributes
    private String name, color, size, brand, os, sim, cpu, gpu, ram, battery, display, camera, gps;


    // Getters & Setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public String getSize() {
        return size;
    }
    public void setSize(String size) {
        this.size = size;
    }

    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getOs() {
        return os;
    }
    public void setOs(String os) {
        this.os = os;
    }

    public String getSim() {
        return sim;
    }
    public void setSim(String sim) {
        this.sim = sim;
    }

    public String getCpu() {
        return cpu;
    }
    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getGpu() {
        return gpu;
    }
    public void setGpu(String gpu) {
        this.gpu = gpu;
    }

    public String getRam() {
        return ram;
    }
    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getBattery() {
        return battery;
    }
    public void setBattery(String battery) {
        this.battery = battery;
    }

    public String getDisplay() {return display;}
    public void setDisplay(String display) {
        this.display = display;
    }

    public String getCamera() {
        return camera;
    }
    public void setCamera(String camera) {
        this.camera = camera;
    }

    public String getGps() {
        return gps;
    }
    public void setGps(String gps) {
        this.gps = gps;
    }



    // Constructor
    public Phone(String name, String color, String size, String brand, String os, String sim, String cpu, String gpu, String ram, String battery, String display, String camera, String gps) {
        setName(name);
        setColor(color);
        setSize(size);
        setBrand(brand);
        setOs(os);
        setSim(sim);
        setCpu(cpu);
        setGpu(gpu);
        setRam(ram);
        setBattery(battery);
        setDisplay(display);
        setCamera(camera);
        setGps(gps);
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
                "\nGPS: " + getGps();
    }

    static boolean call() {
        if(answer()) {
            System.out.print("Hello !");
            return true;
        }
        return false;
    }
    static boolean answer() {
        System.out.print(call());
        System.out.print(" Hey! ");
        return true;
    }
}
