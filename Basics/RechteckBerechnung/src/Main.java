
public class Main {
    public static void main(String[] args) {

        System.out.println("Der Flächeninhalt = " + Flächeninhalt(12, 14));
        System.out.println("Der Umfang = " + Umfang(12, 14));

    }

    public static int Flächeninhalt(int länge, int breite) {

        return länge * breite;
    }

    public static int Umfang(int länge, int breite) {

        return 2 * (länge + breite);
    }
}