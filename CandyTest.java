/**
 * This is a tester class for Candy and CandyArray.
 */
public class CandyTest
{
    public static void main(String[] args)
    {
       /* Making a new Candy array and some new Candies to put into it */
        Candy[] candies = new Candy[7];
        Candy candy1 = new Candy("M&M's", "red", 1);
        Candy candy2 = new Candy("Sour Patch Kids", "green", 2);
        Candy candy3 = new Candy("Skittles", "red", 1);
        Candy candy4 = new Candy("Snickers", "brown", 3);
        Candy candy5 = new Candy("M&M's", "blue", 2);
        Candy candy6 = new Candy("Skittles", "orange", 3);
        Candy candy7 = new Candy("Sour Patch Kids", "yellow", 1);
       /* Filling the Candy array */
        candies[0] = candy1;
        candies[1] = candy2;
        candies[2] = candy3;
        candies[3] = candy4;
        candies[4] = candy5;
        candies[5] = candy6;
        candies[6] = candy7;
       /* Printing out the original order of the array */
        System.out.println("Original sort:");
        for (int i = 0; i < candies.length; i++)
        {
            System.out.println(candies[i]);
        }
       /* Sorting the array by name and printing out the result */
        Candy[] nameSort = CandyArray.sortByName(candies, 0, 6);
        System.out.println("");
        System.out.println("Name sort:");
        for (int i = 0; i < nameSort.length; i++)
        {
            System.out.println(nameSort[i]);
        }
        System.out.println("");
       /* Sorting the array by color and printing out the result */
        Candy[] colorSort = CandyArray.sortByColor(candies, 0, 6);
        System.out.println("Color sort:");
        for (int i = 0; i < colorSort.length; i++)
        {
            System.out.println(colorSort[i]);
        }
        System.out.println("");
       /* Sorting the array by size and printing out the result */
        Candy[] sizeSort = CandyArray.sortBySize(candies, 0, 6);
        System.out.println("Size sort:");
        for (int i = 0; i < sizeSort.length; i++)
        {
            System.out.println(sizeSort[i]);
        }
    }
}