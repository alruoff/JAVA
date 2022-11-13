public class Main {
    public static void main(String[] args) {
        /* Автобус движется по маршруту длиной 15 км со скоростью 42 км в час.
        Каждые 30 секунд вывести на экран информацию о перемещении автобуса в формате:
            Время движения автобуса = ?
            Пройденное расстояние = ?
        В конце вывести итоговую информацию: Общее время движения автобуса = ? */

        double Dis=15; // км
        double Speed=42; // км/ч
        final int INTERVAL=30; // шаг времени для отсчёта
        double peremenn=0;//пройденное расстояние на данный момент в км
        int time=0; //текущее время в сек

        while(peremenn <= Dis)
            {
                System.out.println("Время движения автобуса = " + time + " секунд.");
                System.out.println("Пройденное расстояние = " + peremenn + " км.");
                peremenn += Speed*INTERVAL/3600;
                time += INTERVAL;
            }
                System.out.println("Время движения автобуса = " + time + " секунд.");
                System.out.println("Пройденное расстояние = "+ Dis +" км.");

        System.out.println("Общее время движения автобуса = " + time + " секунд.");
    }
}