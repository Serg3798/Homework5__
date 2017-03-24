package homework5;

import javax.swing.JOptionPane;

public class RegularPolygon {
    
     // свойства класса
    public int numberofAngles; // количество углов правильного многоугольника
    public double sideLength; // длина стороны мноугольника

    public RegularPolygon() {
        numberofAngles = 7;
        sideLength = 6;
    }

    public RegularPolygon(int x1, double x2) {
        numberofAngles = x1;
        sideLength = x2;
    }

    public void testAngle(int x1) {
        if (x1 < 3) {
            System.out.println("Неверно заданo количество углов в многоугольнике. Оно должно быть не меньше 3");
        }
        return;
    }
    
     public void testSideLength(double x2) {
        if (x2 <= 0) {
            System.out.println("Неверно задана длина стороны многоугольника. Она должна быть больше нуля");
        }
        return;
    }

    public void calculatingRegularPolygon(int x1, double x2) {
        JOptionPane.showMessageDialog(null, "Радиус описанной вокруг многоугольника окружности равен: " + (x2/(2*(Math.sin(Math.PI/x1)))));
        JOptionPane.showMessageDialog(null, "Периметр многоугольника равен: " + (x2*x1));
        return;
    }
        
}
