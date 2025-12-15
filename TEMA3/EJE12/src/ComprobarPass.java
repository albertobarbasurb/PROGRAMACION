import java.util.Scanner;

public class ComprobarPass {

    /*
    Crea un programa que pida al usuario crear una contraseña.
       La contraseña debe cumplir estos requisitos: tener al menos 8 caracteres de longitud,
        contener al menos un número, y NO puede ser "12345678" o "password".
        El programa debe verificar cada condición por separado usando operadores lógicos y mostrar
        si la contraseña es válida o no, indicando qué requisitos no cumple.
            Nota: Para este ejercicio, asume que tienes funciones auxiliares
            como longitudCadena(texto), contienNumero(texto).
     */

    Scanner scanner= new Scanner(System.in);
    public void comprobar() {

        System.out.print(" Indique una contraseña :");
        String contrasena = scanner.next();

        boolean caracteres = contrasena.length() >= 8;

        System.out.println(" Longitud " + caracteres);

        boolean contienenumero = contrasena.contains("1") || contrasena.contains("2") || contrasena.contains("3") || contrasena.contains("4") || contrasena.contains("5") || contrasena.contains("6") || contrasena.contains("7") || contrasena.contains("8") || contrasena.contains("9") || contrasena.contains("0");

        System.out.println(" Contiene numeros " + contienenumero);

        boolean contienereser = contrasena.equals("password") || contrasena.equals("12345678");

        System.out.println(" Password prohibida " + contienereser);

        boolean valida = (caracteres && contienenumero && !contienereser);

        System.out.println(" Validad " + valida);


    }
}
