public class Meal_Order {

    private Burgers burger;
    private Drink drink;
    private Side_Item sideItem;


    public Meal_Order() {
        this.burger = new Burgers();
        this.drink = new Drink();
        this.sideItem = new Side_Item();
    }

    public Meal_Order(Burgers burger, Drink drink, Side_Item side_item) {
        this.burger = burger;
        this.drink = drink;
        this.sideItem = side_item;
    }

    public double getTotalPrice() {
       //System.out.println("Total amount: " + totalamount);
        return drink.getPrice() + burger.getPrice() + sideItem.getPrice();
    }


    @Override
    public String toString() {
        return "Your meal order:\n" +
                burger + "\n" +
                drink + "\n" +
                sideItem + "\n" +
                "Total Price: €" + getTotalPrice();
    }

    public Burgers getBurger() {
        return burger;
    }

    public void setBurger(Burgers burger) {
        this.burger = burger;
    }

    public Drink getDrink() {
        return drink;
    }

    public void setDrink(Drink drink) {
        this.drink = drink;
    }

    public Side_Item getSideItem() {
        return sideItem;
    }

    public void setSideItem(Side_Item sideItem) {
        this.sideItem = sideItem;
    }
}
