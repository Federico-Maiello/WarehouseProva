import java.util.ArrayList;
import java.util.List;

class WarehouseManager {
    private Warehouse warehouse;
    private Cart cart;

    public WarehouseManager() {
        this.warehouse = new Warehouse();
        this.cart = new Cart();
    }

    public void printProducts() {
        warehouse.getInventory().forEach(device ->
                System.out.println("ID: " + device.getDeviceId() + ", Type: " + device.getDeviceType()
                        + ", Manufacturer: " + device.getManufacturer() + ", Model: " + device.getModel()
                        + ", Selling Price: " + device.getSellingPrice()));
    }
    public void getItemInCart() {
        cart.getCartItems().forEach(device ->
                System.out.println("ID: " + device.getDeviceId() + ", Type: " + device.getDeviceType()
                        + ", Manufacturer: " + device.getManufacturer() + ", Model: " + device.getModel()
                        + ", Selling Price: " + device.getSellingPrice()));
    }


    public void removeFromWarehouse(int deviceId) {
        warehouse.removeProduct(deviceId);
    }

    public void addToCart(int deviceId) {
        Device device = findProductById(deviceId, warehouse.getInventory());
        if (device != null) {
            cart.addToCart(device);
            removeFromWarehouse(deviceId);
            System.out.println("Product added to cart.");
        } else {
            System.out.println("Product not found in the warehouse.");
        }
    }

    public void removeFromCart(int deviceId) {
        Device device = findProductById(deviceId, cart.getCartItems());
        if (device != null) {
            cart.removeFromCart(deviceId);
            addToWarehouse(deviceId, 1);
            System.out.println("Product removed from cart.");
        } else {
            System.out.println("Product not found in the cart.");
        }
    }
    public double calculateMidPrice() {
        return cart.calculateMidPrice();
    }

    public double calculateCartTotal() {
        return cart.calculateTotal();
    }

    public void finalizeSale() {
        cart.clearCart();
        System.out.println("Sale finalized. Cart cleared.");
    }

    private Device findProductById(int deviceId, List<Device> cartItems) {
        for (Device device : cartItems) {
            if (device.getDeviceId() == (deviceId)) {
                return device;
            }
        }
        return null;
    }

    public void addToWarehouse(int deviceIdToAdd, int quantityToAdd) {
        Device device = findProductById(deviceIdToAdd, warehouse.getInventory());

        if (device != null) {
            warehouse.addProduct(device, quantityToAdd);
            System.out.println("Product added to the warehouse.");
        } else {
            System.out.println("Product not found in the inventory.");
        }
    }
    public List<Device> searchByManufacturer(String manufacturer) {
        List<Device> searchResults = new ArrayList<>();

        for (Device device : warehouse.getInventory()) {
            if (device.getManufacturer().equalsIgnoreCase(manufacturer)) {
                searchResults.add(device);
            }
        }

        if (searchResults.isEmpty()) {
            System.out.println("No result for search by manufacturer: " + manufacturer);
        }

        return searchResults;
    }
    public List<Device> searchBySellingPrice(double price) {
        List<Device> searchPrice = new ArrayList<>();

        for (Device device : warehouse.getInventory()) {
            if (device.getSellingPrice() == price) {
                searchPrice.add(device);
            }
        }

        if (searchPrice.isEmpty()) {
            System.out.println("Nessun dispositivo trovato per il prezzo di acquisto specificato.");
        }
        return searchPrice;
    }

}
