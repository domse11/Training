import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        LoginService loginService = new LoginService();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bitte geben Sie ihren Username an");
        String username = scanner.nextLine().trim();

        System.out.println("Bitte geben Sie ihre Passwort an");
        String password = scanner.nextLine().trim();

        String ergebnis = loginService.login(username, password);
        System.out.println(ergebnis);

    }


    public static class LoginService {
        private Map<String, User> userDatabase = new HashMap<>();

        public LoginService() {
            userDatabase.put("user1", new User("franz", "password123"));
            userDatabase.put("user2", new User("dominique", "dominique123"));

            System.out.println("Inhalt der Benutzer-Datenbank:");
            for (String key : userDatabase.keySet()) {
                System.out.println("Benutzername: " + key + ", Passwort: " + userDatabase.get(key).getPassword());
            }
        }

        public String login(String username, String password) {
            User user = userDatabase.get(username);

            if (user != null && user.checkPassword(password)) {
                return "Login erfolgreich";
            } else {
                return "Login fehlgeschlagen. Untgültiges Password";
            }
        }
    }

    public static class User {
        private String username;
        private String password;

        public User(String username, String password) {
            this.username = username;
            this.password = password;
        }

        public String getUsername() {
            return username;
        }

        public String getPassword() {
            return password;
        }

        public boolean checkPassword(String password) {
            return this.password.equals(password);
        }
    }
}