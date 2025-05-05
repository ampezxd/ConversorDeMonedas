import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        ConsultaMoneda consulta = new ConsultaMoneda();
        System.out.println("****************************");
        System.out.println("1) Dolar =>> Peso colombiano");
        System.out.println("2) Peso colombiano =>> Dolar");
        System.out.println("3) Euro =>> Peso colombiano");
        System.out.println("4) Peso colombiano =>> Euro");
        System.out.println("Escriba el número de la moneda que quiere convertir: \n");
        int numeroMoneda = lectura.nextInt();
        System.out.println("Escriba el valo a convertir: ");
        double valorAConvertir = lectura.nextDouble();

        String monedaBase = "";
        String monedaDestino = "";


        switch (numeroMoneda) {
            case 1:
                monedaBase = "USD";
                monedaDestino = "COP";
                break;
            case 2:
                monedaBase = "COP";
                monedaDestino = "USD";
                break;
            case 3:
                monedaBase = "EUR";
                monedaDestino = "COP";
                break;
            case 4:
                monedaBase = "COP";
                monedaDestino = "EUR";
                break;


        }
        try {
            Monedas resultado = consulta.buscaMoneda(monedaBase, monedaDestino,(valorAConvertir));
            System.out.println("Tasa de cambio de " + monedaBase + " a " + monedaDestino + ": " + resultado.conversion_rate());
            System.out.println("El valor de " + valorAConvertir + " [" + monedaBase + "] " + "corresponde al valor final de: =>> " + resultado.conversion_result() );
        } catch (Exception e) {
            System.out.println("No se pudo obtener la tasa de cambio.");
        }

    }
}