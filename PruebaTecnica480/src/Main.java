public class Main {
    public static void main(String[] args) {

        Cd cd = new Cd("Sony", "700MB");
        DiscoDuro discoDuro = new DiscoDuro("Samsung","1TB");

        System.out.println("---Comportamiento del CD---");
        cd.girarDispositivo();
        cd.escribirDatos();
        cd.leerDatos();
        System.out.println();
        cd.informacion();

        System.out.println();

        System.out.println("---Comportamiento del disco duro---");
        discoDuro.girarDispositivo();
        discoDuro.escribirDatos();
        discoDuro.leerDatos();
        System.out.println();
        discoDuro.informacion();
    }
}
