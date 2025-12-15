import java.util.Scanner;

public class Juego {

    public void juego() {
        Scanner scanner = new Scanner(System.in);

        int[] carton = new int[7];
        boolean numok = true;

        for (int i = 0; i < 7; i++) {

            do {

                System.out.printf("Introduzca el numero %d del carton : ", i + 1);
                carton[i] = scanner.nextInt();
                if (carton[i] > 0 && carton[i] < 25) {
                    numok = true;
                } else {
                    numok = false;
                    System.out.println(" NUMERO ERRONEO");
                }

            } while (!numok);

        }
        System.out.print("TU CARTON ES : ");
        for (int i = 0; i < 7; i++) {
            System.out.printf("%d ",carton[i]);

        }

        int[] loteria=new int[7];

        for (int i = 0; i < 7; i++) {
            loteria[i]=(int)((Math.random()*24)+1);
        }

        System.out.println();
        System.out.print("EL CARTON GANADOR ES : ");
        for (int i = 0; i < 7; i++) {
            System.out.printf("%d ",loteria[i]);
        }





        int aciertos=0;
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                if (loteria[j]==carton[i]){
                    aciertos++;
                    break;
                                    }

            }

        }
        System.out.println();
        System.out.printf("El nuemero de acietos es %d ",aciertos);

        for (int numero : carton) {
            System.out.println(numero);
        }

    }

}
