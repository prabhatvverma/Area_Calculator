class ShapeMeasurementCalculator {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(10.00, 5.00);
        Triangle tri = new Triangle(10.00, 5.00, 5.00, 2.00);
        Circle cir = new Circle(5.00);
        Square squ = new Square(10.00);

        System.out.println("Area of Rectangle = " + rect.getArea());
        System.out.println("Area of Triangle = " + tri.getArea());
        System.out.println("Area of Circle = " + cir.getArea());
        System.out.println("Area of Square = " + squ.getArea());

        System.out.println("Perimeter of Rectangle = " + rect.getPerimeter());
        System.out.println("Perimeter of Triangle = " + tri.getPerimeter());
        System.out.println("Perimeter of Circle = " + cir.getPerimeter());
        System.out.println("Perimeter of Square = " + squ.getPerimeter());

    }

}
