//3) Реализовать следующую задачу: Вывести на экран сумму чисел кратных 3
// в диапазоне от -99 до +299
package HomeWork;

public class Exercise3 {
    public static void main(String[] args) {
        int a = 0;
        for (int i = -99; i <300; i ++){
            if (i % 3 == 0) {
                a = a + i;
            }
        }
        System.out.println("Сумма всех чисел  кратных 3-м в диапазоне от -99 до 300: " + a);
    }
}
