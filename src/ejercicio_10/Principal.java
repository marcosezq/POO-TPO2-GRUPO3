package ejercicio_10;

public class Principal {
    public static void main(String[] args) {


        //Conversion de celsius a fahrenheit
        double celsius = 25;
        System.out.println(celsius + "°C equivalen a " + Conversor.aFahrenheit(celsius) + "°F");


        //Conversion de fahrenheit a celsius
        double fahrenheit = 77;
        System.out.println(fahrenheit + "°F equivalen a " + Conversor.aCelsius(fahrenheit) + "°C");

    }
}
