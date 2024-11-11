//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Customer customer = new Customer("Tim", 1000, "tim@email.com");
        System.out.println(customer.getName());
        System.out.println(customer.getCredit_limit());
        System.out.println(customer.getEmail_adress());


        Customer secondcustomer = new Customer();
        System.out.println(secondcustomer.getName());
        System.out.println(secondcustomer.getCredit_limit());
        System.out.println(secondcustomer.getEmail_adress());

        Customer thirdcustomer = new Customer("Joe","joe@email.com");
        System.out.println(thirdcustomer.getName());
        System.out.println(thirdcustomer.getCredit_limit());
        System.out.println(thirdcustomer.getEmail_adress());
    }


}