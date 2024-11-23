public class Peter2 extends Friends {

    public Peter2(String name, String arrivalTime, String arrivedhow, String favoritefood, String slogan) {
        super(name, arrivalTime, arrivedhow, favoritefood, slogan);
    }

    @Override
    public void getName() {
        System.out.println("Hey my name is Peter two");
    }

    @Override
    public void getArrivalTime() {
        System.out.println("I came to domse in 2021");
    }

    @Override
    public void getArrivedhow() {
        System.out.println("I was a birthday present");
    }

    @Override
    public void getFavoritefood() {
        System.out.println("My favorite food is: Chocolate!");
    }

    @Override
    public void getSlogan() {
        System.out.println("Bear me!");
    }
}
