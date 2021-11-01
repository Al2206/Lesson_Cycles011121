//9) Реализовать следующую задачу: Вывести в консоль квадраты чисел от 1 до 15.
// Пример: первая итерация - 1^2; вторая итерация - 2^2 и так далее
package HomeWork;

public class Exercise9 {
    public static void main(String[] args) {
        for (int a = 1; a < 16 ; a ++ ){
            System.out.println(a +  " ^ " + "2" + "=" + Math.pow(a, 2));
        }
    }
}
