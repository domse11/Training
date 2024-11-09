import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("enter your birthday");
        int dateofbirth = scanner.nextInt();

        int currentyear = 2024;

        int birthday = currentyear - dateofbirth;

        System.out.println("you are: " + birthday + " years old");
    }


}