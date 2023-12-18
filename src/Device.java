class Device {
    private String deviceType;
    private String manufacturer;
    private String model;
    private String description;
    private double displaySize;
    private double storageSize;
    private double purchasePrice;
    private double sellingPrice;
    private int deviceId;

    public Device(String deviceType, String manufacturer, String model, String description,
                   double displaySize, double storageSize, double purchasePrice,
                   double sellingPrice, int deviceId) {
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

    Device() {
    }

    public String getDeviceType() {
        return deviceType;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public String getDescription() {
        return description;
    }

    public double getDisplaySize() {
        return displaySize;
    }

    public double getStorageSize() {
        return storageSize;
    }

    public double getPurchasePrice() {
        return purchasePrice;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public int deviceId() {
        return deviceId;
    }

    public int getDeviceId() {
        return deviceId;
    }

    public void setStorageSize(double storageSize) {
        this.storageSize = storageSize;
    }
}