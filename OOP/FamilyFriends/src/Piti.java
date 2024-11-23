public class Piti extends Friends {

    public Piti(String name, String arrivalTime, String arrivedhow, String favoritefood, String slogan) {
        super(name, arrivalTime, arrivedhow, favoritefood, slogan);
    }

    @Override
    public void getName() {
        System.out.println("Hey my name is Piti aka small bear");
    }

    @Override
    public void getArrivalTime() {
        System.out.println("I came to domse in 2022");
    }

    @Override
    public void getArrivedhow() {
        System.out.println("smoll present");
    }

    @Override
    public void getFavoritefood() {
        System.out.println("My favorite food is: Vanilla!");
    }

    @Override
    public void getSlogan() {
        System.out.println("smoll but awesome");
    }
}
