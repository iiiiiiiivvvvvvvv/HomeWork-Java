import java.util.Scanner;

// Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! 

public class hometask01 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int i = iScanner.nextInt();
        System.out.printf("Треугольное число: %d\n", giveMeNumber(i));
        iScanner.close();
    }
    
    public static int giveMeNumber(int a) {
        return(a * (a + 1))/2;
    }
}
    
 