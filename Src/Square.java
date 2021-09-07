class Square {

    Double Side;
    Square(Double Side)
    {
        this.Side = Side;
    }

    Double getArea()
    {
        return Side*Side;
    }
    
    Double getPerimeter()
    {
        return 4*Side;
    }
}
