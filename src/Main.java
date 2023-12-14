import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        WarehouseManager manager = new WarehouseManager();
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.println("\n1. Print Products\n2. Add to Warehouse\n3. Remove from Warehouse\n" +
                    "4. Add to Cart\n5. Remove from Cart\n6. Calculate Cart Total\n7. Finalize Sale\n0. Exit");
            System.out.print("Enter your choice: ");
//            choice = scanner.nextInt();

            System.out.print("Enter your choice: ");
            try {
                choice = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine(); // Consume the invalid input
                choice = -1; // Set to an invalid choice to continue the loop
            }

            switch (choice) {
                case 1:
                    manager.printProducts();
                    break;
                case 2:
                    // Input and add product to warehouse
                    System.out.print("Enter device ID: ");
                    int deviceIdToAdd = scanner.nextInt();
                    System.out.print("Enter quantity: ");
                    int quantityToAdd = scanner.nextInt();
                    manager.addToWarehouse(deviceIdToAdd, quantityToAdd);
                    break;
                case 3:
                    // Input and remove product from warehouse
                    System.out.print("Enter device ID to remove: ");
                    int deviceIdToRemove = scanner.nextInt();
                    manager.removeFromWarehouse(deviceIdToRemove);
                    break;
                case 4:
                    // Input and add product to cart
                    manager.printProducts();
                    System.out.print("Enter device ID to add to cart: ");
                    int deviceIdToAddToCart = scanner.nextInt();
                    manager.addToCart(deviceIdToAddToCart);
                    break;
                case 5:
                    // Input and remove product from cart
                    System.out.print("Enter device ID to remove from cart: ");
                    int deviceIdToRemoveFromCart = scanner.nextInt();
                    manager.removeFromCart(deviceIdToRemoveFromCart);
                    break;
                case 6:
                    System.out.println("Cart Total: " + manager.calculateCartTotal());
                    break;
                case 7:
                    manager.finalizeSale();
                    break;
                case 0:
                    System.out.println("Exiting program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }

        } while (choice != 0);

        scanner.close();
    }
}