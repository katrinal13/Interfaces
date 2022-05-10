public class Birthday implements Comparable
{
    private int month;
    private int day;
    private int year;

    public Birthday(int month, int day, int year)
    {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public int compareTo(Object other)
    {
        Birthday safeCast = (Birthday) other;
        if (this.year > safeCast.year)
        {
            if (this.month > safeCast.month)
            {
                if (this.day > safeCast.month)
                {
                    return -1;
                }
                else
                {
                    return 1;
                }
            }
            else
            {
                return 1;
            }
        }
    }
}
