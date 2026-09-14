/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recursividad;

/**
 *
 * @author dulma
 */

public class Recursividades {

    // FACTORIAL
    public int calcularFactorial(int num) {
        // Caso base
        if (num == 1) {
            return 1;
        }

        // Caso general
        return num * calcularFactorial(num - 1);
    }

    // EJERCICIO 1
    public int contarVocales(String texto) {
        // Caso base
        if (texto.length() == 0) {
            return 0;
        }

        char letra = Character.toLowerCase(texto.charAt(0));

        int vocal = 0;

        if (letra == 'a' || letra == 'e' || letra == 'i'
                || letra == 'o' || letra == 'u') {
            vocal = 1;
        }

        // Llama nuevamente al método con el resto de la cadena
        return vocal + contarVocales(texto.substring(1));
    }

    // EJERCICIO 2
    public int sumarDigitos(int num) {
        // Caso base
        if (num < 10) {
            return num;
        }

        // Caso general
        return (num % 10) + sumarDigitos(num / 10);
    }

    // EJERCICIO 3
    public int sumarPrimerosNumeros(int n) {
        // Caso base
        if (n == 1) {
            return 1;
        }

        // Caso general
        return sumarPrimerosNumeros(n - 1) + n;
    }
}