package thirdKT.twentytwo;

public class Square1 {
    public double calculateArea(double a, double b, double c) {
        double s = (a + b + c) / 2;
        double A = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        return A;
    }

    Square1 triangle = new Square1();
    double area = triangle.calculateArea(3, 4, 5);


}