public class Circle {
    double banKinh;
    public double Area() {
        return Math.PI * banKinh * banKinh;
    }
    public double Perimeter() {
        return 2 * Math.PI * banKinh;
    }
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.banKinh = 4;
        double dienTich = circle.Area();
        double chuVi = circle.Perimeter();
        System.out.printf("Dien tich hinh tron la: %f %n", dienTich);
        System.out.printf("Chu vi hinh tron la: %f %n", chuVi);
    }
}
