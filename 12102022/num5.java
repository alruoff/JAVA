public class Main {
    public static void main(String[] args) {
        /*
        Second level: Объявите 10 переменных типа int со значениями 
	0,1, 2, 3, 4, 5, 6, 7, 8, 9.
        Объявите ещё одну переменную int и сохраните в неё сумму этих переменных,
	деленную на 10.
        Получается, у вас будет среднее арифметическое этих чисел в одной переменной.
        Распечатайте её через println.
        */
        
	int n0=0,n1=1,n2=3,n3=3,n4=4,n5=5,n6=6,n7=7,n8=8,n9=9;
        float avg=(n0+n1+n2+n3+n4+n5+n6+n7+n8+n9)/10f;

        System.out.print("Среднее арифметическое = ");System.out.println(avg);

    }
}