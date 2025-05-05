//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Test 1: ein Argument (Zahl)
        int anzahl1 = argumentsLength(5);
        System.out.println("Test 1: " + anzahl1);  // Ausgabe: 1

        // Test 2: drei Argumente (ein Objekt, null, ein String)
        int anzahl2 = argumentsLength(new Object(), null, "3");
        System.out.println("Test 2: " + anzahl2);  // Ausgabe: 3

        // Test 3: kein Argument
        int anzahl3 = argumentsLength();
        System.out.println("Test 3: " + anzahl3);  // Ausgabe: 0

        // Test 4: fünf Argumente (zwei Objekte, zwei null, ein String)
        int anzahl4 = argumentsLength(new Object(), new Object(), null, "4", null);
        System.out.println("Test 4: "+ anzahl4); // Ausgabe 5
    }

    public static int argumentsLength(Object... args) {
        return args.length;
    }

}