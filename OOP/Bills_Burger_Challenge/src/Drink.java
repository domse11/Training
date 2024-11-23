import java.util.Scanner;

public class Drink {

    private String type;
    private String size;
    private Double price;

    public Drink() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the type of drink (e.g., Coke, Sprite, Water):");
        this.type = scanner.nextLine();

        System.out.println("Please enter the size of the drink (small, medium, large):");
        this.size = scanner.nextLine();

        this.price = calculatePrice(size);
    }

    private double calculatePrice(String size) {
        switch (size.toLowerCase()) {
            case "small":
                return 2.50;
            case "medium":
                return 3.50;
            case "large":
                return 4.50;
            default:
                System.out.println("Invalid size! Defaulting to small.");
                return 2.50;
        }
    }

    public Double getPrice() {
        return price;
    }

    public String getType() {
        return type;
    }

    public String getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "Drink: " + type + " (" + size + ", €" + String.format("%.2f", price) + ")";
    }

}
