import java.util.Scanner;
public class AgeValidation{
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("enter yor age");
        int ageEnter= scanner.nextInt();
        final int AGE_LIMIT = 18;
        if (ageEnter >= AGE_LIMIT) {
            System.out.println("Access granted");
        }
        
        else if  (ageEnter < AGE_LIMIT) {
            System.out.println("your are minor age");
        }
        else {
            System.out.println ("acces denied");
        }
    }
}
