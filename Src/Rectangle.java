class Rectangle {
    Double Length,Breadth;
    Rectangle(Double Length, Double Breadth)
    {
        this.Length = Length;
        this.Breadth = Breadth;
    }
    Double getArea()
    {
        return Length * Breadth;
    }

    Double getPerimeter()
    {
        return 2 * (Length + Breadth);
    }

    
}
