public class Pacas extends Friends {

    public Pacas(String name, String arrivalTime, String arrivedhow, String favoritefood, String slogan) {
        super(name, arrivalTime, arrivedhow, favoritefood, slogan);
    }

    @Override
    public void getName() {
        System.out.println("Hey we are the Rainbow Pacas!");
    }

    @Override
    public void getArrivalTime() {
        System.out.println("we gifted each other the pacas <3");
    }

    @Override
    public void getArrivedhow() {
        System.out.println("personal present");
    }

    @Override
    public void getFavoritefood() {
        System.out.println("Our favorite food is: Gras!");
    }

    @Override
    public void getSlogan() {
        System.out.println("Pacas never disappoint");
    }
}
