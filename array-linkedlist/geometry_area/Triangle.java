package geometry_area;

public class Triangle extends Shape{
    private int a;
    private int b;
    private int c;

    public Triangle(String shapename,int a, int b, int c) {
        super(shapename);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public void areaCalculate() {
        System.out.println("************************************");
        double x = (a + b + c) / 2.0;
        double area = Math.sqrt(x * (x - a) * (x - b) * (x - c));
        System.out.println(getShapename() + "'s area is : " + area);
        System.out.println("************************************");
    }
}
