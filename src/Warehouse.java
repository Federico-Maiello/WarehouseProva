import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

class Warehouse {
    private final List<Device> inventory = new ArrayList<>();

    public Warehouse() {
        this.inventory.addAll(getInventory());
    }

    public List<Integer> addProduct(Device device, int quantityToAdd) {
        List<Integer> addedDeviceIds = new ArrayList<>();
        for (int i = 0; i < quantityToAdd; i++) {
            Device newDevice = new Device(device.getDeviceType(),
                    device.getManufacturer(),
                    device.getModel(),
                    device.getDescription(),
                    device.getDisplaySize(),
                    device.getStorageSize(),
                    device.getPurchasePrice(),
                    device.getSellingPrice(),
                    device.getDeviceId());
            inventory.add(newDevice);
            addedDeviceIds.add(newDevice.deviceId());
            newDevice.setQuantity(quantityToAdd);

        }

        return addedDeviceIds;
    }


    public void removeProduct(int deviceToRemove) {
        Iterator<Device> iterator = inventory.iterator();
        while (iterator.hasNext()) {
            Device device = iterator.next();
            if (device.deviceId() == deviceToRemove) {
                iterator.remove();
                break;
            }
        }
    }

    public List<Device> getInventory() {
        Notebook laptop = new Notebook("Notebook", "Asus", "ZenBook", "Non disponibile", 14, 0, 850.00, 1000.00, 4431);
        Notebook laptop1 = new Notebook("Notebook", "Hp", "Pavilion Plus", "Non disponibile", 16, 0, 780.00, 1199.00, 4432);
        Tablet tablet1 = new Tablet("Tablet", "Lenovo", "M10 plus", "Non disponibile", 10.6, 0, 300.00, 359.01, 1268);
        Tablet tablet2 = new Tablet("Tablet", "Microsoft", "Surface Pro 9", "Non disponibile", 13, 0, 998.00, 1300.00, 1269);
        Tablet tablet3 = new Tablet("Tablet", "Apple", "Ipad Air", "Non disponibile", 10.9, 0, 550.00, 630.00, 1270);
        Smartphone phone = new Smartphone("Smartphone", "Apple", "Iphone 11", "Non disponibile", 6.1, 0, 320.00, 480.00, 1123);
        Smartphone phone2 = new Smartphone("Smartphone", "TCL", "40SE", "Non disponibile", 6.0, 0, 120.00, 230.00, 7648);

        return new ArrayList<>(Arrays.asList(laptop, laptop1, tablet1, tablet2, tablet3, phone, phone2));
    }


}
