package W6.Studi_Kasus3;

public class Salesperson implements Comparable
{
    private String firstName, lastName;
    private int totalSales;

    //-----------------------------------------------------------------
    //  Constructor: Sets up the sales person object with
    //  the given data.
    //-----------------------------------------------------------------
    public Salesperson (String first, String last, int sales)
    {
        firstName = first;
        lastName = last;
        totalSales = sales;
    }

    //-----------------------------------------------------------------
    //  Returns the sales person as a string.
    //-----------------------------------------------------------------
    public String toString()
    {
        return lastName + ", " + firstName + ": \t" + totalSales;
    }

    //-----------------------------------------------------------------
    //  Returns true if the sales people have
    //  the same name.
    //-----------------------------------------------------------------
    public boolean equals (Object other)
    {
        return (lastName.equals(((Salesperson)other).getLastName()) &&
                firstName.equals(((Salesperson)other).getFirstName()));
    }

    //-----------------------------------------------------------------
    //  Order is based on total sales with the name
    //  (last, then first) breaking a tie.
    //-----------------------------------------------------------------
    public int compareTo(Object other)
    {
        Salesperson s = (Salesperson) other;

        if (this.totalSales < s.totalSales) {
            return -1;
        } else if (this.totalSales > s.totalSales) {
            return 1;
        } else {
            int result = this.lastName.compareTo(s.lastName);
            if (result == 0) {
                result = this.firstName.compareTo(s.firstName);
            }
            return result;
        }
    }

    //-----------------------------------------------------------------
    //  First name accessor.
    //-----------------------------------------------------------------
    public String getFirstName()
    {
        return firstName;
    }

    //-----------------------------------------------------------------
    //  Last name accessor.
    //-----------------------------------------------------------------
    public String getLastName()
    {
        return lastName;
    }

    //-----------------------------------------------------------------
    //  Total sales accessor.
    //-----------------------------------------------------------------
    public int getSales()
    {
        return totalSales;
    }
}