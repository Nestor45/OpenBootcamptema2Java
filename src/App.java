public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        System.out.println(precioConIva(3499.99));
    }

    public static double precioConIva(double precio) {
        double iva = precio * 0.16;
        return precio + iva;
    }
}
