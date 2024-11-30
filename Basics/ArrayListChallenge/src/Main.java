import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    static ArrayList<String> groceryList = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        menuchoice();
    }

    public static void menuchoice() {
        boolean exit = true;

        while (exit) {
            try {
                System.out.println("Available actions: \n0 - to shutdown\n1 - to add item(s) to list (seperate with commas)\n2 - to remove any item(s) (seperate with commas)\n3 - show all items");
                switch (Integer.parseInt(sc.nextLine())) {
                    case 0:
                        System.out.println("Thank you and goodbye! ");
                        exit = false;
                        break;
                    case 1:
                        System.out.println("Add Item(s) to list ");
                        groceryListadd(sc.nextLine());
                        break;
                    case 2:
                        System.out.println("Remove Item(s) from list ");
                        groceryListremove(sc.nextLine());
                        break;
                    case 3:
                        groceryList();
                        break;
                    default:
                        System.out.println("Invalid choice, programm is exiting");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid choice, programm is exiting");
            }
        }
    }

    public static void groceryListadd(String input) {
        String[] items = input.split(",");
        for (String item : items) {
            item = item.trim().toLowerCase();
            if (groceryList.contains(item)) {
                System.out.println("Grocery Item already exists" + item);
            } else {
                groceryList.add(item);
                System.out.println("Grocery Item added " + item);
            }
        }
        sortgrocerylist();
        System.out.println("Updated Grocerylist contains : " + groceryList);
        totalitems();
    }


    public static void groceryListremove(String input) {
        String[] items = input.split(",");
        for (String item : items) {
            item = item.trim().toLowerCase();
            if (groceryList.contains(item)) {
                groceryList.remove(item);
                totalitems();
            } else {
                System.out.println("Grocery Item does not exist : " + item);
            }
        }
        System.out.println("Updated grocerylist contains : " + groceryList);
    }

    public static void groceryList() {
        if (groceryList.isEmpty()) {
            System.out.println("Grocery list is empty");
        } else {
            sortgrocerylist();
            System.out.println("Updated grocery list contains : " + groceryList);
            totalitems();
        }
    }

    public static void totalitems() {
        System.out.println("Total items: " + groceryList.size());
    }

    public static void sortgrocerylist() {
        groceryList.sort(Comparator.naturalOrder());
    }

}