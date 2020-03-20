public class Academico extends Persona{
    protected String paper;

    public Academico(String nombre, String ocupacion, int edad, String paper) {
        super(nombre, ocupacion, edad);
        this.paper = paper;
    }
    public void dormir(){
        System.out.println("ZzZzZzZ");
    }
    public void usarZoom(){
        System.out.println("Hola alumnos aprendi a usar Zoom, miren mi gatito :3");
    }
    public String publicarPaper(){
        return paper;
    }
}
