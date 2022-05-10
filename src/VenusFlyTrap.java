public class VenusFlyTrap implements Fed
{
    private int num;

    public VenusFlyTrap(int num)
    {
        this.num = num;
    }

    public void feed()
    {
        System.out.println("The venus fly trap has been fed " + num + " flies");
    }
}
