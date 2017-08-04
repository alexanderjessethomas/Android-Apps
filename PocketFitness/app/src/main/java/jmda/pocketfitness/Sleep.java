package jmda.pocketfitness;

public class Sleep
{
    private float time_spent;
    private String date;

    public Sleep(float time_spent, String date)
    {
        setTime(time_spent);
        setDate(date);
    }

    public void setTime(float time_spent)
    {
        this.time_spent = time_spent;
    }

    public void setDate(String date)
    {
        this.date = date;
    }

    public float getTime()
    {
        return time_spent;
    }

    public String getDate()
    {
        return date;
    }
}