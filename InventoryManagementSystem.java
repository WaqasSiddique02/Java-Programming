import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

abstract class Product {
    protected int productId;
    protected String productName;
    protected double price;
    protected int quantity;

    public Product(int productId, String productName, double price, int quantity) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    public abstract void displayInfo();

    public int getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}

interface InventoryManagement {
    void updateInventory(List<Product> products);
}

class Inventory implements InventoryManagement {
    protected List<Product> products;

    public Inventory() {
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void displayInventory() {
        for (int i = 0; i < products.size(); i++) {
            products.get(i).displayInfo();
        }
    }

    @Override
    public void updateInventory(List<Product> products) {
        for (int i = 0; i < products.size(); i++) {
            for (int j = 0; j < this.products.size(); j++) {
                if (this.products.get(j).getProductId() == products.get(i).getProductId()) {
                    this.products.get(j).setQuantity(this.products.get(j).getQuantity() - products.get(i).getQuantity());
                    break;
                }
            }
        }
    }
}

class Order {
    private int orderId;
    private List<Product> products;
    private String orderType;
    private String location;

    public Order(int orderId, List<Product> products, String orderType, String location) {
        this.orderId = orderId;
        this.products = products;
        this.orderType = orderType;
        this.location = location;
    }

    public double calculateTotal() {
        double total = 0;
        for (int i = 0; i < products.size(); i++) {
            total += products.get(i).getPrice();
        }
        return total;
    }

    public void displayOrderDetails() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Order Type: " + orderType);
        System.out.println("Location: " + location);
        System.out.println("Products:");
        for (Product product : products) {
            product.displayInfo();
        }
        System.out.println("Total: $" + calculateTotal());
    }
}

public class InventoryManagementSystem {
    private static Scanner scanner = new Scanner(System.in);
    private static Inventory inventory = new Inventory();
    private static int orderId = 1000;

    public static void main(String[] args) {
        System.out.println("Name: Muhammad Waqas Siddique");
        System.out.println("Welcome to Inventory Management System");

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add Product");
            System.out.println("2. Place Online Order");
            System.out.println("3. Place In-Store Order");
            System.out.println("4. Display Inventory");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addProduct();
                    break;
                case 2:
                    placeOnlineOrder();
                    break;
                case 3:
                    placeInStoreOrder();
                    break;
                case 4:
                    displayInventory();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void addProduct() {
        System.out.println("\nEnter product details:");
        System.out.print("Product ID: ");
        int productId;
        while (!scanner.hasNextInt()) {
            System.out.println("Please enter a valid integer for Product ID.");
            scanner.next();
        }
        productId = scanner.nextInt();

        System.out.print("Product Name: ");
        String productName = scanner.next();
        System.out.print("Price: ");
        double price;
        while (!scanner.hasNextDouble()) {
            System.out.println("Please enter a valid double for Price.");
            scanner.next(); // Consume the invalid input
        }
        price = scanner.nextDouble();

        System.out.print("Quantity: ");
        int quantity;
        while (!scanner.hasNextInt()) {
            System.out.println("Please enter a valid integer for Quantity.");
            scanner.next(); // Consume the invalid input
        }
        quantity = scanner.nextInt();

        Product product = new Product(productId, productName, price, quantity) {
            @Override
            public void displayInfo() {
                System.out.println("Product ID: " + productId + ", Product Name: " + productName +
                        ", Price: $" + price + ", Quantity: " + quantity);
            }
        };

        inventory.addProduct(product);
        System.out.println("Product added successfully.");
    }

    private static void placeOnlineOrder() {
        List<Product> products = selectProducts();
        System.out.print("Enter shipping address: ");
        String address = scanner.next();
        Order order = new Order(orderId++, products, "Online", address);
        order.displayOrderDetails();
    }

    private static void placeInStoreOrder() {
        List<Product> products = selectProducts();
        System.out.print("Enter store location: ");
        String location = scanner.next();
        Order order = new Order(orderId++, products, "In-Store", location);
        order.displayOrderDetails();
    }

    private static List<Product> selectProducts() {
        List<Product> selectedProducts = new ArrayList<>();
        while (true) {
            System.out.println("\nSelect a product to add to the order (enter -1 to finish):");
            inventory.displayInventory();
            System.out.print("Enter Product ID: ");
            int productId = scanner.nextInt();
            if (productId == -1)
                break;
            Product selectedProduct = null;
            for (Product product : inventory.products) {
                if (product.getProductId() == productId) {
                    selectedProduct = product;
                    break;
                }
            }
            if (selectedProduct != null) {
                System.out.print("Enter quantity: ");
                int quantity = scanner.nextInt();
                if (quantity <= selectedProduct.getQuantity()) {
                    selectedProduct.setQuantity(quantity);
                    selectedProducts.add(selectedProduct);
                } else {
                    System.out.println("Not enough stock available.");
                }
            } else {
                System.out.println("Invalid Product ID.");
            }
        }
        System.out.println("232441");
        return selectedProducts;
    }

    private static void displayInventory() {
        System.out.println("\nInventory:");
        inventory.displayInventory();
    }
}
