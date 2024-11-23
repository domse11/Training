public class Friends {

    private String name;
    private String arrivalTime;
    private String arrivedhow;
    private String favoritefood;
    private String slogan;

    public Friends(String name, String arrivalTime, String arrivedhow, String favoritefood, String slogan) {
        this.name = name;
        this.arrivalTime = arrivalTime;
        this.arrivedhow = arrivedhow;
        this.favoritefood = favoritefood;
        this.slogan = slogan;
    }

    public void getName() {
        System.out.println("Hey my name is!");
    }

    public void getArrivalTime() {
        System.out.println("I came to domso on the X of Y");
    }

    public void getArrivedhow() {
        System.out.println("I came in the mail");
    }

    public void getFavoritefood() {
        System.out.println("My favorite food is: fishsticks!");
    }

    public void getSlogan() {
        System.out.println("MR. P for #President!");
    }
}
