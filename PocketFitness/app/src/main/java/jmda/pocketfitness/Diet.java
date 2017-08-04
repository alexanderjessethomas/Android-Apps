package jmda.pocketfitness;

public class Diet
{
    private String food;
    private float calories;
    private String date;

    public Diet(String food, float calories, String date)
    {
        setFood(food);
        setCalories(calories);
        setDate(date);
    }

    public void setFood(String food)
    {
        this.food = food;
    }

    public void setCalories(float calories)
    {
        this.calories = calories;
    }

    public void setDate(String time)
    {
        this.date = time;
    }

    public String getFood()
    {
        return food;
    }

    public float getCalories()
    {
        return calories;
    }

    public String getDate()
    {
        return date;
    }
}