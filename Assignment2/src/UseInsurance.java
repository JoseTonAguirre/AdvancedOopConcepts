import java.util.Scanner;

public class UseInsurance
{
    public static void main (String args[])
    {
        Scanner input = new Scanner(System.in);
        int Insurance;
        System.out.println("Type '1' for Life Insurance or '2' for Health Insurance");
        String userInput = input.next();
        Insurance = Integer.parseInt(userInput);

        if(Insurance==1)
            insuranceLife();
        else
            insuranceHealth();
    }
    public static void insuranceLife()
    {
        Life L = new Life();
        L.display();
    }
    public static void insuranceHealth()
    {
        Health H = new Health();
        H.display();
    }
}
