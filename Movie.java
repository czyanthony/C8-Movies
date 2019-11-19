
/**
 * A Class to hold Movie Facts
 *
 * @author (Mr. Kim)
 * @version (2019-11-16)
 * 
 */
public class Movie
{
    // instance variables - replace the example below with your own
    private String name;
    private String studio;
    private double rating;
    private int    year;

    /**
     * Constructor for objects of class Movie
     */
    public Movie(String name, String studio, double rating, int year)
    {
        this.name     = name;
        this.studio   = studio;
        this.rating   = rating;
        this.year     = year;
    } // Movie
    
    public String getName()     { return this.name;};
    public String getStudio()   { return this.studio;};
    public double getRating()   { return this.rating;};
    public int    getYear()     { return this.year; };
    
    public String toString()
    {
        String s = " * Movie: "+this.name+"  Studio: :" +this.studio + " IMDB rating :"+this.rating;
        return s;
        
    } // end toString();


}
