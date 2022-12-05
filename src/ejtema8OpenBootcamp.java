public class ejtema8OpenBootcamp {
    public static void main(String[] args) {
        Persona persona = new Persona();

        persona.setNombre("Andres");
        System.out.println(persona.getNombre());

        persona.setEdad("36");
        System.out.println(persona.getEdad());

        persona.setTelefono("0303456");
        System.out.println(persona.getTelefono());
    }
}
class Persona{
    private String nombre;
    private String edad;
    private String telefono;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre(){
        return this.nombre;
    }
    public void setEdad(String edad) {
        this.edad = edad;
    }
    public String getEdad(){
        return this.edad;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getTelefono(){
        return this.telefono;
    }
}
