public class Main {
    public static void main(String[] args) {
        // Задание 3
        // Second level: Задание 3.
        //Дан целочисленный массив типа int. Реализовать метод, который будет на вход принимать массив,
        // а на выходе формировать новый массив такого же размера, но который будет содержать только
        // уникальные (не повторяющиеся) значения. К примеру, дан массив
        //[2, 0, 1, 6, 7, 4, 1, 22, 1, 0, 1, 2, 1, 6, 15, 4, 1], нужен метод, который на вход будет
        // принимать массив, а на выход отдавать массив вида
        //[2, 0, 1, 6, 7, 4, 22, 15, 0, 0, 0, 0, 0, 0, 0, 0, 0]

        int[] array = {2, 0, 1, 6, 7, 4, 1, 22, 1, 0, 1, 2, 1, 6, 15, 4, 1}; // исходный массив
        int[] result = null;

        result = norepeat(array);

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

    public static int[] norepeat(int[] array) {
        int[] result_array = new int[array.length]; // задали новый массив равной длины
        int i,j = 0;

        // берём элемент из первого массива и ищем совпадающие значения дальше в массиве
        for (i = 0; i < array.length; i++) {
            result_array[i]=array[i]; // копируем значение в новый массив
            for (j = i+1; j < array.length; j++)
                if (array[i] == array[j]) array[j]=0;
        }
        return result_array;
    }
}