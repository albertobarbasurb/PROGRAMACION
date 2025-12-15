import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        /*
        int[][] numeros=new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        for (int i = 0; i < numeros.length; i++) {
            System.out.println();
            for (int j = 0; j < 3; j++) {
                System.out.print(numeros[i][j]+" ");

                            }

        }

    int[][] numeros=new int[2][4];
    Scanner scanner=new Scanner(System.in);

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {

                System.out.printf("Escriba el valor %d x %d ",i+1,j+1);
                numeros[i][j]=scanner.nextInt();
            }

        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {

                System.out.printf("%d ",numeros[i][j]);

            }
            System.out.println();
        }



        int[][] numeros=new int[4][4];
        int suma=0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {

                numeros[i][j]=(int) (Math.random() * 20) ;

            }
        }

        for (int i = 0; i < 4; i++) {
            System.out.println();
            for (int j=0; j < 4; j++) {
                System.out.printf("%d ",numeros[i][j]);
                suma=suma+numeros[i][j];
            }
        }
        System.out.printf("El resultado es : %d",suma);


        Scanner scanner=new Scanner(System.in);
        int[][] numeros=new int[3][5];
        int valor=0;
        boolean existe=true;

        for (int i = 0; i <3 ; i++) {
            for (int j = 0; j <5; j++) {
                do{
                    valor=(int) (Math.random()*90);
                    existe=false;


                    for (int h = 0; h < 3; h++) {
                        for (int k = 0; k < 5; k++)
                        {
                            if (numeros[h][k] == valor) {
                                existe = true;
                                break;
                            }
                        }
                        if (existe) break;
                    }
                }while(existe);
                numeros[i][j]=valor;
            }
        }


        do {

            System.out.printf(" Indique un numero : ");
            valor = scanner.nextInt();
            existe=false;

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 5; j++) {
                    if (valor == numeros[i][j]) {
                        System.out.printf(" El numero %d existe en la matriz \n", valor);
                        System.out.printf(" Esta en la posicion %d X %d", i + 1, j + 1);
                        existe = true;
                        break;
                    }

                if (existe) break;

                }

            }

        if (!existe)
        {
            System.out.printf("No existe");
        }

        }while (!existe);

        for (int i = 0; i < 3; i++) {
            System.out.println();
            for (int j = 0; j < 5; j++) {
                System.out.printf("%d ", numeros[i][j]);

            }

        }



        double[][] numeros=new double[4][3];
        double[] suma=new double[4];


        for (int i = 0; i <4 ; i++) {
            for (int j = 0; j <3 ; j++) {
                numeros[i][j]=(Math.random()*10);
                suma[i]=suma[i]+numeros[i][j];
            }

        }
        for (int i = 0; i < 4; i++){
            System.out.println();
            for (int j = 0; j < 3; j++){
                System.out.printf("%.2f - ",numeros[i][j]);
            }
            System.out.printf("La media de la fila es %f ",(suma[i]/3));
        }



        int[][] numeros=new int[3][4];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                numeros[i][j]=(int)(Math.random()*90);


            }

        }
        for (int i = 0; i < 3; i++) {
            System.out.println();
            for (int j = 0; j < 4; j++) {
                System.out.printf(" %d",numeros[i][j]);

            }

        }


        System.out.println();
        int max=0;
        int min=100;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                if (numeros[j][i]>max)
                {
                    max=numeros[j][i];
                }else if (numeros[j][i]<min) {
                    min=numeros[j][i];
                }


            }
            System.out.printf("El numero mayor de la %d columna es %d \n",i,max);
            System.out.printf("El numero menor de la %d columna es %d \n",i,min);
            max=0;
            min=100;
        }



        int[][] matriz1=new int[3][4];
        int[][] matriz2=new int[4][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                matriz1[i][j]=(int)(Math.random()*100);

            }

        }
        for (int i = 0; i < 3; i++) {
            System.out.println();
            for (int j = 0; j < 4; j++) {
                System.out.printf("%d ",matriz1[i][j]);
            }

        }

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 4; j++) {
                matriz2[j][i]=matriz1[i][j];

            }

        }
        System.out.println();
        for (int i = 0; i < 4; i++) {
            System.out.println();
            for (int j = 0; j < 3; j++) {
                System.out.printf("%d ",matriz2[i][j]);
            }

        }


        int[][] numeros=new int[4][5];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                numeros[i][j]=(int)(Math.random()*100);

            }

        }

        int par=0;
        int imp=0;

        for (int i = 0; i < 4; i++) {
            System.out.println();
            for (int j = 0; j < 5; j++) {
                System.out.printf("%d ",numeros[i][j]);
                if ((numeros[i][j]%2)==0)
                {
                par++;
                } else if ((numeros[i][j]%2)!=0)
                {
                imp++;
                }
            }

        }
        System.out.println();
        System.out.printf("Hay %d numeros pares \n",par);
        System.out.printf("Hay %d numero impares \n ",imp);



        int[][] numeros=new int[10][11];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 11; j++) {
                numeros[i][j]=(i+1)*j;

            }

        }

        System.out.println();
        for (int i = 0; i < 10; i++) {
            System.out.println();
            for (int j = 0; j < 11; j++) {
                System.out.printf("%d ",numeros[i][j]);
            }

        }

         */

        Scanner scanner=new Scanner(System.in);
        System.out.print("Introduce numero de alumnos : ");
        int alumnos=scanner.nextInt();
        System.out.print("Introduce numero de asignaturas : ");
        int asignaturas=scanner.nextInt();
        double[][] notas=new double[alumnos][asignaturas];

        for (int i = 0; i < alumnos; i++) {
            for (int j = 0; j < asignaturas; j++) {
                System.out.printf("Indique la nota de la asignatura %d del alumno %d ", j+1,i+1);
                notas[i][j]=scanner.nextDouble();
            }

        }

        System.out.println(" ---------------- TABLA DE NOTAS ------------");
        System.out.print("              ");
        for (int i = 0; i < asignaturas; i++) {
            System.out.printf("AS%d  ",i+1);
        }
        System.out.println();
         for (int i = 0; i < alumnos; i++) {
             System.out.printf("Estudiante %d ",i+1);
             for (int j = 0; j < asignaturas; j++) {
                 System.out.printf("%.2f ", notas[i][j]);
             }
             System.out.println();
         }

        double suma=0;
        System.out.println(" ---------------- PROMEDIO DE NOTAS ------------");
        for (int i = 0; i < alumnos; i++) {
            for (int j = 0; j < asignaturas; j++) {
                suma=suma+notas[i][j];
            }
            System.out.printf("La media del estudiante %d es : %.2f \n",i+1,(suma/asignaturas));
            suma=0;

        }

        System.out.println(" ---------------- PROMEDIO POR ASIGNATURA ------------");
        suma=0;
        for (int i = 0; i < asignaturas; i++) {
            for (int j = 0; j < alumnos; j++) {
                suma=suma+notas[j][i];
            }
            System.out.printf("La media de la asignatura %d es : %.2f \n",i+1,(suma/alumnos));
            suma=0;

        }

        System.out.println(" ---------------- LA NOTA MAS ALTA ------------");

        double max=0;
        for (int i = 0; i < asignaturas; i++) {
            for (int j = 0; j < alumnos; j++) {
                if (notas[i][j]>max){
                    max=notas[i][j];
                }
            }

        }
        System.out.printf("La nota mas alta es : %.2f ",max);
    }




}
