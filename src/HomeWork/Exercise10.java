//10) Реализовать следующую задачу: Сложить числа от 1 до 100 использую цикл while.
//  Результат присвоить в переменную result, и вывести в консоль
package HomeWork;

public class Exercise10 {
    public static void main(String[] args) {
        int i = 1;
        int result = 1;
        while( i < 100) {
            i++;
            result += i;
            System.out.println(" Сумма чисел от 1 до" + " " + i + " " + " равна : " + " " + result);
        }
    }
}