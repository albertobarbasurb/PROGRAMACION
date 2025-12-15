import java.util.Scanner;
import java.util.concurrent.LinkedTransferQueue;

public class Main {

    public static void main(String[] args){

        /*
        String[] fruta=new String[]{"platano","limon","uva","manzana","pomelo"};

        for (int i = 0; i < fruta.length ; i++) {

            System.out.printf(" Fruta nº %d %s \n",i+1,fruta[i]);

        }



  int[] numeros=new int[10];

        for (int i = 0; i < numeros.length ; i++) {
            numeros[i]=(int) (Math.random() * 100) ;
        }
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);

        }

        Scanner scanner=new Scanner(System.in);
    String[] valores=new String[5];

        for (int i = 0; i < valores.length ; i++) {
            System.out.printf("Introduza valor %d  : \n ",i);
            valores[i]=scanner.nextLine();
        }

        for (int i = 0; i < valores.length ; i++) {
            System.out.printf("El valor %d es %s\n",i,valores[i]);
                    }



        int[] numeros=new int[]{2,6,8,9,0,3};
        Scanner scanner=new Scanner(System.in);
        boolean encontrado=false;
        do{
            System.out.println("Indroduzca numero : ");
            int val=scanner.nextInt();
            for (int i = 0; i < numeros.length ; i++) {
                if (val==numeros[i]) {
                    encontrado = true;
                    System.out.println("El numero si esta en la lista ");
                    break;
                }
            }
            if (!encontrado){
                System.out.println("El numero NO esta en la lista ");
            }

        }while (!encontrado);


       int[] numeros=new int[]{10,56,78,99,120,3,66,909,67,333};
        int contador=0;
        int suma=0;

        for (int i = 0; i < numeros.length ; i++) {

            if (numeros[i]>50){
            contador++;
            suma=suma+numeros[i];
                        }
        }
        System.out.printf(" Hay %d numero mayores de 50 \n",contador);
        System.out.printf(" La sume es %d \n",suma);
        System.out.printf(" El promedio es %d \n ",(suma/10));

        int[] numeros=new int[]{10,56,78,99,120,3,66,909,67,333};
        int max=0;
        int posmax=0;
        int min=1000;
        int posmin=0;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i]>max){
                max=numeros[i];
                posmax=i;
            } else if (numeros[i]<min) {
                min=numeros[i];
                posmin=i;
            }
        }
        System.out.printf("El numero maximo es %d en la posicion %d ",max,posmax);
        System.out.printf("El numero minimo es %d en la posicion %d ",min,posmin);



      String[] palabras=new String[]{"gato", "perro", "gato", "pájaro", "gato", "pez", "perro", "gato", "conejo", "perro"};
      Scanner scanner=new Scanner(System.in);
      int con=0;
      boolean lon=true;


          System.out.println("Indique una palabra");
          String val=scanner.nextLine();

          for (int i = 0; i < palabras.length ; i++) {
              if (val.equals(palabras[i])){
                  con++;
              }
          }

        System.out.printf("La palabra existe %d veces",con);


        int[] numero=new int[]{2, 4, 6, 8, 10, 12, 14,34};
        int valor=0;

        for (int i = 0; i < numero.length ; i++) {
            System.out.print(" "+numero[i]);
        }

        for (int i = 0; i <numero.length /2 ; i++) {
            valor=numero[i];
            numero[i]=numero[numero.length-(i+1)];
            numero[numero.length-(i+1)]=valor;
        }
        System.out.println();

        for (int i = 0; i < numero.length ; i++) {
            System.out.print(" "+numero[i]);
        }

*/
        Scanner scanner=new Scanner(System.in);

        System.out.print("Indica cuantos alumnos : ");
        int alumnos=scanner.nextInt();

        double[] notas=new double[alumnos];

        for (int i = 0; i < notas.length ; i++) {
            System.out.printf("Indica notal del alumno %d : ",i+1);
            notas[i]=scanner.nextDouble();
        }

        System.out.print("Calificaciones : [ ");
        for (int i = 0; i < notas.length ; i++) {
             System.out.printf("%.2f ",notas[i]);

        }
        System.out.println(" ]");

        double suma=0;
        for (int i = 0; i <notas.length ; i++) {
            suma=suma+notas[i];
        }
        System.out.printf("La nota media de la clase es : %.2f \n ",(suma/alumnos));

        suma=0;
        for (int i = 0; i <notas.length ; i++) {
        if (notas[i]>=5){
            suma++;
            }
        }
        System.out.printf("El numero de aprobados es %d \n",((int)suma));

        double notamax=0;
        double notamin=10;
        for (int i = 0; i <notas.length; i++)
        {
            if (notas[i]>notamax)
            {
                notamax=notas[i];
            } else if (notas[i] < notamin)
            {
                notamin=notas[i];
            }
        }
        System.out.printf("La nota mas alta es %.2f \n",notamax);
        System.out.printf("La nota mas baja es %.2f \n",notamin);

        }

    }


