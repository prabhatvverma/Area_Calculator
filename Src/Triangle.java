class Triangle {
    Double Base_A;
    Double Hight;
    Double Base_B;
    Double Base_C;

    Triangle(Double Base_A, Double Base_B, Double Base_C, Double Hight)
    {
        this.Base_A = Base_A;
        this.Base_B = Base_B;
        this.Base_C = Base_C;
        this.Hight = Hight;
    }

    Double getArea()
    {
        return (Base_A * Hight) / 2;
    }
    Double getPerimeter()
    {
        return Base_A + Base_B + Base_C ;
    }
    
}
