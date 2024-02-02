public class Cd extends Dispositivo{
    private String capacidad;
    private String marca;
    private String tipo = "CD";
    private String metodoLecEsc= "Láser";
    public Cd (String marca, String capacidad) {
        this.marca=marca;
        this.capacidad=capacidad;
    }

    @Override
    public void escribirDatos() {
        System.out.println("Escribiendo datos en el CD...");
    }

    @Override
    public void leerDatos() {
        System.out.println("Leyendo datos del CD...");
    }

    public void informacion() {
        super.informacion();
        System.out.println("Marca del dispositivo: " + marca);
        System.out.println("Tipo de disco: " + tipo);
        System.out.println("Capacidad: " + capacidad);
        System.out.println("Método de lectura y escritura: " + metodoLecEsc);
    }

    public void girarDispositivo(){
        System.out.println("Cd girando...");
    }
}
