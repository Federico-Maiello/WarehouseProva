import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Warehouse {
    private List<Device> inventory;

    public Warehouse() {
        this.inventory = new ArrayList<>();
        this.inventory.addAll(getInventory());
    }

    public List<Integer> addProduct(Device device, int quantityToAdd) {
        List<Integer> addedDeviceIds = new ArrayList<>();

        for (int i = 0; i < quantityToAdd; i++) {
            inventory.add(device);
            addedDeviceIds.add(device.deviceId());
        }

        return addedDeviceIds;
    }

    public void removeProduct(int deviceToRemove) {
        inventory.removeIf(device -> device.deviceId() == deviceToRemove);
    }

    public List<Device> getInventory() {
        Notebook laptop = new Notebook("Notebook", "Asus", "ZenBook", "Non disponibile", 14, 512, 850.00, 1000.00, 4431);
        Notebook laptop1 = new Notebook("Notebook", "Hp", "Pavilion Plus", "Non disponibile", 16, 1000, 780.00, 1199.00, 4432);
        Tablet tablet1 = new Tablet("Tablet", "Lenovo", "M10 plus", "Non disponibile", 10.6, 64, 300.00, 359.01, 1268);
        Tablet tablet2 = new Tablet("Tablet", "Microsoft", "Surface Pro 9", "Non disponibile", 13, 256, 998.00, 1300.00, 1269);
        Tablet tablet3 = new Tablet("Tablet", "Apple", "Ipad Air", "Non disponibile", 10.9, 256, 550.00, 630.00, 1270);
        Smartphone phone = new Smartphone("Smartphone", "Apple", "Iphone 11", "Non disponibile", 6.1, 128, 320.00, 480.00, 1123);
        Smartphone phone2 = new Smartphone("Smartphone", "TCL", "40SE", "Non disponibile", 6.0, 256, 120.00, 230.00, 7648);

        return new ArrayList<>(Arrays.asList(laptop, laptop1, tablet1, tablet2, tablet3, phone, phone2));
    }


}
