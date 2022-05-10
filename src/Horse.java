public class Horse implements Fed
{
    private int pounds;

    public Horse(int pounds)
    {
        this.pounds = pounds;
    }

    public void feed()
    {
        System.out.println("The horse has been fed " + pounds + " pounds of grass");
    }
}
