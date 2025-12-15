import java.util.Scanner;

public class Prestamo{

    public void prestamo(){

        Scanner scanner=new Scanner(System.in);
        System.out.println("Indique la edad : ");
        int edad=scanner.nextInt();
        System.out.println("Indique ingresos mensuales : ");
        int ingresos=scanner.nextInt();
        System.out.println("Indique deudas actuales : ");
        boolean deudas=scanner.nextBoolean();

        boolean requisitoedad=(edad>=21 & edad<=65);
        boolean requisitoingresos=(ingresos>=1000);

        if (requisitoedad && requisitoingresos && !deudas){
            System.out.println(" ES VALIDO");
            }else
            {
            System.out.println(" NO ES VALIDO");
        }
    }
}
