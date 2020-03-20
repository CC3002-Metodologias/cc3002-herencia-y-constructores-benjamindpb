public class Estudiante extends Persona {

    public Estudiante(String nombre, String ocupacion, int edad) {
        super(nombre, ocupacion, edad);
    }

    public void dormir(){
        System.out.println("ZzZzZz");
    }
    public void verAnime(){
        System.out.println("Death Note");
    }
    public void verNetflix(){
        System.out.printf("Narcos");
    }
}
