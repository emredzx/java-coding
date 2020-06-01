package geometry_area;

public class Circle extends Shape{
    private int radius;

    public Circle(String shapename, int radius) {
        super(shapename);
        this.radius = radius;
    }

    @Override
    public void areaCalculate() {
        System.out.println("************************************");
        System.out.println(getShapename() + "'s area is : " +(Math.PI*radius*radius));
        System.out.println("************************************");
    }
}
