import java.util.zip.ZipFile;

public class Main {
    // First level: Задание 1.
    // Дан произвольный текст. Создать метод, который на вход принимает данных текст,
    // на выходе отдает массив, который будет содержать слова длинной больше 7 символов,
    // причем первая и последняя буква должны быть изменены на большие.
    // Например дан текст: "Это предложение содержит какие-то слова с большой длиной".
    // В результате работы метод должен отдать массив такого вида:
    // ["ПредложениЕ", "СодержиТ", "Какие-тО", "БольшоЙ"]


    public static void main(String[] args) {

        String Str = new String ("Это предложение содержит какие-то слова с большой длиной") ;
        String[] result=null;

        result= Method(Str);

    }

    static public String[] Method(String Str) {
        String[] ArrayStr = Str.split(" ");
        String[] resArray = new String[ArrayStr.length];
        int k = ArrayStr.length;
        char[] buffer = null;

        while (k > 0) {
            for (int i = 0, j = 0; i < ArrayStr.length; i++) {
                if (ArrayStr[i].length() >= 7) {
                    resArray[j] = ArrayStr[i];
                    buffer = resArray[j].toCharArray();
                    buffer[0] = Character.toUpperCase(buffer[0]);
                    buffer[resArray[j].length() - 1] = Character.toUpperCase(buffer[resArray[j].length() - 1]);
                    resArray[j] = String.copyValueOf(buffer);
                    j++;
                } k--;

            }

        }
        return resArray;
    }

}
