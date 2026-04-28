abstract class Shape {
    abstract double area();
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double area() {
        return Math.PI * radius * radius;
    }
}

class Triangle extends Shape {
    double base, height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    double area() {
        return 0.5 * base * height;
    }
}

public class demo2 {
    public static void main(String[] args) {
        Shape s1 = new Circle(5);
        Shape s2 = new Triangle(4, 6);

        System.out.println(s1.area());
        System.out.println(s2.area());
    }
}
