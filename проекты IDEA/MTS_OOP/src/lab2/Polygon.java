package lab2;

public class Polygon extends GeomFigure implements WithAngles {
    private int size = 0;
    private int[][] array = new int[50][2];  // Инициализация двойного массива вершин фигуры

    public Polygon() {                // Конструктор
        setColor("white");
    }
    public Polygon(String color) {    // Конструктор
        setColor(color);
    }

    public void setTop(int x, int y) {   // Ввод новой вершины в массив
        if (size != array.length) {
            array[size][0] = x;
            array[size][1] = y;
            size++;
        }
        else System.out.println("Массив переполнен!");
    }

    @Override
    public void coordinateOutput() {      // Вывод координат всех вершин
        System.out.println("Координаты многоугольника с " + size + " вершинами:");
        for(int n = 0 ; n < size; n++) {
            System.out.println((n+1) + " вершина:  x - " + array[n][0] + "    y - " + array[n][1]);
        }
    }

    @Override
    public double getArea() {    // Метод Гаусса
        double s = 0;
        for (int n = 0; n < size - 1; n++) {
            s += array[n][0] * array[n+1][1];
        }
        s += array[size - 1][0] * array[0][1];
        for (int n = 1; n < size; n++) {
            s -= array[n][0] * array[n-1][1];
        }
        s -= array[0][0] * array[size - 1][1];
        s = Math.abs(s / 2);
        return s;
    }

    @Override
    public double getPerimeter() {
        double p = 0;
        for (int n = 0; n < size - 1; n++) {
            p += Math.sqrt((array[n+1][0] - array[n][0]) * (array[n+1][0] - array[n][0]) + (array[n+1][1] - array[n][1]) * (array[n+1][1] - array[n][1]));
        }
        p +=Math.sqrt((array[size - 1][0] - array[0][0]) * (array[size - 1][0] - array[0][0]) + (array[size - 1][1] - array[0][1]) * (array[size - 1][1] - array[0][1]));
        return p;
    }

    @Override
    public String toString() {
        return "Произвольная фигура с " + size + " вершинами имеет: цвет - " + getColor() + ", периметр - " + getPerimeter() + ", площадь - " + getArea();
    }
}
