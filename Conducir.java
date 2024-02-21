public interface Conducir {
    default public void conducirCoche(Object name){
        System.out.println(name+"Conduce un coche");
    }
    default public void conducirCoche(String nombre){
        System.out.println(nombre+"Conduce un coche");
    }
}
