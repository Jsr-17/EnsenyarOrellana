
public class Programador extends Persona implements Ordenadores,Conducir {

    boolean calvo;
    public Programador(String nombre,String[] novias,String profesion,int edad,boolean vivo,boolean calvo){
        super(nombre, novias, profesion, edad, vivo);
        this.calvo=calvo;
    }

    @Override
    public void irAsutrabajo() {
        System.out.println("Soy programador y mi trabajo es hacer  como que escribo y preguntar a chatpgt");
    }

    @Override
    public void arreglarOrdenador() {
       System.out.println(this.nombre+" se encuentra arreglando un ordenador");
    }

    @Override
    public void crearSoftware() {
        System.out.println(this.nombre+" está haciendo como que programa");
        
    }

    @Override
    public void conducirCoche(Object name) {
        Programador nombre= (Programador) name;
        Conducir.super.conducirCoche(nombre.nombre);
    }

    @Override
    public void conducirCoche(String nombre) {
        // TODO Auto-generated method stub
        Conducir.super.conducirCoche(nombre+" ");
    }


    
}
