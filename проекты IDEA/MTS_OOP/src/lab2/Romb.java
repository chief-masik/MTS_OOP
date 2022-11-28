package lab2;

public class Romb extends Polygon implements Size {
    public Romb(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
        setTop(x1, y1);
        setTop(x2, y2);
        setTop(x3, y3);
        setTop(x4, y4);
        rombTest(x1, y1, x2, y2, x3, y3, x4, y4);
    }
    public Romb(String color, int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
        setColor(color);
        setTop(x1, y1);
        setTop(x2, y2);
        setTop(x3, y3);
        setTop(x4, y4);
        rombTest(x1, y1, x2, y2, x3, y3, x4, y4);
    }

    private void rombTest(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {  // проверка на ромб по координатам. Принцип работы долго объяснять словами, просто поверь наслово :)
        if (x1 - x2 == x4 - x3 && y1 - y2 == y4 - y3 && x4 - x1 == x3 - x2 && y4 - y1 == y3 - y2 && Math.abs(x1 - x2) == Math.abs(x1 - x4) && Math.abs(y1 - y2) == Math.abs(y1 - y4)) {
            System.out.println("Ромб задан верно");
        }
        else {
            System.out.println("Заданная фигура не является ромбом. Дальнейшая работа с созданным объектом может привести к ложным результатам!");
        }
    }

    @Override
    public String sizeDeterminer() {
        if (getArea() < 10) return "small";
        else if (getArea() < 70) return "medium";
        else return "large";
    }

    @Override
    public String toString() {
        return "Ромб имеет: цвет - " + getColor() + ", периметр - " + getPerimeter() + ", площадь - " + getArea() + ", размер - " + sizeDeterminer();
    }
}
