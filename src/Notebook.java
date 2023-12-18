public class Notebook extends Device {
    private String deviceType;
    private String manufacturer;
    private String model;
    private String description;
    private double displaySize;
    private int storageSize;
    private double purchasePrice;
    private double sellingPrice;
    private int deviceId;

    public Notebook (String deviceType, String manufacturer, String model, String description,
                     double displaySize, int storageSize, double purchasePrice, double sellingPrice, int deviceId) {
        super();
        this.deviceType = deviceType;
        this.manufacturer = manufacturer;
        this.model = model;
        this.description = description;
        this.displaySize = displaySize;
        this.storageSize = storageSize;
        this.purchasePrice = purchasePrice;
        this.sellingPrice = sellingPrice;
        this.deviceId = deviceId;

    }

    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getDisplaySize() {
        return displaySize;
    }

    public void setDisplaySize(double displaySize) {
        this.displaySize = displaySize;
    }

    public int getStorageSize() {
        return storageSize;
    }

    public void setStorageSize(int storageSize) {
        this.storageSize = storageSize;
    }

    public double getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(double purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public int getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(int deviceId) {
        this.deviceId = deviceId;
    }

    @Override
    public String toString() {
        return  "DeviceType = " + deviceType + ", " +
                "Manufacturer = " + manufacturer + ", " +
                "Model = " + model + ", " +
                "Description = " + description + ", " +
                "DisplaySize = " + displaySize + ", " +'\n' +
                "             StorageSize = " + storageSize + ", " +
                "PurchasePrice = " + purchasePrice + ", " +
                "SellingPrice = " + sellingPrice + ", " +
                "ID: = " + deviceId;
    }

}