class Circle 
{
    Double Radius;

    Circle(Double Radius)
    {
        this.Radius = Radius;
    }
    
    Double getArea()
    {
        return 3.14*Radius*Radius;
    }

    Double getPerimeter()
    {
        return 2*3.14*Radius;
    }
}
