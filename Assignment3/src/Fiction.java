public class Fiction extends Book{
    Fiction()
    {
        super();
        setPrice();
    }
    Fiction(String str)
    {
        super(str);
        setPrice();
    }
    @Override
    public void setPrice()
    {
        super.price = 24.99;
    }
}
