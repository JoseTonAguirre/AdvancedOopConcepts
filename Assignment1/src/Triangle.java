public class Triangle extends GeometricFigure{
    private double area;
    public Triangle(int w, int h, String f){
        super (w,h,f);
    }

    @Override
    public double figureArea(int h, int w) {
        area = (double) (w*h*0.5);
        return area;
    }
}