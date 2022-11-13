package concat;
public class Main {

    // First level: Задание 1.
    // Дано 2 целочисленных массива типа int.
    // Реализовать метод, который будет отдавать на выход новый массив,
    // который будет содержать все элементы первого массива и все элементы второго.
    // К примеру даны массивы [2, 3, 1, 6, 7, 4] и [20, 1, 33, 2, 55] нужен метод,
    // который на вход принимает 2 массива, а в результате работы отдает новый массив
    // в виде [2, 3, 1, 6, 7, 4, 20, 1, 33, 2, 55]

    public static void main (String[] args) {

        int[] array1 = {2,3,1,6,7,4}; // массив номер 1
        int[] array2 = {20,1,33,2,55}; // массив номер 2
        int[] result = null;

        result = catofmass (array1, array2);

        // вывод результата в стд.поток
        int i=0;
        System.out.print("Результирующий массив:");
        System.out.print("{ ");
        while(i++ < result.length-2) {
            System.out.print(result[i]);
            System.out.print(", ");
        }
        System.out.print(result[i]);
        System.out.println(" }");
    }

    public static int[] catofmass (int[] array1, int[] array2){
        int[] result_array= new int [array1.length+array2.length];
        int i=0;
        for (i=0;i < array1.length; i++) result_array[i]=array1[i];
        for (i=array1.length;i< array1.length+array2.length;i++) result_array[i]=array2[i-array1.length];
        return result_array;
    }
}

