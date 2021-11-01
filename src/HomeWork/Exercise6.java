//6) Реализовать следующую задачу: Вывести на экран
// все трехзначные числа, у которых сумма цифр равна 9
package HomeWork;

public class Exercise6 {
    public static void main(String[] args) {
        int i;
        for (int a = 100; a < 1000;  a ++, i++ ) {
            i = ((a % 10) + ((a / 10) % 10) + (a / 100) % 10);
            if (i == 9){
            System.out.println(" Сумма числа " + a + " равна " + i );
            }
        }
    }
}
