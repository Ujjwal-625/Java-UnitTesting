public class TempreatureConverter {
    public static double celciusToFahrenheit(double celcius){
        return celcius*9.0/5+32;
    }

    public static double fahrenheitToCelcius(double fahrenheit){
        return (fahrenheit-32)*5.0/9;
    }
}
