public class Pingu extends Friends {

    public Pingu(String name, String arrivalTime, String arrivedhow, String favoritefood, String slogan) {
        super(name, arrivalTime, arrivedhow, favoritefood, slogan);
    }

    @Override
    public void getName() {
        System.out.println("Hey my name is MR. P!");
    }

    @Override
    public void getArrivalTime() {
        System.out.println("I came to domse in 2020.02");
    }

    @Override
    public void getArrivedhow() {
        System.out.println("I came in the mail");
    }

    @Override
    public void getFavoritefood() {
        System.out.println("My favorite food is: fishsticks!");
    }

    @Override
    public void getSlogan() {
        System.out.println("MR. P for #President!");
    }
}

