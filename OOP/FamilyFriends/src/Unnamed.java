public class Unnamed extends Friends {

    public Unnamed(String name, String arrivalTime, String arrivedhow, String favoritefood, String slogan) {
        super(name, arrivalTime, arrivedhow, favoritefood, slogan);
    }

    @Override
    public void getName() {
        System.out.println("Hey my name is (I dont have a name yet :( ");
    }

    @Override
    public void getArrivalTime() {
        System.out.println("I came to domse somewhere around 2023");
    }

    @Override
    public void getArrivedhow() {
        System.out.println("Bear brought me home");
    }

    @Override
    public void getFavoritefood() {
        System.out.println("My favorite food is: Nuts!");
    }

    @Override
    public void getSlogan() {
        System.out.println("Conquer the world!");
    }
}
