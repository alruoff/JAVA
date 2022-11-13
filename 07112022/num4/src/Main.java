import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Задание 4
        // Дан целочисленный массив типа int. Реализовать метод, который будет на вход принимать массив,
        // а на выходе формировать новый массив такого же размера, но который будет содержать только
        // уникальные (не повторяющиеся) значения  и значения в этом массиве должны быть
        // отсортированными в порядке увеличения. К примеру, дан массив
        //[2, 0, 1, 6, 7, 4, 1, 22, 1, 0, 1, 2, 1, 6, 15, 4, 1], нужен метод, который на вход
        // будет принимать массив, а на выход отдавать массив вида
        //[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 2, 4, 6, 7, 15, 22]

        int[] array = {2, 0, 1, 6, 7, 4, 1, 22 , 1, 0, 1, 2, 1, 6, 15, 4, 1}; // исходный массив
        int[] result = null;

        result = norepeat(array);

        sorted(result);
        // вывод результата в стд.поток
        int i = 0;
        System.out.print("Результирующий массив:");
        System.out.print("{ ");
        while (i < result.length) {
            System.out.print(result[i]);
            System.out.print(", ");
            i++;
        }
        // System.out.print(result[i]);
        System.out.println(" }");
    }

    // убираем повторяющиеся значения
    public static int[] norepeat(int[] array) {
        int[] result_array = new int[array.length]; // задали новый массив равной длины
        int i, j = 0;

        // берём элемент из первого массива и ищем совпадающие значения дальше в массиве
        for (i = 0; i < array.length; i++) {
            result_array[i] = array[i]; // копируем значение в новый массив
            for (j = i + 1; j < array.length; j++)
                if (array[i] == array[j]) array[j] = 0;
        }
        return result_array;
    }

    public static void sorted(int[] array) {
        int i = 0;
        boolean bSwapFlag = true;
        int elem_temp = 0;

        // сортировка пузырьком по возрастанию
            while (bSwapFlag == true) {
                bSwapFlag=false;// до тех пор пока был хотя б один swap
                for (i = 0; i < (array.length - 1); i++)
                    if (array[i] > array[i + 1]) {
                        elem_temp = array[i]; // swap
                        array[i] = array[i + 1]; // swap
                        array[i + 1] = elem_temp; // swap
                        bSwapFlag = true; // при просмотре массива был swap
                    }
            }
    }
}