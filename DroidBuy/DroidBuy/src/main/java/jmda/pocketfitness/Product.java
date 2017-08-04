package jmda.pocketfitness;

public class Product
{
    private String product;
    private float quantity;
    private String date;

    public Product(String product, float quantity, String date)
    {
        setFood(product);
        setCalories(quantity);
        setDate(date);
    }

    public void setFood(String product)
    {
        this.product = product;
    }

    public void setCalories(float quantity)
    {
        this.quantity = quantity;
    }

    public void setDate(String time)
    {
        this.date = time;
    }

    public String getFood()
    {
        return product;
    }

    public float getCalories()
    {
        return quantity;
    }

    public String getDate()
    {
        return date;
    }
}