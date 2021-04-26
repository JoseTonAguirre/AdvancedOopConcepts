public class Life extends Insurance
{
    public Life()
    {
        super("Life Insurance");
        setCost();
    }
    public void setCost()
    {
        this.cost = 36;
    }
    public void display()
    {
        System.out.println(type + "Cost per month: $" + String.format("%.2f",this.getCost()));
    }
}
