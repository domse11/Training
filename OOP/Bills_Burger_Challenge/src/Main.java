public class Main {
    public static void main(String[] args) {

        // Standardbestellung
        Meal_Order defaultOrder = new Meal_Order();
        System.out.println(defaultOrder);
        System.out.println("_____");

        defaultOrder.getTotalPrice();

        /*// Benutzerdefinierte Bestellung
        Burgers customBurger = new Burgers("Cheeseburger");
        Drink customDrink = new Drink();
        Side_Item customSide = new Side_Item("Onion Rings", 4.00);

        Meal_Order customOrder = new Meal_Order(customBurger, customDrink, customSide);
        System.out.println(customOrder);*/

    }


}