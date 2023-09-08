import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     int x = 1;
     int number;
        System.out.println("napisz liczbe");
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();
     for(int i=1; i<=number;i++){
         x=x*i;
     }
        System.out.println("Silnia z "+number+ " wynosi " +x);
    }
}