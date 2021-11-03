//1) Реализовать следующую задачу: Вывести на экран все числа
// в промежутке от a-b до a+b.
// Числа a,b вводятся с клавиатуры
package HomeWork;
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        int a , b;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число a:  ");
        a = in.nextInt();
        System.out.println("Введите число b:  ");
        b = in.nextInt();
        for(int i = a - b ; i <= (a + b); i++ ){ //Исправлено условие  сравнения
            System.out.println(i);
        }
    }
}

