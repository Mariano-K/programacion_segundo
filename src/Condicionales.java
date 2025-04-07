import java.util.Scanner;

public class Condicionales {
    public static void main(String[] args) throws Exception {

        // Ejercicio 7: Positivo, negativo o cero
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int numero = sc.nextInt();
        if (numero > 0) {
            System.out.println("El número es positivo");
        } else if (numero < 0) {
            System.out.println("El número es negativo");
        } else {
            System.out.println("El número es cero");
        }
        sc.close();

        // Ejercicio 8: Mayor de edad
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Ingrese su edad: ");
        // int edad = sc.nextInt();
        // if (edad >= 18) {
        //     System.out.println("Es mayor de edad");
        // } else {
        //     System.out.println("Es menor de edad");
        // }
        // sc.close();

        // Ejercicio 9: Clasificación de nota
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Ingrese una nota (1-10): ");
        // int nota = sc.nextInt();
        // if (nota < 4) {
        //     System.out.println("Insuficiente");
        // } else if (nota <= 6) {
        //     System.out.println("Regular");
        // } else if (nota <= 8) {
        //     System.out.println("Bueno");
        // } else if (nota <= 10) {
        //     System.out.println("Excelente");
        // } else {
        //     System.out.println("Nota inválida");
        // }
        // sc.close();

        // Ejercicio 10: Par o impar
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Ingrese un número: ");
        // int numero = sc.nextInt();
        // if (numero % 2 == 0) {
        //     System.out.println("Es par");
        // } else {
        //     System.out.println("Es impar");
        // }
        // sc.close();

        // Ejercicio 11: Año bisiesto
        // La formula para determinar si un año es bisiesto es:
        // Un año es bisiesto si es divisible por 4, pero no por 100, a menos que
        // también sea divisible por 400.
        // Por ejemplo, 2000 y 2400 son bisiestos, pero 1900 y 2100 no lo son.
        // Ejemplo: 2000 es bisiesto porque es divisible por 4 y 400, pero no por 100.
        // Ejemplo: 1900 no es bisiesto porque es divisible por 4 y 100, pero no por
        // 400.
        // Ejemplo: 2004 es bisiesto porque es divisible por 4, pero no por 100.
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Ingrese un año: ");
        // int año = sc.nextInt();
        // if ((año % 4 == 0 && año % 100 != 0) || (año % 400 == 0)) {
        //     System.out.println("Es bisiesto");
        // } else {
        //     System.out.println("No es bisiesto");
        // }
        // sc.close();


        // Ejercicio 12: Operador ternario simple
        // int edad = 16;
        // String resultado = (edad >= 18) ? "Mayor de edad" : "Menor de edad";
        // System.out.println(resultado);
        

        // Ejercicio 13: Ternario anidado
        // int nota = 8;
        // String mensaje = (nota < 4) ? "Insuficiente"
        //             : (nota <= 6) ? "Regular"
        //             : (nota <= 8) ? "Bueno"
        //             : "Excelente";
        // System.out.println(mensaje);
    }
}
