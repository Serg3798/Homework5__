package homework5;

import javax.swing.JOptionPane;

public class Circle {

    // свойства класса
    public double сoordinateСenter1; // координата центра окружности №1
    public double сoordinateСenter2; // координата центра окружности №2
    public double radius; // радиус окружности

    public Circle() {
        сoordinateСenter1 = 1;
        сoordinateСenter2 = 1;
        radius = 1;
    }

    public Circle(double x1, double x2, double x3) {
        сoordinateСenter1 = x1;
        сoordinateСenter2 = x2;
        radius = x3;
    }

    public void testCoordinate(double x1, double x2) {
        if (x1 < 0 || x2 < 0) {
            System.out.println("Неверно заданы координаты окружности. Они не могут быть меньше нуля");
        }
        return;
    }

    public void testRadius(double x1) {
        if (x1 <= 0) {
            System.out.println("Неверно задан радиус окружности. Радиус окружности должны быть больше нуля");
        }
        return;
    }

    public void comparisonOfCircle(double x1, double x2) {
        JOptionPane.showMessageDialog(null, "Площадь первой окружности равна: " + (Math.PI * x1 * x1) + " ;  площадь второй окружности равна: " + (Math.PI * x2 * x2));
        if ((Math.PI * x1 * x1) == (Math.PI * x2 * x2)) {
            JOptionPane.showMessageDialog(null, "Таким образом, площади 1 и 2 окружностей равны");
        } else {
            JOptionPane.showMessageDialog(null, "Таким образом, площади 1 и 2 окружностей не равны");
        }
        return;
    }
}
