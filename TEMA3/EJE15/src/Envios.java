import java.util.Scanner;

public class Envios {

    /*
    Crea un programa que calcule el coste de envío de un paquete.
    Pide: peso del paquete (kg), distancia de envío (km), y si es envío urgente (true/false).
    Las reglas son: Precio base: 5€. Si el peso es mayor de 5kg, añadir 2€ por cada kg adicional.
    Si la distancia es mayor de 100km, añadir 10€.
    Si es envío urgente, multiplicar el precio total por 1.5.
    Muestra todos los cálculos paso a paso.

    Ejemplo de salida por consola:
Introduce el peso del paquete (kg): 7
Introduce la distancia de envío (km): 150
¿Es envío urgente? (true/false): true
Precio base: 5.0€
Peso: 7kg (excede 5kg en 2kg)
Coste adicional por peso: 4.0€
Distancia: 150km (mayor de 100km)
Coste adicional por distancia: 10.0€
Subtotal: 19.0€
¿Es envío urgente?: true
Recargo por urgencia (x1.5): 9.5€
Coste total de envío: 28.5€
     */

    public void envio(){

        Scanner scanner=new Scanner(System.in);
        int pesoextra=0;
        double preciototal=5;

        System.out.println(" Indique peso KG ");
        int peso=scanner.nextInt();
        System.out.println(" Indique distancia ");
        int distancia=scanner.nextInt();
        System.out.println(" Indique urgencia ");
        boolean urgencia=scanner.nextBoolean();

        if (peso>=5){
            pesoextra=peso-5;
            preciototal=((pesoextra*2)+5);
        }
        if (distancia>100){
            preciototal=preciototal+10;
        }
        if (urgencia){
            preciototal=preciototal*1.5;
        }
        System.out.println("Precio total del envio"+preciototal);
    }


}
