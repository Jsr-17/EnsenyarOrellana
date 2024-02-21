
public class PilotoAvion extends Persona implements Conducir,Volar {

    boolean hola;

    public PilotoAvion(String nombre,String[] novias,String profesion,int edad,boolean vivo,boolean hola){
        super(nombre, novias, profesion, edad, vivo);
        this.hola=hola;
    }


    @Override
    public void irAsutrabajo() {
        if (hola) {
            System.out.println("Soy un piloto y si soy ");
        }else{
            System.out.println("Soy un piloto, no soy  por que no tengo pareja");
        }
    }

    @Override
    public void conducirAvion() {
        System.out.println(this.nombre+" conduce un avion y vuela a cuba");
        
    }


    @Override
    public void holita() {
        System.out.println(this.nombre +" se va de holita");
        
    }

    
}
