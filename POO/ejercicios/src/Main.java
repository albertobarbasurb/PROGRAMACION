import Clase.Persona;

public class Main {

    public static void main(String[] args) {

        Persona p1 = new Persona("Alberto", "Barbas", "53049363", 46, 89.78, 178);
        Persona p2 = new Persona("Silvia", "Moreno", "53042805k");

        System.out.println("El apellido de Silvia es "+p2.getApellido());
        System.out.println("La edad de Silvia es "+p2.getEdad());

        System.out.printf("La edad de %s es %d y pesa %f \n",p1.getNombre(),p1.getEdad(),p1.getPeso());

        p1.setPeso(4.55);
        p1.setNombre("Pepe");
        System.out.printf("La edad de %s es %d y pesa %f ",p1.getNombre(),p1.getEdad(),p1.getPeso());

       System.out.println(p1.toString());

       p1.mostradatos();
    }


}
;