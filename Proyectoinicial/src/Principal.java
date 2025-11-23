import java.util.Scanner;

public class Principal {
/*
 Crea un programa de adivinación de números El programa genera de manera
aleatoria un número entre 1 y 50. El usuario debe adivinar el número en un
máximo de 7 intentos. Después de cada intento, indica si el número es mayor
o menor que el elegido. Si el usuario acierta, mostrar un aviso con el número
de intentos utilizado; si no, mostrar un aviso de que debe introducir
nuevamente un número.

 */
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int numeroSistema = ( int ) (Math.random()*50)+1;
        int intentosres =7;
        int nintentos=0;

        System.out.println("***** JUEGOS DE ADIVINACION DE NUMEROS ****** ");
        System.out.println("*****      DIGA UN NUMERO DEL 1 AL 50  ****** ");
        System.out.printf("*****      AYUDA : EL Nº ES %d%n  ",numeroSistema);



        do {

            System.out.println(" ¿ DIGA UN NUMERO ? ");
            int numeroUsuario = scanner.nextInt();
            nintentos ++;

            if (numeroUsuario == numeroSistema) {
                System.out.printf(" ¡¡¡ HAS ACERTADO !! SOLO HAS NECESITADO %d NTENTOS", nintentos);
                intentosres =8;

            } else if (numeroUsuario > numeroSistema) {
                System.out.printf(" TE HAS PASADO , EL NUMERO ES MENOR , TE QUEDAN %d INTENTOS %n",intentosres-1);
                intentosres--;

            } else {
                System.out.printf(" NO HAS LLEGADO , EL NUMERO ES MAYOR, TE QUEDAN %d INTENTOS %n",intentosres-1);
                intentosres--;

            }
        }while (intentosres <8);



   }
}