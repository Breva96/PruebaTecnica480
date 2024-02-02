public class DiscoDuro extends Dispositivo{
    private String capacidad;
    private String marca;
    private String tipo = "Disco duro";
    private String metodoLecEsc= "Cabezal magnético";
    public DiscoDuro(String marca, String capacidad) {
        this.marca=marca;
        this.capacidad=capacidad;
    }

    @Override
    public void escribirDatos() {
        System.out.println("Escribiendo datos en el disco duro...");
    }

    @Override
    public void leerDatos() {
        System.out.println("Leyendo datos del disco duro...");
    }

    public void informacion() {
        super.informacion();
        System.out.println("Marca del dispositivo: " + marca);
        System.out.println("Tipo de disco: " + tipo);
        System.out.println("Capacidad: " + capacidad);
        System.out.println("Método de lectura y escritura: " + metodoLecEsc);
    }

    public void girarDispositivo() {
        System.out.println("Disco duro girando...");
    }
}
