
// https://leetcode.com/problems/roman-to-integer/description/

import java.util.HashMap;
import java.util.Map;

public class Main {

    public int romanToInt(String s) {

        // Map mit den römischen Zeichen und Werten (Key-Value Pairs)
        Map<Character, Integer> roman = new HashMap<>();
        roman.put('I', 1);
        roman.put('V', 5);
        roman.put('X', 10);
        roman.put('L', 50);
        roman.put('C', 100);
        roman.put('D', 500);
        roman.put('M', 1000);

        // Ergebnis-Variable
        int result = 0;

        // Durch den String laufen
        for (int i = 0; i < s.length(); i++) {
            int current = roman.get(s.charAt(i));

            // Wenn es einen nächsten Buchstaben gibt UND der aktuelle ist kleiner als der nächste → subtrahieren
            if (i + 1 < s.length() && current < roman.get(s.charAt(i + 1))) {
                result = result - current; // z.B. I (1) vor V (5) wird zu (IV) => 5 -t 1 = 4
            } else {
                result += current; // normal addieren
            }
        }

        return result;
    }


    public static void main(String[] args) {

        Main converter = new Main();

        System.out.println("III = " + converter.romanToInt("III"));                 // 3
        System.out.println("IV = " + converter.romanToInt("IV"));                   // 4
        System.out.println("LVIII = " + converter.romanToInt("LVIII"));             // 58
        System.out.println("MCCCXXXVII = " + converter.romanToInt("MCCCXXXVII"));   // 1337
        System.out.println("MCMXCIV = " + converter.romanToInt("MCMXCIV"));         // 1994
        System.out.println("CMLXX = " + converter.romanToInt("CMLXX"));                // 970

    }


}
