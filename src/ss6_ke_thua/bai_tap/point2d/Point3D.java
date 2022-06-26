package ss6_ke_thua.bai_tap.point2d;

public class Point3D extends Point2D {
    private float z;
    public Point3D() {

    }
    public Point3D(float z, float x, float y) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float x, float y, float z) {
        setXY(x,y);
        setZ(z);
    }
    public float [] getXYZ() {
        float [] arr = {getX(),getY(),getZ()};
        return arr;
    }

    @Override
    public String toString() {
        return "Point3D{" +
                "x= " + getX() +
                ", y= "+getY() +
                ", z= " +z+'}';
    }
}
