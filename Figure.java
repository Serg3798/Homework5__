package homework5;

import javax.swing.JOptionPane;

public class Figure {

    public static void main(String[] args) {
        String s1, s2, s3; // вспомогательные переменные
        // прямоугольник _______________________________________________________
        Restangle restangle1 = new Restangle(8, 3, 90, 90, 90, 90);
        restangle1.testAngles(restangle1.angle1, restangle1.angle2, restangle1.angle3, restangle1.angle4);
        restangle1.testSidesOfRestangle(restangle1.length, restangle1.width);
        Restangle restangle2 = new Restangle();
        // ввод значений второго прямоугольника
        s1 = JOptionPane.showInputDialog("Введите длину второго прямоугольника");
        s2 = JOptionPane.showInputDialog("Введите ширину второго прямоугольника");
        // преобразование String в Double
        restangle2.length = Double.parseDouble(s1);
        restangle2.width = Double.parseDouble(s2);
        // проверка допустимости значений для второго прямоугольника
        restangle2.testSidesOfRestangle(restangle2.length, restangle2.width);
        restangle2.testAngles(restangle2.angle1, restangle2.angle2, restangle2.angle3, restangle2.angle4);
        // сравнение площади двух прямоугольников
        restangle1.comparisonOfRestangle(restangle1.length, restangle1.width, restangle2.length, restangle2.width);
        // окружность __________________________________________________________
        Circle circle1 = new Circle(0, 0, 12);
        circle1.testCoordinate(circle1.сoordinateСenter1, circle1.сoordinateСenter2);
        circle1.testRadius(circle1.radius);
        Circle circle2 = new Circle();
        // ввод значений для второй окружности
        s1 = JOptionPane.showInputDialog("Введите для второй окружности координату центра №1");
        s2 = JOptionPane.showInputDialog("Введите для второй окружности координату центра №2");
        s3 = JOptionPane.showInputDialog("Введите для второй окружности величину радиуса");
        // преобразование String в Double
        circle2.сoordinateСenter1 = Double.parseDouble(s1);
        circle2.сoordinateСenter2 = Double.parseDouble(s2);
        circle2.radius = Double.parseDouble(s3);
        // проверка допустимости значений для второй окружности
        circle2.testCoordinate(circle2.сoordinateСenter1, circle2.сoordinateСenter2);
        circle2.testRadius(circle2.radius);
        // сравнение площади двух окружностей
        circle2.comparisonOfCircle(circle1.radius, circle2.radius);
        // прямоугольный треугольник ___________________________________________
        RightTringle rightTringle = new RightTringle();
        // ввод значений катетов для прямоугольного треугольника
        s1 = JOptionPane.showInputDialog("Введите для прямоугольного треугольника длину катета №1");
        s2 = JOptionPane.showInputDialog("Введите для прямоугольного треугольника длину катета №2");
        // преобразование String в Double
        rightTringle.cathetus1 = Double.parseDouble(s1);
        rightTringle.cathetus2 = Double.parseDouble(s2);
        // проверка допустимости значений катетов
        rightTringle.testCathetus(rightTringle.cathetus1, rightTringle.cathetus2);
        //Расчет длины высоты, опущеноой на гипотенузу прямоугольного треугольника
        rightTringle.calculatingHeightOfTriangle(rightTringle.cathetus1, rightTringle.cathetus2);
        // многоугольник _______________________________________________________
        RegularPolygon regularPolygon = new RegularPolygon();
        // ввод значений количества углов и длины стороны многоугольника
        s1 = JOptionPane.showInputDialog("Введите количество углов в правильном многоугольнике");
        s2 = JOptionPane.showInputDialog("Введите длину стороны правильного многоугольника");
        // преобразование String в int и Double соответственно
        regularPolygon.numberofAngles = Integer.parseInt(s1);
        regularPolygon.sideLength = Double.parseDouble(s2);
        // проверка допустимости значения количества углов
        regularPolygon.testAngle(regularPolygon.numberofAngles);
        // проверка допустимости значения длины стороны
        regularPolygon.testSideLength(regularPolygon.sideLength);
        //Расчет радиуса и периметра
        regularPolygon.calculatingRegularPolygon(regularPolygon.numberofAngles, regularPolygon.sideLength);
    }
}


/*
Нужно создать 4 класса, выделить что у них общего и создать обшего предка для них
1. Создайте класс прямоугольников, описав в нём все необходимые свойства, подобрав
им понятные имена и правильные типы данных.
Опишите в классе конструктор, позволяющий при создании нового объекта явно задать
все его свойства. Если это необходимо, то проверьте допустимость их значений в
конструкторе (например, в классе обыкновенных дробей нельзя создавать дробь с
нулевым знаменателем).
Создайте в классе метод, проверяющий равны ли два прямоугольника по площади.
С использованием построенного класса создайте один прямоугольник со сторонами
3 и 8 и второй прямоугольник со сторонами 6 и 4. Проверьте с помощью созданного
метода равны ли прямоугольники по площади и если да, то выведите соответсвующее
сообщение на экран.
2. http://ru.wikipedia.org/wiki/Окружность
Создайте класс окружностей на плоскости, описав в нём все необходимые свойства,
подобрав им понятные имена и правильные типы данных.
Опишите в классе конструктор, позволяющий при создании нового объекта явно задать
все его свойства. Если это необходимо, то проверьте допустимость их значений в
конструкторе (например, в классе обыкновенных дробей нельзя создавать дробь с
нулевым знаменателем).
Создайте в классе метод, проверяющий имеют ли две окружности равную площадь.
С использованием построенного класса создайте две окружности: одну с центром в
(0;0) и радиусом 12, а вторую с центром в (3;5) и радиусом 11. Проверьте с помощью
созданного метода равна ли их площадь и если равна, то выведите соответсвующее
сообщение на экран.
3. http://ru.wikipedia.org/wiki/Правильный_многоугольник
Создайте класс правильных n-угольников, описав в нём все необходимые свойства,
подобрав им понятные имена и правильные типы данных.
Опишите в классе конструктор, позволяющий при создании нового объекта явно задать
все его свойства. Если это необходимо, то проверьте допустимость их значений в
конструкторе (например, в классе обыкновенных дробей нельзя создавать дробь с
нулевым знаменателем).
Создайте в классе метод, вычисляющий радиус описанной вогруг многоугольника
окружности.
С использованием построенного класса создайте семиугольник со стороной 6.
Вычилите с помощью метода и выведите на экран радиус и модуль их суммы.
4. ru.wikipedia.org/wiki/Треугольник
Создайте класс прямоугольных треугольников, описав в нём все необходимые свойства,
подобрав им понятные имена и правильные типы данных.
Опишите в классе конструктор, позволяющий при создании нового объекта явно задать
все его свойства. Если это необходимо, то проверьте допустимость их значений в
конструкторе (например, в классе обыкновенных дробей нельзя создавать дробь с
нулевым знаменателем).
Создайте в классе метод, вычисляющий длину высоты, опущенной на гепотенузу.
С использованием построенного класса создайте треугольник с катетами 3 и 4.
Вычилите с помощью метода и выведите на экран длину высоты опущенной на гепотенузу.
*/