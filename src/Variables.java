import java.util.Scanner;

public class Variables {
    public static void main(String[] args) {

        // Paso 1: Crear un objeto Scanner para leer la entrada del usuario
        Scanner sc = new Scanner(System.in);
        // Paso 2: Solicitar al usuario que ingrese el radio del círculo
        System.out.print("Ingresa el radio del círculo: ");
        // Paso 3: Leer el radio ingresado por el usuario
        double radio = sc.nextDouble();
        // Paso 4: Calcular el área del círculo utilizando la fórmula A = π * r^2
        double area = 3.1416 * (radio * radio);
        // Paso 5: Mostrar el resultado al usuario
        System.out.println("El área del círculo es: " + area);
    }
}
