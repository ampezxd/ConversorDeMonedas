import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        ConsultaMoneda consulta = new ConsultaMoneda();
        boolean stop = false;
        while (!stop) {
            System.out.println("****************************");
            System.out.println("1) Dolar =>> Peso colombiano");
            System.out.println("2) Peso colombiano =>> Dolar");
            System.out.println("3) Euro =>> Peso colombiano");
            System.out.println("4) Peso colombiano =>> Euro");
            System.out.println("5) Peso colombiano =>> Dolar australiano");
            System.out.println("6) Dolar Australiano =>> Peso colombiano");
            System.out.println("7) Salir");
            System.out.println("Escriba el número de la moneda que quiere convertir: \n");
            int numeroMoneda = lectura.nextInt();
            System.out.println("Escriba el valo a convertir: ");
            double valorAConvertir = lectura.nextDouble();

            if (numeroMoneda == 7) {
                System.out.println("Gracias por usar el conversor.");
                stop = true;
                continue; //Continua con el resto de la iteración.
            }

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
                case 5:
                    monedaBase = "COP";
                    monedaDestino = "AUD";
                    break;

                case 6:
                    monedaBase = "AUD";
                    monedaDestino = "COP";
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
}