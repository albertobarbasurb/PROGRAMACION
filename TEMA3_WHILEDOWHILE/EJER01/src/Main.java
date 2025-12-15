import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        /*
        System.out.println("Indique un numero");
        int num=scanner.nextInt();
        int cont=0;

        while (cont!=num){
            cont=cont+1;
            System.out.println(cont);

        }
        String pass="";

        do {
            System.out.println("Indique una constraseña");
            pass=scanner.next();

        }while (!pass.equals("hola"));


        int num=0;
        int total=0;

        do {
            System.out.println("Indique un numero");
            num=scanner.nextInt();
            total=total+num;

        }while (num>0);

        System.out.println("Suma "+total);


        int numeroSistema = (int) (Math.random() * 10) ;
        int numeroUsuario=0;
        int contador=0;

        System.out.println("El numero es "+numeroSistema);

        do
        {
            contador=contador+1;
            System.out.printf(" Indique tu intento numero %d : ",contador);
        numeroUsuario=scanner.nextInt();


            if (numeroUsuario > numeroSistema) {
                System.out.println("El numero es menor");
            }else if (numeroUsuario < numeroSistema){
                System.out.println("El numero es mayor");
            }

        }while ((numeroSistema!=numeroUsuario) && contador<7);

        if (contador==7){
            System.out.println("NO LO HAS ACERTADO EN 7 INTENTOS");
        }else{
            System.out.println("LO HAS ACERTADO");
        }

        int op=0;

        do{

            System.out.println(" 1. SALUDAR");
            System.out.println(" 2. DECIR LA HORA");
            System.out.println(" 3. DESPEDIRSE ");
            System.out.println(" 4. SALIR");

            System.out.println(" ELEIJA UNA OPCION");
            op=scanner.nextInt();

            switch (op){
                case 1 -> {
                    System.out.println("HOLA");
                }
                case 2 -> {
                    System.out.println("SON LAS 10:00");
                }
                case 3 -> {
                    System.out.println("ADIOS");
                }
            }

        }while (op!=4);


        System.out.println(" ELEIJA UN NUMERO");
        int op=scanner.nextInt();

        do{
            System.out.println(op);
            op=op-1;
        }while (op!=0);

        System.out.println(" DESPEGUE ¡¡¡");




        System.out.println(" CUANTAS NOTAS VAS A INGRESAR");
        int cantidad=scanner.nextInt();
        int[] nota=new int[cantidad];
        int contador=0;
        int suma=0;
        do{

            System.out.printf(" Introduzca la nota nº %d ",(contador+1));
            nota[contador]=scanner.nextInt();
            suma=suma+nota[contador];
            contador=contador+1;


        }while(contador!=cantidad);

        System.out.printf(" La suma total es %d ",suma);
        System.out.printf(" La media es %d ",(suma/cantidad));

      int edad=0;

        do {

          System.out.println("Diga edad");
          edad=scanner.nextInt();

            System.out.println("Edad no valida debe estar entre 0 y 120 ");

      }while (edad<=0 || edad>=120);

    Desarrolla un programa que simule un cajero automático.
    El saldo inicial es 1000€.
    Usa un bucle do-while para mostrar un menú con opciones: 1=Consultar saldo, 2=Retirar dinero, 3=Depositar dinero, 4=Salir. Usa switch para cada opción.
    Para retirar dinero, usa un bucle while para validar que no se retire más del saldo disponible (si intenta retirar más, debe volver a pedir la cantidad).
    Para depositar, valida que sea una cantidad positiva.Ejemplo de salida por consola
*/

        int saldo=1000;
        int opcion=0;

        do{

            System.out.println("1. Consultar saldo");
            System.out.println("2. Retirar dinero");
            System.out.println("3. Depositar dinero");
            System.out.println("4. Salir");

            System.out.print("ELIJA OPCION ");
            opcion=scanner.nextInt();

            switch (opcion){
                case 1 ->
                {
                    System.out.printf(" El saldo es de %d $ EUROS \n",saldo);
                }
                case 2 ->
                {
                    int retirar=0;
                    do {
                        System.out.println(" Indique el saldo a retirar ");
                        retirar=scanner.nextInt();
                    }while (saldo<retirar);

                        saldo=saldo-retirar;
                }
                case 3 ->
                {
                    System.out.println(" Indique el saldo a depositar ");
                    saldo=saldo+(scanner.nextInt());
                }
            }

        }while(opcion!=4);

    }

}

