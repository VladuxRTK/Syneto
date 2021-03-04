import java.util.ArrayList;

public class WeatherApp {

    private ArrayList<City> preferedCities = new ArrayList<City>();

    public void seeWeather(String cityName)
    {
        for(City el : preferedCities)
        {
            if(el.getName().equals(cityName))
            {
                el.displayInfo();
                return;
            }
        }
    }

    public void displayAllCitiesInfo()
    {
        for(City el : preferedCities)
        {
            el.displayInfo();
        }
    }

    public void addCity(City c)
    {
        if(!preferedCities.contains(c))
        preferedCities.add(c);
        else{
            System.out.println("The city is already in the list");
            return;
        }
    }

    public static void main(String[] args)
    {
        Weather weather1 = new Weather(20,"Cloudy",10);
        Weather weather2 = new Weather(30,"Sunny",20);
        Weather weather3 = new Weather(10,"Rainy",80);
        City c1 = new City("Resita",weather1);
        City c2 = new City("Timisoara",weather2);
        City c3 = new City("Arad",weather3);
        WeatherApp weatherApp = new WeatherApp();
        weatherApp.addCity(c1);
        weatherApp.addCity(c2);
        weatherApp.addCity(c3);
        weatherApp.addCity(c1);
        weatherApp.seeWeather("Resita");
        weatherApp.displayAllCitiesInfo();
    }
}
