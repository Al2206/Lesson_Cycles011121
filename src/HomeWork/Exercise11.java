//11) Реализовать следующую задачу: Найти сумму всех чисел
// которые делятся на 2 в диапазоне от 20 до 999. Вывести результат в консоль
package HomeWork;
public class Exercise11 {
    public static void main(String[] args){
        int a = 0;
        for (int i = 20; i <1000; i += 2){
            if (i % 2 == 0) {
                a = a + i;
            }
        }
        System.out.println("Сумма всех  чётных чисел в диапазоне от 20 до 999: " + a);
    }
}
