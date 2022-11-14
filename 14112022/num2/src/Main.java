public class Main {
    // Задание 2.
    // Реализовать метод, который на вход принимает строку, а на выход отдает перевернутую строку.
    // К примеру есть текст "Привет этот дивный мир", на выходе мы должны иметь новую строку вида
    // "рим йынвид тотэ тевирП".
    public static void main(String[] args) {

        String Str = new String ("Привет о этот дивный мир") ;
        String result=null;

        result= Method2(Str);

    }

    static public String Method2(String Str) {

        String resString = new String();
        char[] buffer = Str.toCharArray();
        int k = Str.length();
        int MaxLenght=k;
        char temp = 0;
        int i = 0;

        while (k > 0 && i < MaxLenght/2) {

                    temp=buffer[i];
                    buffer[i] = buffer[k-1];
                    buffer[k-1] = temp;

                 k--; i++;

        }
        return resString = String.copyValueOf(buffer);

    }
}