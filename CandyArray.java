/**
 * This class provides methods to manipulate arrays of Candy objects.
 */
public class CandyArray
{
    /**
     * This method sorts the Candy array by the Candy's names.
     * @param yummy the Candy array to be sorted
     * @param start the starting index of the array
     * @param end the ending index of the array
     * @return an array containing the same Candy objects as yummy, now sorted in alphabetical order by name
     */
    public static Candy[] sortByName(Candy[] yummy, int start, int end)
    {
        if (start < end)
        {
            int middle = (start + end) / 2;
            sortByName(yummy, start, middle);
            sortByName(yummy, middle + 1, end);
            mergeName(yummy, start, middle + 1, end);
        }
        return yummy;
    }

    /**
     * This method helps sortByName by actually putting the array elements in order.
     * @param delicious the Candy array to be sorted
     * @param startBegin the starting index of the first array being merged
     * @param endBegin the starting index of the second array being merged
     * @param finalEnd the ending index of the second array being merged
     * @return a sorted merged and sorted version of delicious
     */
    public static Candy[] mergeName(Candy[] delicious, int startBegin, int endBegin, int finalEnd)
    {
        int startEnd = endBegin - 1;
        int total = finalEnd - startBegin + 1;
        Candy[] bonapetit = new Candy[total];
        int numOfComparisons = 0;
        while (startBegin <= startEnd && endBegin <= finalEnd)
        {
            System.out.println("COMPARISON!");
            if (delicious[startBegin].getName().compareTo(delicious[endBegin].getName()) <= 0)
            {
                bonapetit[numOfComparisons++] = delicious[startBegin++];
            }
            else
            {
                bonapetit[numOfComparisons++] = delicious[endBegin++];
            }
        }
        while (startBegin <= startEnd)
        {
            bonapetit[numOfComparisons++] = delicious[startBegin++];
        }
        while (endBegin <= finalEnd)
        {
            bonapetit[numOfComparisons++] = delicious[endBegin++];
        }
        for (int i = total - 1; i >= 0; i--, finalEnd--)
        {
            delicious[finalEnd] = bonapetit[i];
        }
        return bonapetit;
    }

    /**
     * This method sorts the Candy array by the Candy's colors.
     * @param yummy the Candy array to be sorted
     * @param start the starting index of the array
     * @param end the ending index of the array
     * @return an array containing the same Candy objects as yummy, now sorted in alphabetical order by color
     */
    public static Candy[] sortByColor(Candy[] yummy, int start, int end)
    {
        if (start < end)
        {
            int middle = (start + end) / 2;
            sortByColor(yummy, start, middle);
            sortByColor(yummy, middle + 1, end);
            mergeColor(yummy, start, middle + 1, end);
        }
        return yummy;
    }

    /**
     * This method helps sortByColor by actually putting the array elements in order.
     * @param delicious the Candy array to be sorted
     * @param startBegin the starting index of the first array being merged
     * @param endBegin the starting index of the second array being merged
     * @param finalEnd the ending index of the second array being merged
     * @return a sorted merged and sorted version of delicious
     */
    public static Candy[] mergeColor(Candy[] delicious, int startBegin, int endBegin, int finalEnd)
    {
        int startEnd = endBegin - 1;
        int total = finalEnd - startBegin + 1;
        Candy[] bonapetit = new Candy[total];
        int numOfComparisons = 0;
        while (startBegin <= startEnd && endBegin <= finalEnd)
        {
            System.out.println("COMPARISON!");
            if (delicious[startBegin].getColor().compareTo(delicious[endBegin].getColor()) <= 0)
            {
                bonapetit[numOfComparisons++] = delicious[startBegin++];
            }
            else
            {
                bonapetit[numOfComparisons++] = delicious[endBegin++];
            }
        }
        while (startBegin <= startEnd)
        {
            bonapetit[numOfComparisons++] = delicious[startBegin++];
        }
        while (endBegin <= finalEnd)
        {
            bonapetit[numOfComparisons++] = delicious[endBegin++];
        }
        for (int i = total - 1; i >= 0; i--, finalEnd--)
        {
            delicious[finalEnd] = bonapetit[i];
        }
        return bonapetit;
    }

    /**
     * This method sorts the Candy array by the Candy's sizes.
     * @param yummy the Candy array to be sorted
     * @param start the starting index of the array
     * @param end the ending index of the array
     * @return an array containing the same Candy objects as yummy, now sorted in increasing number order by size
     */
    public static Candy[] sortBySize(Candy[] yummy, int start, int end)
    {
        if (start < end)
        {
            int middle = (start + end) / 2;
            sortBySize(yummy, start, middle);
            sortBySize(yummy, middle + 1, end);
            mergeSize(yummy, start, middle + 1, end);
        }
        return yummy;
    }

    /**
     * This method helps sortBySize by actually putting the array elements in order.
     * @param delicious the Candy array to be sorted
     * @param startBegin the starting index of the first array being merged
     * @param endBegin the starting index of the second array being merged
     * @param finalEnd the ending index of the second array being merged
     * @return a sorted merged and sorted version of delicious
     */
    public static Candy[] mergeSize(Candy[] delicious, int startBegin, int endBegin, int finalEnd)
    {
        int startEnd = endBegin - 1;
        int total = finalEnd - startBegin + 1;
        Candy[] bonapetit = new Candy[total];
        int numOfComparisons = 0;
        while (startBegin <= startEnd && endBegin <= finalEnd)
        {
            System.out.println("COMPARISON!");
            if (delicious[startBegin].getSize() <= (delicious[endBegin].getSize()))
            {
                bonapetit[numOfComparisons++] = delicious[startBegin++];
            }
            else
            {
                bonapetit[numOfComparisons++] = delicious[endBegin++];
            }
        }
        while (startBegin <= startEnd)
        {
            bonapetit[numOfComparisons++] = delicious[startBegin++];
        }
        while (endBegin <= finalEnd)
        {
            bonapetit[numOfComparisons++] = delicious[endBegin++];
        }
        for (int i = total - 1; i >= 0; i--, finalEnd--)
        {
            delicious[finalEnd] = bonapetit[i];
        }
        return bonapetit;
    }
}