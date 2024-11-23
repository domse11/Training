public class Giuliano extends Friends {

    public Giuliano(String name, String arrivalTime, String arrivedhow, String favoritefood, String slogan) {
        super(name, arrivalTime, arrivedhow, favoritefood, slogan);
    }

    @Override
    public void getName() {
        System.out.println("Hey my name is Giuliano!");
    }

    @Override
    public void getArrivalTime() {
        System.out.println("I came to domse somewhere around 2021");
    }

    @Override
    public void getArrivedhow() {
        System.out.println("I came in a chocolate package");
    }

    @Override
    public void getFavoritefood() {
        System.out.println("My favorite food is: Carrots!");
    }

    @Override
    public void getSlogan() {
        System.out.println("I hide my eggs pretty well");
    }
}
