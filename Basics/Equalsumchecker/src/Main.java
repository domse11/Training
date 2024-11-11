//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        hasEqualSum(1,1,2);
        hasEqualSum(1,2,4);
        hasEqualSum(2,2,6);
        hasEqualSum(1,3,9);

    }

    public static boolean hasEqualSum(int param1, int param2, int param3){

        if (param1+param2 == param3){
            System.out.println("true");
            return true;
        }else
            System.out.println("false");
            return false;
    }

}