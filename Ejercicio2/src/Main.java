import java.util.Scanner;

public class Main {

    /*
     Crea una aplicación que simule el funcionamiento del wordle. Para ello realiza
las siguientes acciones:
a. Crea una palabra de 5 letras. (funcionará como la palabra a adivinar)
b. El programa debe seleccionar aleatoriamente una palabra del array y
almacenarla como la palabra secreta.
c. El usuario tiene 5 intentos como máximo para adivinar la palabra secreta.
d. En cada intento, el usuario introduce una palabra por teclado.
e. Tras cada intento, el programa debe indicar al usuario:
i. Aciertos: cuántas letras tiene en la misma posición que la palabra
secreta.
ii. Aproximaciones: cuántas letras están en la palabra secreta, pero en una
posición diferente.
iii. Fallos: cuántas letras no están presentes en la palabra secreta.
El juego termina cuando el usuario adivina la palabra o se acaban los 5 intentos

     */

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        String palabrasistema="ruedo";

        int intentos=5;


        int acierto=0;
        int aproximacion=0;
        int fallos=0;


        do{

            intentos--;

            System.out.println(" ESCRIBA UNA PALABRA");
            String palabrausuario=scanner.next();


            for (int i = 0; i < 5; i++) {


            if (palabrasistema.equals(palabrausuario))
            {
                System.out.printf(" MUY BIEN HAS ACERTADO  %n");
                intentos=-1;
                break;
            }

            else if (palabrasistema.charAt(i) == palabrausuario.charAt(i)){
                acierto++;
            }
            else if (palabrasistema.contains(String.valueOf(palabrausuario.charAt(i)))) {
                aproximacion ++;
            }
            else {
                fallos ++;
            }
            }
            System.out.println("Los aciertos son "+acierto);
            System.out.println("Los aprox son "+aproximacion);
            System.out.println("Los fallos son "+fallos);
            acierto=0;
            aproximacion=0;
            fallos=0;

        }while (intentos > 0 );


    }

}

