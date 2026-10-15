

public class Main {
    public static void main(String[] args) {
        // 1. Instanciamos el carro de compras
        CarroCompra miCarro = new CarroCompra();

        // 2. Llamamos al método público que calcula y muestra el total
        System.out.println("--- Iniciando prueba de compilación ---");
        miCarro.mostrarTotal();
    }
}