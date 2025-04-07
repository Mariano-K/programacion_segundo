# 📚 Ejercicios de Programación Java

> Colección de ejemplos básicos de programación en Java

## 🔢 Ejercicio 1: Suma de dos números
```java
Scanner sc = new Scanner(System.in);
System.out.print("Ingresa el primer número: ");
int numero1 = sc.nextInt();
System.out.print("Ingresa el segundo número: ");
int numero2 = sc.nextInt();
int suma = numero1 + numero2;
System.out.println("La suma es: " + suma);
sc.close();
```

## 🌡️ Ejercicio 2: Conversión de Celsius a Fahrenheit
```java
Scanner sc = new Scanner(System.in);
System.out.print("Ingresa la temperatura en Celsius: ");
double celsius = sc.nextDouble();
double fahrenheit = (celsius * 9.0 / 5.0) + 32;
System.out.println(celsius + "°C son " + fahrenheit + "°F");
sc.close();
```

## ⭕ Ejercicio 3: Cálculo del área de un círculo
```java
Scanner sc = new Scanner(System.in);
System.out.print("Ingresa el radio del círculo: ");
double radio = sc.nextDouble();
double area = Math.PI * radio * radio;
System.out.println("El área del círculo es: " + area);
sc.close();
```

## 🔄 Ejercicio 4: Conversión de String a Integer y suma
```java
String sNumero1 = "25";
String sNumero2 = "35";
// Convertir los Strings a Integer usando Integer.parseInt
Integer numero1 = Integer.parseInt(sNumero1);
Integer numero2 = Integer.parseInt(sNumero2);
Integer suma = numero1 + numero2;
System.out.println("La suma de " + numero1 + " y " + numero2 + " es: " + suma);
```

## 🧮 Ejercicio 5: Operaciones con Double
```java
Double valor1 = 12.5;
Double valor2 = 3.4;
Double resultado = valor1 * valor2;
System.out.println("El resultado de multiplicar " + valor1 + " por " + valor2 + " es: " + resultado);
```

## ✅ Ejercicio 6: Uso de Boolean Wrapper
```java
Boolean valor = Boolean.parseBoolean("true");
System.out.println("Valor original: " + valor);
System.out.println("Valor negado: " + !valor);
```

## 🔢 Ejercicio 7: Positivo, negativo o cero
```java
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
```

## 👶 Ejercicio 8: Mayor de edad
```java
Scanner sc = new Scanner(System.in);
System.out.print("Ingrese su edad: ");
int edad = sc.nextInt();
if (edad >= 18) {
    System.out.println("Es mayor de edad");
} else {
    System.out.println("Es menor de edad");
}
sc.close();
```

## 📝 Ejercicio 9: Clasificación de nota
```java
Scanner sc = new Scanner(System.in);
System.out.print("Ingrese una nota (1-10): ");
int nota = sc.nextInt();
if (nota < 4) {
    System.out.println("Insuficiente");
} else if (nota <= 6) {
    System.out.println("Regular");
} else if (nota <= 8) {
    System.out.println("Bueno");
} else if (nota <= 10) {
    System.out.println("Excelente");
} else {
    System.out.println("Nota inválida");
}
sc.close();
```

## 🔄 Ejercicio 10: Número par o impar
```java
Scanner sc = new Scanner(System.in);
System.out.print("Ingrese un número: ");
int numero = sc.nextInt();
if (numero % 2 == 0) {
    System.out.println("Es par");
} else {
    System.out.println("Es impar");
}
sc.close();
```

## 📅 Ejercicio 11: Año bisiesto
```java
Scanner sc = new Scanner(System.in);
System.out.print("Ingrese un año: ");
int año = sc.nextInt();
if ((año % 4 == 0 && año % 100 != 0) || (año % 400 == 0)) {
    System.out.println("Es bisiesto");
} else {
    System.out.println("No es bisiesto");
}
sc.close();
```

## ❓ Ejercicio 12: Ternario simple
```java
int edad = 16;
String resultado = (edad >= 18) ? "Mayor de edad" : "Menor de edad";
System.out.println(resultado);
// Imprime: "Menor de edad"
```

## ❔ Ejercicio 13: Ternario anidado
```java
int nota = 8;
String mensaje = (nota < 4) ? "Insuficiente"
               : (nota <= 6) ? "Regular"
               : (nota <= 8) ? "Bueno"
               : "Excelente";
System.out.println(mensaje);
// Imprime: "Bueno"
```


# 🔄 Bucles en Java: Explicaciones y Ejercicios

## Introducción
En Java, los bucles nos permiten ejecutar un bloque de código varias veces. Son fundamentales para automatizar tareas repetitivas, recorrer listas, controlar flujos y mucho más. A continuación, vamos a ver los principales tipos de bucles en Java, con ejemplos claros y ejercicios prácticos.

---

## □ Bucle `for`

### ᴿ Qué es
El bucle `for` se utiliza cuando sabemos cuántas veces queremos repetir un bloque de código. Es ideal para iteraciones controladas con un contador.

