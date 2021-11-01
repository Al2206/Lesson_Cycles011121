//7) Реализовать следующую задачу: Вывести на экран таблицу
// значений (x+5)/4. Значения x в диапазон от 11 до 25
package HomeWork;

public class Exercise7 {
    public static void main(String[] args) {
        for (double result = 1, x = 11; x < 26; x++){
            result = (x + 5) / 4;
            System.out.println("("+ x + "+ 5) / 4 =" + result);
        }
    }
}