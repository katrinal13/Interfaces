public class Birthday implements Comparable
{
    private int month;
    private int day;
    private int year;
    private String name;

    public Birthday(String name, int month, int day, int year)
    {
        this.month = month;
        this.day = day;
        this.year = year;
        this.name = name;
    }

    public int compareTo(Object other)
    {
        Birthday safeCast = (Birthday) other;
        if (this.year > safeCast.year)
        {
            return -1;
        }
        else if (this.year < safeCast.year)
        {
            return 1;
        }
        else
        {
            if (this.month > safeCast.month)
            {
                return -1;
            }
            else if (this.month < safeCast.month)
            {
                return 1;
            }
            else
            {
                if (this.day > safeCast.day)
                {
                    return -1;
                }
                else if (this.day < safeCast.day)
                {
                    return 1;
                }
                else
                {
                    return this.name.compareTo(safeCast.name);
                }
            }
        }
    }

    public String toString()
    {
        return name + " born on " + month + "/" + day + "/" + year;
    }
}
