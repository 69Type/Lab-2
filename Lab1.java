public class Lab1 {
    // основной класс
    public static void main(String[] args){
        // Ввод координат трёх точек.
        Point3d a = new Point3d(7, 9 ,2);
        Point3d b = new Point3d(1, 5 ,3);
        Point3d c = new Point3d(1, 5 ,3);
        if (!a.pointCompare(b) && !a.pointCompare(c) && !c.pointCompare(b)){
            System.out.println(Lab1.computeArea(a, b, c));
        } else {
            System.out.println("Не удаётся вычислить площадь т.к. некоторые точки совпадают.");
        }
    }

    // вычисление площади треугольника
    static public double computeArea(Point3d a, Point3d b, Point3d c){
        double A = a.distanceTo(b),
                B = b.distanceTo(c),
                C = c.distanceTo(a),
                p = (A + B + C) / 2;
        return Math.sqrt(p * (p - A) * (p - B) * (p - C));
    }
}
