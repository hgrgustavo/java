package dispositivos;

public abstract class Device {
    public String serialNumber;

    public Device(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getserialNumber() {
        return serialNumber;
    }

    public void setserialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public abstract void processarDoc(String doc);
}
