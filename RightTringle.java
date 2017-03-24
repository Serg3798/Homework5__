package homework5;

import javax.swing.JOptionPane;

public class RightTringle {

    // свойства класса
    public double cathetus1; // длина 1 катета прямоугольного треугольника
    public double cathetus2; // длина 2 катета прямоугольного треугольника

    public RightTringle() {
        cathetus1 = 1;
        cathetus2 = 1;
    }

    public RightTringle(double x1, double x2) {
        cathetus1 = x1;
        cathetus2 = x2;
    }

    public void testCathetus(double x1, double x2) {
        if (x1 <= 0 || x2 <= 0) {
            System.out.println("Неверно заданы величины катетов прямоугольного треугольника. Они должны быть больше нуля");
        }
        return;
    }

    public void calculatingHeightOfTriangle(double x1, double x2) {
        JOptionPane.showMessageDialog(null, "Длина высоты, опущенной на гипотенузу прямоугольного треугольника равна: " + ((x1 * x1) / Math.sqrt((x1 * x1 + x2 * x2))));
        return;
    }
}
