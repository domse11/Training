import java.util.Scanner;

public class Side_Item {
    private String type;
    private double price;

    public Side_Item(String type, double price) {
        this.type = type;
        this.price = calculatePrice(type);
    }

    public Side_Item() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the type of side item (fries, chicken nuggets, onion rings):");
        this.type = scanner.nextLine();

        this.price = calculatePrice(type);
    }

    private double calculatePrice(String type) {
        switch (type.toLowerCase()) {
            case "fries":
                return 2.50;
            case "chicken nuggets":
                return 3.50;
            case "onion rings":
                return 4.00;
            default:
                System.out.println("Invalid side item! Defaulting to fries.");
                return 2.50;
        }
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Side Item: " + type + " (€" + String.format("%.2f", price) + ")";
    }



}
