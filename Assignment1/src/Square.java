public class Square extends GeometricFigure{
    private double area;
    public Square(int w,int h, String f){

        super(h,w,f);
    }

    @Override
    public double figureArea(int h, int w) {
        return w*h;
    }
}