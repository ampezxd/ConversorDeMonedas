import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        ConsultaMoneda consulta = new ConsultaMoneda();
        System.out.println("Escriba el número de la moneda que quiere convertir: ");
        int numeroMoneda = lectura.nextInt();

        String monedaBase = "USD";
        String monedaDestino = "COP";

        switch (numeroMoneda){
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

    }
}
