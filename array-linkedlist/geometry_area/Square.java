package geometry_area;

public class Square extends Shape{
    private int side;
    public Square(String shapename, int side) {
        super(shapename);
        this.side = side;
    }
    @Override
     public void areaCalculate() {
        System.out.println("************************************");
        System.out.println(getShapename() + "'s area is : " + (side*side));
        System.out.println("************************************");
    }
}
