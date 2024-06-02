public class Car {
    int speed = 0;

    public int upTo20() {
        speed += 20;
        return speed;
    }

    public int upTo40() {
        speed += 40;
        return speed;
    }

    public int upTo60() {
        speed += 60;
        return speed;
    }

    public static void main(String[] args) {
        Car car1 = new Car();
        
        int toLanThu1 = car1.upTo20();
        System.out.printf("Toc do xe trong lan tang thu nhat: %d km/h %n", toLanThu1);
        
        int toLanThu2 = car1.upTo40();
        System.out.printf("Toc do xe trong lan tang thu hai: %d km/h %n", toLanThu2);
        
        int toLanThu3 = car1.upTo60();
        System.out.printf("Toc do xe trong lan tang thu ba: %d km/h %n", toLanThu3);
        
        int toLanThu4 = car1.upTo20();
        System.out.printf("Toc do xe trong lan tang thu tu: %d km/h %n", toLanThu4);
    }
}
