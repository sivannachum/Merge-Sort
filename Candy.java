/**
 * The Candy class constructs candy objects that each have a name, color, and size.
 */
public class Candy
{
    private String name;
    private String color;
    private int size;

    /**
     *
     * @param theName the Name of the candy: "M&M's", "Sour Patch Kids", "Skittles", or "Snickers"
     * @param theColor any color
     * @param theSize 1 for small, 2 for Medium, 3 for BIG
     */
    public Candy(String theName, String theColor, int theSize)
    {
        name = theName;
        color = theColor;
        size = theSize;
    }

    /**
     * Returns the name of the candy.
     */
    public String getName()
    {
        return name;
    }

    /**
     * Returns the color of the candy.
     */
    public String getColor()
    {
        return color;
    }

    /**
     * Returns the size of the candy.
     */
    public int getSize()
    {
        return size;
    }

    /**
     * Returns a String representation of the Candy object including its name, color, and size.
     */
    @Override
    public String toString()
    {
        return "Candy[name=" + name + ", color=" + color + ", size=" + size +"]";
    }
}