package jmda.pocketfitness;

public class Exercise
{
    private String activity;
    private float time_spent;
    private String date;

    public Exercise(String activity, float time_spent, String date)
    {
        setActivity(activity);
        setTime(time_spent);
        setDate(date);
    }

    public void setActivity(String activity)
    {
        this.activity = activity;
    }

    public void setTime(float time_spent)
    {
        this.time_spent = time_spent;
    }

    public void setDate(String date)
    {
        this.date = date;
    }

    public String getActivity()
    {
        return activity;
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