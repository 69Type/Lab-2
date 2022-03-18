// Класс трёхмерной точки
public class Point3d {

    private double xCoord;

    private double yCoord;

    private double zCoord;

    public Point3d ( double x, double y, double z) {
        xCoord = x;
        yCoord = y;
        zCoord = z;
    }

    public Point3d () {
        this(0, 0, 0);
    }

    public double getX () {
        return xCoord;
    }

    public double getY () {
        return yCoord;
    }

    public double getZ () {
        return zCoord;
    }

    public void setX ( double val) { xCoord = val; }

    public void setY ( double val) {
        yCoord = val;
    }

    public void setZ ( double val) {
        zCoord = val;
    }

    public boolean pointCompare(Point3d a){
        return a.xCoord == this.xCoord && a.yCoord == this.yCoord && a.zCoord == this.zCoord;
    }

    public double distanceTo(Point3d a){
        return Math.round(Math.sqrt(Math.pow(this.xCoord - a.xCoord, 2) + Math.pow(this.yCoord - a.yCoord, 2) + Math.pow(this.zCoord - a.zCoord, 2)) * 100.0) / 100.0;
    }
}
