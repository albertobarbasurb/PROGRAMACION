public class Main {

    public static void main(String[] args){

       /*

        for ( int i =1;i<10;i++){
            System.out.println(" Repitiendo");
            if (i==3) {
                break;
            }
        }
     */
int acumulador=0;
        do {
            acumulador+= (int) (Math.random()*41);
           if ( acumulador>100 && acumulador<120){
            System.out.println("nos acercamos preligrosamente )");
            break;
            }
        }while (acumulador<=301);

        System.out.println("el acumlador tiene un valor de "+acumulador);
    }
}

