public class Main {
    public static void main(String[] args) {

        System.out.println(sayHello("Franz"));

        System.out.println(gibName());

        begruessungMitName("Andreas");

        System.out.println(addiere(4, 5));

        System.out.println(max(20, 100));

        System.out.println(quadrat(50, 200));

        System.out.println(istGerade(3));

        System.out.println(istVolljaehrig(18));

        bewerteNote(0);
        bewerteNote(5);

        System.out.println(bewertenoteswitch(1));

    }

    public static String sayHello(String name) {
        return "Hello User " + name;
    }

    public static String gibName() {
        return "Hello my name is Max";
    }

    public static void begruessungMitName(String name) {
        System.out.println(name);
    }

    public static int addiere(int a, int b) {
        return a + b;
    }

    public static int max(int a, int b) {
        return Math.max(a, b);
    }

    public static int quadrat(int a, int b) {
        return a * b / 2;
    }

    public static boolean istGerade(int a) {
        if (a % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean istVolljaehrig(int alter) {
        if (alter >= 18) {
            return true;
        } else {
            return false;
        }
    }

    public static int bewerteNote(int Note) {
        if (Note == 1) {
            System.out.println("Sehr gut");
        }
        if (Note == 2) {
            System.out.println("Gut");
        }
        if (Note == 3) {
            System.out.println("Befriedigend");
        }
        if (Note == 4) {
            System.out.println("Genügend");
        }
        if (Note == 5) {
            System.out.println("Nicht Genügend");
        }
        else if (Note < 1 || Note > 5) {
            System.out.println("Ungültig");
        }
        return Note;
    }

    public static String bewertenoteswitch(int note){
        return switch (note){
            case 1 -> "Sehr gut";
            case 2 -> "Gut";
            case 3 -> "Befriedigend";
            case 4 -> "Genügend";
            case 5 -> "Nicht Genügend";
            default -> "Ungültig";
        };


    }


}