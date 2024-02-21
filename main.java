public class main {
    public static void main(String[] args) {
        String[] noviasSamuel={"Pepa","Juanita"};
       String[] noviasJose={"Verónica"};
       PilotoAvion pAvion = new PilotoAvion("Samuel", noviasSamuel, "Piloto", 30, true, false);
       Programador programador= new Programador("José", noviasJose,"Programaor" , 24, true, true);
        
       //pAvion.conducirCoche();
       pAvion.conducirAvion();

       System.out.println("--------------------------------------------------------");

       programador.conducirCoche(programador.nombre);
       programador.arreglarOrdenador();
       programador.crearSoftware();
       
    }
}
