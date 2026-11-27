import java.util;
/**
 * Write a description of class RecipeBook here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RecipeBook


{
    // instance variables - replace the example below with your own
   
    private Recipe r;
    private String authors;
    private int pages;
    private String year;
    private String recipe;
    /**
     * Constructor for objects of class RecipeBook
     */
    public RecipeBook()
    {
        Recipe r = new Recipe();
        authors = "Denelds and David";
        year = "2026";
        pages = 30;
        
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public String getBookAuthors()
    {
        return authors;
    }
    public String getBookPages()
    {
        return pages;
    }
    public String getYearPublished()
    {
        return year;
    }
    public String getAllRecipes()
    {
        return recipes;
    }
    
    
}