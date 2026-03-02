public class TestCylinder {
    public static void main(String[] args) {

        Cylinder c1 = new Cylinder();
        System.out.println(c1);
        System.out.println("Surface Area = " + c1.getArea());
        System.out.println("Volume = " + c1.getVolume());

        System.out.println();

        Cylinder c2 = new Cylinder(2.0, 10.0, "blue");
        System.out.println(c2);
        System.out.println("Surface Area = " + c2.getArea());
        System.out.println("Volume = " + c2.getVolume());
    }
}