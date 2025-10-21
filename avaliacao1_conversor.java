package avaliacaoTrimestral;

import java.util.Scanner;

public class avaliacao1_conversor {
    static void main() {
        Scanner input = new Scanner(System.in);

        /*Conversão de temperatura
        Fahrenheit -> (ºC * 9/5) + 32
        Kelvin -> ºC + 273,15
         */

        System.out.print("Digite a temperatura: ");
        float temp = input.nextFloat();

        float tempF = (temp * 9/5) + 32;
        double tempK = (temp + 273.15);

        System.out.printf("\nA temperatura em Celsius é: %.1f ºC", temp);
        System.out.printf("\nA temperatura em Fahrenheit é: %.1f ºF", tempF);
        System.out.printf("\nA temperatura em Kelvin é: %.2f ºK\n", tempK);
    }
}
