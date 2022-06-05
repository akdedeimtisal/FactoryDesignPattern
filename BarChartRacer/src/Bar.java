
public class Bar implements Comparable<Bar> {

    private final String na;
    private final String co;
    private final int val;
    private final String cat;

    //BarChartAbstractFactory abstractFactory = new NormalBarChartFactory(); // It creates the normal chart (Nonvisible country name and SansSerif Font)
    BarChartAbstractFactory abstractFactory = new ImprovedBarChartFactory(); // It creates the improved chart (Visible country name and Arial font) 

    // private static BarChartAbstractFactory abstractFactory;
    Font font;
    CountryName countryNameVisibility;

    // Creates a new bar.
    public Bar(String name, String country, int value, String category) {
        if (name == null || value < 0 || category == null) {
            throw new IllegalArgumentException("Wrong data");
        }
        na = name;
        co = country;
        val = value;
        cat = category;

    }

    public void setAbstractFactory(BarChartAbstractFactory abstractFactory) {
        this.abstractFactory = abstractFactory;
    }

    public String getFont() {
        font = abstractFactory.fontType();
        return font.changedFont();
    }

    public boolean getCountryNameVisibility() {
        countryNameVisibility = abstractFactory.visibleCountryName();
        return countryNameVisibility.isVisible();
    }

    // Returns the name of this bar.
    public String getName() {
        return na;
    }

    // Returns the country of this bar
    public String getCountry() {
        return co;
    }

    // Returns the value of this bar.
    public int getValue() {
        return val;
    }

    // Returns the category of this bar.
    public String getCategory() {
        return cat;
    }

    // Compare two bars by value.
    public int compareTo(Bar that) {
        if (that == null) {
            throw new NullPointerException();
        }
        return Integer.compare(this.val, that.val);
    }

    public static void main(String[] args) {

    }
}