### ᵀ Sintaxis
```java
for (inicialización; condición; actualización) {
    // código a repetir
}
```

### 🔹 Ejemplo
```java
for (int i = 0; i < 5; i++) {
    System.out.println("Valor de i: " + i);
}
```

---

## □ Bucle `while`

### ᴿ Qué es
El bucle `while` repite un bloque de código mientras la condición especificada sea verdadera. Es mejor usarlo cuando no sabemos cuántas veces se debe repetir.

### ᵀ Sintaxis
```java
while (condición) {
    // código a repetir
}
```

### 🔹 Ejemplo
```java
int i = 0;
while (i < 5) {
    System.out.println(i);
    i++;
}
```

---

## □ Bucle `do-while`

### ᴿ Qué es
El bucle `do-while` ejecuta el bloque de código al menos una vez antes de evaluar la condición. Es ideal cuando necesitamos ejecutar primero y validar después.

### ᵀ Sintaxis
```java
do {
    // código a repetir
} while (condición);
```

### 🔹 Ejemplo
```java
int i = 0;
do {
    System.out.println(i);
    i++;
} while (i < 5);
```

---

## □ Bucle `foreach`

### ᴿ Qué es
`foreach` es una forma abreviada y más legible de recorrer arrays o colecciones. No se puede modificar el índice ni acceder al elemento anterior/siguiente directamente.

### ᵀ Sintaxis
```java
for (Tipo elemento : coleccion) {
    // usar elemento
}
```

### 🔹 Ejemplo
```java
String[] nombres = {"Ana", "Luis", "Pedro"};
for (String nombre : nombres) {
    System.out.println("Hola " + nombre);
}
```

---

## □ Uso de `Scanner` con bucles

### ᴿ Qué es
La clase `Scanner` permite leer datos del usuario por consola. Combinada con bucles, permite crear programas interactivos y dinámicos.

### 🔹 Ejemplo
```java
Scanner sc = new Scanner(System.in);
int suma = 0;
int numero;
do {
    System.out.print("Ingrese un número (0 para salir): ");
    numero = sc.nextInt();
    suma += numero;
} while (numero != 0);
System.out.println("La suma es: " + suma);
```

---

## 🔄 Ejercicios Prácticos de Bucles

## 🔢 Ejercicio 14: Números del 1 al 10
```java
// Imprimir los números del 1 al 10
for (int i = 1; i <= 10; i++) {
    System.out.println(i);
}
```

## 🔢 Ejercicio 15: Números pares
```java
// Mostrar los números pares entre 2 y 20
for (int i = 2; i <= 20; i += 2) {
    System.out.println(i);
}
```

## ⏱️ Ejercicio 16: Cuenta regresiva
```java
// Cuenta regresiva desde 5
int contador = 5;
while (contador >= 1) {
    System.out.println(contador);
    contador--;
}
System.out.println("¡Despegue!");
```

## ➕ Ejercicio 17: Suma con while
```java
// Sumar números hasta que el usuario ingrese 0
Scanner sc = new Scanner(System.in);
int suma = 0;
int numero;

System.out.print("Ingrese un número (0 para terminar): ");
numero = sc.nextInt();

while (numero != 0) {
    suma += numero;
    System.out.print("Ingrese otro número (0 para terminar): ");
    numero = sc.nextInt();
}

System.out.println("La suma total es: " + suma);
sc.close();
```

## 📝 Ejercicio 18: Palabra clave
```java
// Pedir al usuario que escriba "java" hasta que lo haga
Scanner sc = new Scanner(System.in);
String palabra;

do {
    System.out.print("Escriba 'java' para continuar: ");
    palabra = sc.nextLine();
} while (!palabra.equalsIgnoreCase("java"));

System.out.println("¡Correcto!");
sc.close();
```

## 📋 Ejercicio 19: Menú interactivo
```java
// Mostrar un menú de opciones hasta que el usuario elija salir
Scanner sc = new Scanner(System.in);
int opcion;

do {
    System.out.println("\n--- MENÚ PRINCIPAL ---");
    System.out.println("1. Ver datos");
    System.out.println("2. Insertar nuevo registro");
    System.out.println("3. Modificar registro");
    System.out.println("4. Eliminar registro");
    System.out.println("0. Salir");
    System.out.print("Seleccione una opción: ");
    
    opcion = sc.nextInt();
    
    switch (opcion) {
        case 1:
            System.out.println("Mostrando datos...");
            break;
        case 2:
            System.out.println("Insertando nuevo registro...");
            break;
        case 3:
            System.out.println("Modificando registro...");
            break;
        case 4:
            System.out.println("Eliminando registro...");
            break;
        case 0:
            System.out.println("Saliendo del programa...");
            break;
        default:
            System.out.println("Opción no válida");
    }
    
} while (opcion != 0);

System.out.println("Programa finalizado");
sc.close();
```

