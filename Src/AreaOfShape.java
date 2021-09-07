class Calculator
{
    public static void main(String[] args) 
    {
        Calculator calsi = new Calculator(Rectangle,Area);
        Rectangle rect = new Rectangle(10.00, 5.00);
        Triangle tri = new Triangle(10.00, 5.00, 5.00, 2.00);
        Circle cir = new Circle(5.00);
        Square squ = new Square(10.00);

        System.out.println("Area of Rectangle = " + rect.getArea());
        System.out.println("Area of Triangle = " + tri.getArea());
        System.out.println("Area of Circle = " + cir.getArea());
        System.out.println("Area of Square = " + squ.getArea());

    }
    
}
