import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Cart {
    private final List<Device> cartItems = new ArrayList<>();

    public void addToCart(Device device) {
        cartItems.add(device);
    }

    public void removeFromCart(int deviceId) {
        Iterator<Device> iterator = cartItems.iterator();
        while (iterator.hasNext()) {
            Device device = iterator.next();
            if (device.getDeviceId() == deviceId) {
                iterator.remove();
                System.out.println("Elemento con ID " + deviceId + " rimosso dalla lista.");
                return;
            }
        }
    }

    public double calculateTotal() {
        return cartItems.stream().mapToDouble(Device::getSellingPrice).sum();
    }

    public void clearCart() {
        cartItems.clear();
    }

    public List<Device> getCartItems() {
        return cartItems;
    }

    public double calculateMidPrice() {
        return cartItems.stream()
                .mapToDouble(Device::getSellingPrice)
                .average()
                .orElse(0.0);
    }


}
