import java.util.Scanner;

public class Burgers {
    private String type;
    private double price;
    private String topping;

    public Burgers(String type) {
        this.type = type;
        this.price = calculatePrice(type);
    }

    public Burgers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the type of burger: Regular Burger, Cheeseburger, Deluxe Burger");

        this.type = scanner.nextLine();
        this.price = calculatePrice(type);
    }

    private double calculatePrice(String type) {
        switch (type.toLowerCase()) {
            case "regular burger":
                return 5.00;
            case "cheeseburger":
                return 6.50;
            case "deluxe burger":
                return 8.00;
            default:
                System.out.println("Invalid burger type! Defaulting to Regular Burger.");
                return 5.00;
        }
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Burger: " + type + " (€" + String.format("%.2f", price) + ")" +
                (topping != null && !topping.isEmpty() ? ", Topping: " + topping : "");
    }

}
