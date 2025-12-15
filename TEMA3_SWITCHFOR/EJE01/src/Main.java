
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
/*
        System.out.println("Indique dia de la semana ");
        int dia=scanner.nextInt();

        switch (dia){
            case 1:
            {
                System.out.println("El dia es Lunes");
            }
            break;
            case 2:
            {
                System.out.println("El dia es Martes");
            }
            break;
            case 3:
            {
                System.out.println("El dia es Miercoles");
            }
            break;
        }

        System.out.println("Indique nota ");
        String nota=scanner.next();

        switch (nota){
            case "A":
            {
                System.out.println("Nota aprobado");
            }
            break;
            case "B":
            {
                System.out.println("Nota bienvenida");
            }
            break;
            case "C":
            {
                System.out.println("Nota Corte");
            }
            break;
        }




        Double res=0.00;
        System.out.println("Ope1 ");
        int op1 = scanner.nextInt();
        System.out.println("Ope2 ");
        int op2 = scanner.nextInt();
        System.out.println("Operacion +,-,*,/,% ");
        String op = scanner.next();

        switch (op){
            case "+":
            {
                res= (double) (op1+op2);
                System.out.println(" La suma es"+res);
                break;
            }
            case "-":
            {
                res= (double) (op1-op2);
                System.out.println(" La resta es"+res);
                break;
            }
            case "*":
            {
                res= (double) (op1*op2);
                System.out.println(" La multilplicacion es"+res);
                break;
            }
        }

        switch (op){
            case "+" ->
            {
                res= (double) (op1+op2);
                System.out.println(" La suma es"+res);
            }
            case "-" ->
            {
                res= (double) (op1-op2);
                System.out.println(" La resta es"+res);
            }
            case "*" ->
            {
                res= (double) (op1*op2);
                System.out.println(" La multilplicacion es"+res);
            }
        }
    }



        System.out.println("Indique mes ");
        int mes=scanner.nextInt();

        switch (mes){
            case 1,2,3 ->
            {
                System.out.println(" primer grupo");
            }
            case 4,5,6 ->
            {
                System.out.println(" segundo grupo");
            }
        }

        System.out.println("Indique numero ");
        int num=scanner.nextInt();

        for (int i=0;i<=10;i++) {
            System.out.printf("%d X %d = %d \n", i, num, (i * num));
        }


        System.out.println("Indique numero ");
        int num=scanner.nextInt();
        int sum=0;

        for (int i=0;i<=num;i++){
            System.out.print(i+" + ");
            sum = sum+i;
        }
        System.out.println("la sume es "+sum);
    */
        int par=0;
        System.out.println("Indique numero ");
        int num=scanner.nextInt();

        for (int i=1;i<=num;i++){
            if (i%2==0){
                par=par+1;
            }
        }
        System.out.println("En total hay  "+par);
    }
 }
