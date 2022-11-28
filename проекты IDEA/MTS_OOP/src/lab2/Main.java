package lab2;

public class Main {
    public static void main(String[] args) {
        Parallelogram par1 = new Parallelogram("blue", 5,6,2);

        Triangle tr1 = new Triangle("red",3,5,6);

        Polygon polygon1 = new Polygon();
        polygon1.setTop(3,4);
        polygon1.setTop(5,6);
        polygon1.setTop(9,4);
        polygon1.setTop(12,8);

        polygon1.setTop(5,11);
        // Зададим один и тот же ромб всеми четырьмя возможными комбинациями
        Romb romb1 = new Romb(1,3,2,5,3,3,2,1);   // Ромб задан верно
        Romb romb2 = new Romb(2,1,1,3,2,5,3,3);   // Ромб задан верно
        Romb romb3 = new Romb(3,3,2,1,1,3,2,5);   // Ромб задан верно
        Romb romb4 = new Romb(2,5,3,3,2,1,1,3);   // Ромб задан верно
        Romb romb5 = new Romb(20,5,3,3,2,1,1,3);  // Заданная фигура не является ромбом...

        System.out.println(par1);

        System.out.println(tr1);

        System.out.println(polygon1);
        polygon1.coordinateOutput();

        System.out.println(romb1);
        romb1.coordinateOutput();

        par1.setH(77);  // Выведет: "Высота не может превышать длину боковой стороны! Новое значение не установлено."
        System.out.println(par1.getH());   // Выведет неизмененное значение высоты, то есть - 2.0
    }
}
