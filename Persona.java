public abstract class Persona {
    
    public String nombre;
    public String[] novias;
    public String profesion;
    public int edad;
    public  boolean vivo;


    public Persona(String nombre,String[] novias,String profesion,int edad,boolean vivo){
        this.nombre=nombre;
        this.novias=novias;
        this.profesion=profesion;
        this.edad=edad;
        this.vivo=vivo;
    }

    public void irAsutrabajo(){
        System.out.println(this.nombre+" va a chambear");
    }
    public void comen(){
        System.out.println(this.nombre+" esta comiendo");
    }
    public void duerme(){
        System.out.println(this.nombre+" se fue a dormir");
    }

    @Override
    public String toString() {

        return "Hola soy "+this.nombre+" y mi profesion es "+this.profesion+" me gustan las manzanas "+this.edad;
    }
    
}