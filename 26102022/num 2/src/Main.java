public class Main {
    public static void main(String[] args) {
        /* Задача на циклы + массивы.
Из массива цифр [12, 1, 32, 90, 10, 11, 30, 49, 33, 34, 27, 7, 21]
сформировать новый массив, который будет содержать только нечетные числа.
Вывести на экран новый массив и найти в нем самое большое число и также вывести на экран.

*/
       int[] MASS = { 12, 1, 32, 90, 10, 11, 30, 49, 33, 34, 27, 7, 21};

       int count1=0, count2=0, TEMP=0;

       int index = 0;
       while (index < MASS.length) {// подсчёт необх.пространства

           if (MASS[index] % 2 != 0) count1++;
           index++;
       }
       int NEW_MASS[] = new int[count1]; // получение места из кучи под новый массив

        index=0; // заполнение нового массива
        while (index < MASS.length)
       {
            if(MASS[index++]%2!=0) NEW_MASS[count2++]=MASS[index-1];
       }
       System.out.println("Итоговый массив:");
       System.out.print("[");

       index=0; // вывод на экран нового массива
       while (index < NEW_MASS.length)
       {

           System.out.print(NEW_MASS[index]);
           if(index != (NEW_MASS.length-1)) System.out.print(", ");
           if(NEW_MASS[index] > TEMP) TEMP=NEW_MASS[index];// поиск максимального элемента
           index++;

        }
       System.out.print("]\n");
        System.out.println("Максимальное значение элемента массива: "+TEMP);
    }
}
