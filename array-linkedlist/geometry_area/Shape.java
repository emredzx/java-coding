package geometry_area;

public abstract class Shape {
    private String shapename;

    public Shape(String shapename) {
        this.shapename = shapename;
    }

    abstract void areaCalculate();

    public String getShapename() {
        return shapename;
    }

    public void setShapename(String shapename) {
        this.shapename = shapename;
    }
}
