public class NFiction extends Book{
    NFiction()
    {
        super();
        setPrice();
    }
    NFiction(String str)
    {
        super(str);
        setPrice();
    }
    @Override
    public void setPrice()
    {
        super.price = 37.99;
    }
}
