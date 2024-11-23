public class Main {
    public static void main(String[] args) {

        String line = "_";
        int repeat = 40;

        Pingu pingu = new Pingu("Pingu", "2020|02", "via Mail", "Fishsticks", "Pingu for #President");
        pingu.getName();
        pingu.getArrivalTime();
        pingu.getArrivedhow();
        pingu.getFavoritefood();
        pingu.getSlogan();

        System.out.println(line.repeat(repeat) + "\n");

        Giuliano giuliano = new Giuliano("", "", "", "", "");
        giuliano.getName();
        giuliano.getArrivalTime();
        giuliano.getArrivedhow();
        giuliano.getFavoritefood();
        giuliano.getSlogan();

        System.out.println(line.repeat(repeat) + "\n");

        Peter2 peter2 = new Peter2("", "", "", "", "");
        peter2.getName();
        peter2.getArrivalTime();
        peter2.getArrivedhow();
        peter2.getFavoritefood();
        peter2.getSlogan();

        System.out.println(line.repeat(repeat) + "\n");

        Piti piti = new Piti("", "", "", "", "");
        piti.getName();
        piti.getArrivalTime();
        piti.getArrivedhow();
        piti.getFavoritefood();
        piti.getSlogan();

        System.out.println(line.repeat(repeat) + "\n");

        Pacas pacas = new Pacas("", "", "", "", "");
        pacas.getName();
        pacas.getArrivalTime();
        pacas.getArrivedhow();
        pacas.getFavoritefood();
        pacas.getSlogan();

        System.out.println(line.repeat(repeat) + "\n");

        Unnamed unnamed = new Unnamed("", "", "", "", "");
        unnamed.getName();
        unnamed.getArrivalTime();
        unnamed.getArrivedhow();
        unnamed.getFavoritefood();
        unnamed.getSlogan();

    }
}