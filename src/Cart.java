import java.util.ArrayList;
import java.util.List;

class Cart {
    private final List<Device> cartItems;

    public Cart() {
        this.cartItems = new ArrayList<>();
    }

    public void addToCart(Device device) {
        cartItems.add(device);
    }

    public void removeFromCart(int deviceId) {
        cartItems.removeIf(device -> device.deviceId() == deviceId);
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

}