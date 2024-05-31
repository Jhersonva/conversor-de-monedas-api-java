import java.io.IOException;
import java.util.Scanner;

// Clase principal del programa
public class Principal {
    public static void main(String[] args) throws IOException, InterruptedException {

        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner teclado = new Scanner(System.in);

        // Definir el menú que se presentará al usuario
        String menu = """
                **************************************
                Sea bienvenido/a al Conversor de monedas =)
                
                1 - Dólar => Peso Argentino.
                2 - Peso Argentino => Dólar.
                3 - Dólar => Real Brasileño.
                4 - Real Brasileño => Dólar.
                5 - Dólar => Peso Colombiano.
                6 - Peso Colombiano => Dólar.
                7 - Soles PEN => Dólar.
                8 - Dólar => Soles PEN.
                9 - Salir.
                **************************************
                """;

        // Inicializar la variable opción y crear un objeto ConvertirMoneda
        int opcion = 0;
        ConvertirMoneda convertidor = new ConvertirMoneda();
        double cantidadConvertida = 0.0;

        // Bucle principal que se ejecuta hasta que el usuario elija salir (opción 9)
        while (opcion != 9) {
            // Mostrar el menú al usuario
            System.out.println(menu);
            System.out.println("Elije una opción válida: ");
            // Leer la opción elegida por el usuario
            opcion = teclado.nextInt();

            // Evaluar la opción seleccionada por el usuario
            switch (opcion) {
                // Para las opciones de 1 a 8, solicitar la cantidad a convertir y realizar la conversión
                case 1, 2, 3, 4, 5, 6, 7, 8:
                    System.out.println("Ingrese la cantidad a convertir:");
                    double cantidad = teclado.nextDouble();
                    cantidadConvertida = convertidor.convertirMoneda(cantidad, String.valueOf(opcion));
                    System.out.println("El valor " + cantidad + " corresponde a la conversion final de: " + cantidadConvertida);
                    break;
                // Para la opción 9, salir del programa
                case 9:
                    System.out.println("Saliendo del programa...");
                    break;
                // Para cualquier otra opción, indicar que la opción es inválida
                default:
                    System.out.println("Opción inválida.");
                    break;
            }
        }

        // Mensaje final al terminar el programa
        System.out.println("Fin del Programa Conversión de Monedas");
    }
}
