public class Weather {
    private double temperature;
    private String forecast;
    private double pressure;


    public Weather(double temperature, String forecast, double pressure)
    {
        this.temperature = temperature;
        this.forecast = forecast;
        this.pressure = pressure;

    }

    @Override
    public String toString()
    {

        String res="Temperature: " + this.temperature + " " + "Forecast: " + this.forecast + " " + "Pressure: " + this.pressure;
        return res;
    }
}
