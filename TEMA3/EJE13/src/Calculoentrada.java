import java.util.Scanner;
public class Calculoentrada {
    /*
    Escribe un programa para calcular el precio de entrada a un museo.
    Pide la edad del usuario y el día de la semana (1=Lunes, 2=Martes... 7=Domingo).
    Las reglas son: Menores de 12 años: entrada gratis.
    Entre 12 y 17 años: 5€ (pero gratis los martes).
    Entre 18 y 64 años: 10€ (pero 7€ los jueves).
    65 años o más: 6€.
    Usa operadores lógicos para determinar el precio correcto y muestra el cálculo
     */
    public void calculoentrada() {

        Scanner scanner = new Scanner(System.in);
        System.out.print(" Indique edad ");
        int edad = scanner.nextInt();
        System.out.print(" Indique dia semana ");
        int dia = scanner.nextInt();

        boolean gratis = edad < 12;
        boolean cincoeuros = edad >= 12 && edad <= 17;
        boolean diezeuros = edad >= 18 && edad <= 64;
        boolean seiseuros = edad >= 65;

        if (gratis || (cincoeuros && (dia==2))){
            System.out.println("LA ENTRADA ES GRATIS");
        }
        else if (cincoeuros) {
            System.out.println("LA ENTRADA ES 5 €");
        }
        else if(diezeuros){
            if (dia==4){
                System.out.println("LA ENTRADA ES 7€");
            }
            else{
                System.out.println("LA ENTRADA ES 10 €");
            }
        }
        else if (seiseuros) {
            System.out.println("LA ENTRADA ES 6 € ");
        }

    }
}