package homework5;

import javax.swing.JOptionPane;

public class Restangle {

    // свойства класса
    public double length; // длина прямоугольника
    public double width; // ширина прямоугольника
    public double angle1; // величина 1 угла в градусах
    public double angle2; // величина 2 угла в градусах
    public double angle3; // величина 3 угла в градусах
    public double angle4; // величина 4 угла в градусах

    public Restangle() {
        length = 1;
        width = 1;
        angle1 = 90.0;
        angle2 = 90.0;
        angle3 = 90.0;
        angle4 = 90.0;
    }

    public Restangle(double x1, double x2, double x3, double x4, double x5, double x6) {
        length = x1;
        width = x2;
        angle1 = x3;
        angle2 = x4;
        angle3 = x5;
        angle4 = x6;
    }

    public void testAngles(double x3, double x4, double x5, double x6) {
        if (x3 != 90.0 || x4 != 90.0 || x5 != 90.0 || x6 != 90.0) {
            System.out.println("Неверно заданы углы прямоугольника. В прямоугольнике углы должны быть 90%");
        }
        return;
    }

    public void testSidesOfRestangle(double x1, double x2) {
        if (x1 <= 0 || x2 <= 0) {
            System.out.println("Неверно заданы стороны прямоугольника. В прямоугольнике стороны должны быть больше нуля");
        }
        return;
    }

    public void comparisonOfRestangle(double x1, double x2, double x3, double x4) {
        JOptionPane.showMessageDialog(null, "Площадь первого прямоугольника равна: " + (x1 * x2) + " ;  площадь второго прямоугольника равна: " + (x3 * x4));
        if ((x1 * x2) == (x3 * x4)) {
            JOptionPane.showMessageDialog(null, "Таким образом, площади 1 и 2 прямоугольников равны");
        } else {
            JOptionPane.showMessageDialog(null, "Таким образом, площади 1 и 2 прямоугольников не равны");
        }
        return;
    }

}
