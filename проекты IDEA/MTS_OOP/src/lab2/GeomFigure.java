package lab2;

public abstract class GeomFigure {

    private String color;

    public void setColor(String new_color) {        // сетер
        color = new_color;
    }
    public String getColor() {       // гетер
        return color;
    }

    public abstract double getPerimeter();

    public abstract double getArea();

    public abstract String toString();

}
