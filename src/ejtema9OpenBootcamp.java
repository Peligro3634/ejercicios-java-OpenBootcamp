public class ejtema9OpenBootcamp {
    public static void main(String[] args){

        Cliente cliente = new Cliente();
        cliente.setEdad(15);
        System.out.println(cliente.getEdad());
    }
}
class Personas{
    private int edad;
    private String nombre;
    private int telefono;

    public void setEdad(int edad){
        this.edad = edad;
    }
    public int getEdad(){
        return this.edad;
    }

    public void setTelefono(int telefono){
        this.telefono = telefono;
    }
    public int getTelefono(){
        return this.telefono;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return this.nombre;
    }

}
class Cliente extends Personas{
    int credito;

    public void setCredito(int credito){
        this.credito = credito;
    }
    public int getCredito(){
        return this.credito;
    }

}


class Trabajador extends Personas{
    int salario;

    public void setSalario(int salario){
        this.salario = salario;
    }
    public int getSalario(){
        return this.salario;
    }
}


