//5) Реализовать следующую задачу: Вывести на экран таблицу
// умножение на число A. Число A вводится с клавиатуры
package HomeWork;
import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        int a;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число a:  ");
        a = in.nextInt();
        for(int i = 1; i <= 10; i++ ){
            System.out.printf("Произведение %d *" + i + "= %d \n" , a,  a * i);
        }
    }
}