package different;
public class Main {
    public static void main(String[] args) {
        // Задание 2
        // Даны 2 целочисленных массива типа int. Реализовать метод, который будет отдавать на выход
        // новый массив, который будет содержать числа, которые присутствуют в одном массиве и
        // отсутствуют в другом. К примеру, даны массивы [2, 0, 1, 6, 7, 4] и [20, 1, 0, 2, 55, 6, 7]
        // нужен метод, который на вход принимает 2 массива, а в результате работы отдает новый массив
        // в виде [4, 20, 55]
        // Примечание: длину выходного массива можно задать как длина 1 массива + длинна 2 массива.
        int[] array1 = {2, 0, 1, 6, 7, 4}; // массив номер 1
        int[] array2 = {20, 1, 0, 2, 55, 6, 7}; // массив номер 2
        int[] result = null;

        result = messeofmass(array1, array2);

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

    public static int[] messeofmass(int[] array1, int[] array2) {
        int[] result_array = new int[array1.length + array2.length];
        int i,j,k = 0;
        boolean flag;
        // берём элемент из первого массива и ищем несовпадения во втором
        for (i = 0; i < array1.length; i++) {
            flag=false;
            for (j = 0; j < array2.length; j++)
                if (array1[i] == array2[j]) {flag = true; break;}

            if(flag==false) result_array[k++] = array1[i];

        }
        // берём элемент из второго массива и ищем несовпадения в первом
        for (i = 0; i < array2.length; i++) {
            flag=false;
            for (j = 0; j < array1.length; j++)
                if (array2[i] == array1[j]) {flag = true; break;}

            if(flag==false) result_array[k++] = array2[i];

        }
        int[] compresst_result= new int [k];
        while (k > 0) {compresst_result[k-1]=result_array[k-1];k--;}

        return compresst_result;
    }
}