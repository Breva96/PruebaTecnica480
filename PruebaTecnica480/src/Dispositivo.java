public abstract class Dispositivo {

    public void informacion() {
        System.out.println("---Información del dispositivo---");
    }

    public abstract void escribirDatos();

    public abstract void leerDatos();

    public abstract void girarDispositivo();
}
