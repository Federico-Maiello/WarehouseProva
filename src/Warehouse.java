import java.util.*;

class Warehouse {
    private final List<Device> inventory = new ArrayList<>();

    public Warehouse() {
        this.inventory.addAll(getInventory());
    }

//    public List<Integer> addProduct(Device device, int quantityToAdd) {
//        List<Integer> addedDeviceIds = new ArrayList<>();
//        for (int i = 0; i < quantityToAdd; i++) {
//            Device newDevice = new Device(device.getDeviceType(),
//                    device.getManufacturer(),
//                    device.getModel(),
//                    device.getDescription(),
//                    device.getDisplaySize(),
//                    device.getStorageSize(),
//                    device.getPurchasePrice(),
//                    device.getSellingPrice(),
//                    device.getDeviceId(),
//                    device.getQuantity());
//            inventory.add(newDevice);
//            addedDeviceIds.add(newDevice.getDeviceId());
//            newDevice.setQuantity(quantityToAdd);
//
//        }
//
//        return addedDeviceIds;
//    }

    public int addProduct(Device device, int quantityToAdd){
        int idToAdd = device.getDeviceId();
        List<Device> inventoryDevices = getInventory();
        Device deviceToModify = null;
        for(Device devices : inventoryDevices){
            if (idToAdd == devices.getDeviceId()) {
                deviceToModify = devices;
            }
        }

        deviceToModify.setQuantity(device.getQuantity() + quantityToAdd);
        return idToAdd;
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
        Notebook laptop = new Notebook("Notebook", "Asus", "ZenBook", "Non disponibile", 14, 1024, 850.00, 1000.00, 4431,1);
        Notebook laptop1 = new Notebook("Notebook", "Hp", "Pavilion Plus", "Non disponibile", 16, 2048, 780.00, 1199.00, 4432,1);
        Tablet tablet1 = new Tablet("Tablet", "Lenovo", "M10 plus", "Non disponibile", 10.6, 128, 300.00, 359.01, 1268, 1);
        Tablet tablet2 = new Tablet("Tablet", "Microsoft", "Surface Pro 9", "Non disponibile", 13, 256, 998.00, 1300.00, 1269, 0);
        Tablet tablet3 = new Tablet("Tablet", "Apple", "Ipad Air", "Non disponibile", 10.9, 64, 550.00, 630.00, 1270, 0);
        Smartphone phone = new Smartphone("Smartphone", "Apple", "Iphone 11", "Non disponibile", 6.1, 128, 320.00, 480.00, 1123,0);
        Smartphone phone2 = new Smartphone("Smartphone", "TCL", "40SE", "Non disponibile", 6.0, 32, 120.00, 230.00, 7648,0);

        return new ArrayList<>(Arrays.asList(laptop, laptop1, tablet1, tablet2, tablet3, phone, phone2));
    }



}
