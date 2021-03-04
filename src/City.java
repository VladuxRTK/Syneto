public class City {
    private String name;
    private Weather weather;


    public City(String name,Weather weather)
    {
        this.name = name;
        this.weather = weather;

    }

    public void displayInfo()
    {
        System.out.println("The weather is: " +this.weather.toString());
    }

    public String getName()
    {
        return  this.name;
    }
}
