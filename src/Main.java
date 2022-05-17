public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        cliente.setEdad(25);
        cliente.setTelefono("+34666555444");
        cliente.setNombre("Antonio");
        cliente.setCredito(20000);

        System.out.println("Nombre: " + cliente.nombre + "\n" + "Edad: " + cliente.edad + "\n" + "Telefono: " +  cliente.telefono + "\n" + "Credito: " + cliente.credito);


        Trabajador trabajador = new Trabajador();
        trabajador.setEdad(30);
        trabajador.setTelefono("+34444555666");
        trabajador.setNombre("Jacinto");
        trabajador.setSalario(1600);

        System.out.println("Nombre: " + trabajador.nombre + "\n" + "Edad: " + trabajador.edad + "\n" + "Telefono: " +  trabajador.telefono + "\n" + "Salario: " + trabajador.salario);

}
}