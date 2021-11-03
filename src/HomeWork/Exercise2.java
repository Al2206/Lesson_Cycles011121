//2) Реализовать следующую задачу: Вывести на экран
// квадраты чисел от 1 до 15.
package HomeWork;

public class Exercise2 {
    public static void main(String[] args) {
        for (int a = 1; a < 16; a ++ ) {
            System.out.println("Квадрат числа " +  a + " равен " + Math.pow(a, 2));// исправлено
        }
    }
}
