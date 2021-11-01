//8) Реализовать следующую задачу: Исходные данные - a=1, b=5.
// Пока переменная a меньше 10 требуется, чтобы переменная переменная result
// суммировалась с переменной b. Результат вывести в консоль.
// Пример: первая итерация - 0+5=5; вторая итерация - 5+5=10; третья итерация - 10+5=15 и так далее
package HomeWork;

public class Exercise8 {
    public static void main(String[] args) {
        for (int a = 1, b = 5, result = 0;a < 11 ; a++ ) {
            result = result + b;
            System.out.println(result);
        }
    }
}
