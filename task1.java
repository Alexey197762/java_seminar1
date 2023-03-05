import java.util.Scanner;

public class task1 {

    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите число: ");
        int i = iScanner.nextInt();
        System.out.printf("число n: %d\n", number(i));
        iScanner.close();
    }

    public static int number(int a) {
        return (a * (a + 1)) / 2;
    }
}