import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        for(int i = 10; i <= 10_000; i*=10){
            showTime(i);
        }
    }
    private static void showTime(int i) {
        int[] numbers = new int[i];
        generate(numbers);
        long start = System.currentTimeMillis();
        sort(numbers);
        showNumbers(numbers);
        long finish = System.currentTimeMillis();
        System.out.println("Сортировка " + i + " элементов заняла " + (finish - start) + " миллисекунд");
    }
    private static void showNumbers(int[] numbers) {
        for(int i: numbers) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    private static void generate(int[] numbers) {
        for(int i =0; i < numbers.length; i++) {
            numbers[i]=(int)(Math.random() * 1000);
        }
    }
    public static void sort(int[] numbers) {    // Реализовали метод sort, который на вход принимает массив целых чисел
        for(int i = numbers.length - 1; i > 0; i--) { // Идём с конца массива к началу
            for(int j = 0; j < i; j++) { // идём от начала массива до фиксированного значения i
                if(numbers[j] > numbers[j+1]) { // сравниваем два соседних элемента, если элемент слева больше чем элемент справа, то меняем их местами
                    int tmp = numbers[j]; // чтобы поменять их местами мы используем вспомогательную переменную
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = tmp;
                }
            }
        }

    }
}

// выдать промежуток в миллисекундах за сколько отработала сортировка