public class UseGeometric {
    public static void main(String[] args) {
        double area;
        int width;
        int height;
        String FigureType;
        GeometricFigure[] figure = new GeometricFigure[4];
        Square figure0 = new Square(5,5, "Square");
        Triangle figure1 = new Triangle(5,5,"Triangle");
        Square figure2 = new Square(15, 15, "Square");
        Triangle figure3 = new Triangle(15,15,"Triangle");
        figure[0] = figure0;
        figure[1] = figure1;
        figure[2] = figure2;
        figure[3] = figure3;
        for (int i = 0; i<figure.length;i++) {
            FigureType = figure[i].getFigure();
            width = figure[i].getWidth();
            height = figure[i].getHeight();
            area = figure[i].figureArea(height, width);
            System.out.println("the " + FigureType + " with height = " + height + " and width = " + width
                    + " has an area of " + area);
        }
    }
}

