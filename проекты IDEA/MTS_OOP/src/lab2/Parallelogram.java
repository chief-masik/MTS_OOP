package lab2;

class Parallelogram extends GeomFigure {
    private double a;
    private double b;
    private double h;

    public Parallelogram() {                                        // Конструктор
        setColor("white");
        a = 1;
        b = 1;
        h = 1;
    }
    public Parallelogram(String color) {                            // Конструктор
        setColor(color);
        a = 1;
        b = 1;
        h = 1;
    }
    public Parallelogram(String color, double a, double b, double h) {      // Конструктор
        setColor(color);
        this.a = a;
        this.b = b;
        if (h <= b) this.h = h;
        else {                           // иначе такой параллелограмм не возможен
            System.out.println("Высота не может превышать длину боковой стороны! Установлено значение равное боковой стороне.");
            this.h = b;
        }
    }

    public void setA(double new_a) {   // сетер
        a = new_a;
    }
    public void setB(double new_b) {   // сетер
        if (new_b >= this.h) b = new_b;                           // иначе такой параллелограмм не возможен
        else System.out.println("Боковая сторона не может быть меньше высоты! Новое значение не установлено.");
    }
    public void setH(double new_h) {   // сетер
        if (new_h <= this.b) h = new_h;                           // иначе такой параллелограмм не возможен
        else System.out.println("Высота не может превышать длину боковой стороны! Новое значение не установлено.");
    }

    public double getA() {    // гетер
        return a;
    }
    public double getB() {    // гетер
        return b;
    }
    public double getH() {    // гетер
        return h;
    }

    @Override
    public double getArea() {           // Площадь
        return a * h;
    }

    @Override
    public double getPerimeter() {      // Периметр
        return 2 * (a + b);
    }

    @Override
    public String toString() {
        return ("Параллелограмм имеет: цвет - " + getColor() + ", основание = " + a + ", боковые стороны = " + b + ", высота к основанию = " + h +"; площадь = " + getArea() + ", периметр = " + getPerimeter());
    }
}
