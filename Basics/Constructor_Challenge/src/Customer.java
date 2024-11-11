public class Customer {

    private String name;
    private double credit_limit;
    private String email_adress;

    public Customer(String name, double credit_limit, String email_adress) {
        this.name = name;
        this.credit_limit = credit_limit;
        this.email_adress = email_adress;
    }

    public Customer() {
        this.name = "Andrew";
        this.credit_limit = 50;
        this.email_adress = "andrew@gmail.com";
    }

    public Customer(String name, String email_adress) {
        this("Hannes",1000,"hannes@noreply.com");
        this.name = name;
        this.email_adress = email_adress;
    }

    public String getName() {
        return name;
    }

    public double getCredit_limit() {
        return credit_limit;
    }

    public String getEmail_adress() {
        return email_adress;
    }


}
