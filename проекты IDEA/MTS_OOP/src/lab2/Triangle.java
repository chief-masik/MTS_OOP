package lab2;

class Triangle extends GeomFigure {

    private double a;
    private double b;
    private double c;

    public  Triangle() {                                               // конструктор
        setColor("white");
        a = 1;
        b = 1;
        c = 1;
    }
    public  Triangle(String color) {                                   // конструктор
        setColor(color);
        a = 1;
        b = 1;
        c = 1;
    }
    public  Triangle(String color, double a, double b, double c) {     // конструктор
        setColor(color);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void setA(double a) {                    // сетер
        this.a = a;
    }
    public void setB(double b) {                    // сетер
        this.b = b;
    }
    public void setC(double c) {                    // сетер
        this.c = c;
    }

    public double getA() {         // гетер
        return a;
    }
    public double getB() {         // гетер
        return b;
    }
    public double getC() {         // гетер
        return c;
    }

    @Override
    public double getPerimeter() {  // периметра
        return a + b + c;
    }
    @Override
    public double getArea() {       // площадь
        return Math.sqrt(getPerimeter() * (b + c) * (a + c) * (a + b));    // Формула Герона для площади треугольника
    }

    @Override
    public String toString() {
        return ("Треугольник имеет: цвет - " + getColor() + ", длины сторон: " + a + ", " + b + ", " + c + "; площадь = " + getArea() + ", периметр = " + getPerimeter());
    }

}
