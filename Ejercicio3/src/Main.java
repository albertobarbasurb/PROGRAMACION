import java.util.Scanner;

public class Main {



    /*    Crea un programa que permita al usuario crear una pizza personalizada
        eligiendo ingredientes desde un menú.
                Reglas:
• El programa muestra al usuario un menú con al menos cinco ingredientes
        posibles y su precio individual. Ejemplo: queso (10), jamón (15), piña
                (8), tomate (6), pepperoni (12).
• El usuario puede agregar hasta 5 ingredientes diferentes a su pizza,
                eligiendo uno por uno. El programa debe evitar la cantidad máxima no
        se supere.
• Por cada ingrediente elegido, el programa suma el precio
        correspondiente.
• Después de cada selección, muestra al usuario la lista actual de
        ingredientes y el subtotal acumulado.
• Cuando el usuario termina, muestra la pizza final detallada (con todos
                los ingredientes seleccionados) y el total a pagar.

     */
    public static void main  (String[] args){
        Scanner scanner=new Scanner(System.in);

        int numop=0;
        int preciototal=0;
        int op=0;
        String ingredientes="";

        System.out.println(" 1. QUESO 10 €");
        System.out.println(" 2. JAMON 15 €");
        System.out.println(" 3. PIÑA 8 €");
        System.out.println(" 4. TOMATE 6 €");
        System.out.println(" 5. PEPPERONI 12 €");
        System.out.println(" 0. NO QUIERO MAS OPCIONES");
        System.out.println(" ELIJA MAXIMO 5 OPCIONES ");


        do{

            System.out.println(" INDIQUE OPCION ");
            op=scanner.nextInt();

            switch (op){
                case 1 ->{
                    numop++;
                    preciototal+=10;
                    ingredientes=ingredientes+" QUESO";
                }
                case 2 ->{
                    numop++;
                    preciototal+=15;
                    ingredientes=ingredientes+" JAMON";
                }
                case 3 ->{
                    numop++;
                    preciototal+=8;
                    ingredientes=ingredientes+" PIÑA";
                }
                case 4 ->{
                    numop++;
                    preciototal+=6;
                    ingredientes=ingredientes+" TOMATE";
                }
                case 5 ->{
                    numop++;
                    preciototal+=15;
                    ingredientes=ingredientes+" PEPPERONI";
                }
                case 0 ->{
                    op=0;
                }
            }

            System.out.printf(" La lista de ingredientes es%s ",ingredientes);
            System.out.printf("y el importe es %d %n",preciototal);

        } while (op != 0 && numop < 5);




    }



}
