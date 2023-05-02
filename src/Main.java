import com.utils.cashier.Cashier;
import com.utils.customer.Customer;
import com.utils.randomGenerator.RandomGenerator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //1. Crea una estructura de paquetes adecuada para representar las entidades y utilidades
        //que participan en la simulación.

        //4. Implementa una clase que represente al cliente. En esta clase, considera los atributos
        //mínimos requeridos y desarrolla los métodos necesarios para interactuar con la cesta
        //de la compra.
        //5. Desarrolla una clase que represente al cajero/a. En esta clase, considera los atributos
        //mínimos requeridos y desarrolla los métodos necesarios para interactuar con la fila de
        //clientes.

        boolean salir = false;
        Scanner sc = new Scanner(System.in);
        Cashier cashier = new Cashier(1);

        while (!salir) {
            System.out.println("Choose an option: \n" +
                    "1.- Abrir caja \n" +
                    "2.- Añadir un nuevo cliente a la cola\n" +
                    "3.- Atender un cliente \n"+
                    "4.- Ver clientes pendientes\n" +
                    "5.- Cerrar supermercado");
            String option = sc.nextLine();
            switch (option) {
                case "1":
                    cashier.addCashier();
                    System.out.println("There's a new chashier open");
                    break;
                case "2":
                    Customer newCustomer = new Customer();
                    cashier.setCustomerOnLine(newCustomer.getName());
                    break;
                case "3":
                    cashier.attendCustomer();
                    break;
                case "4":
                    System.out.println(cashier.ShowCashierInfo());
                    break;
                case "Q":
                case "q":
                    salir = true;
            }

        }

        //7. En la clase ejecutable del proyecto, implementa un menú que, con un solo cajero/a,
        //tenga las siguientes opciones:
        //• Abrir caja: Permite al cajero/a abrir la caja para que puedan pasar clientes a hacer
        //cola. Debe salir un mensaje que indique al usuario la correcta apertura o si ya
        //estaba abierta.
        //• Añadir un nuevo cliente a la cola: Genera un cliente aleatorio con un número
        //aleatorio de productos. A continuación, si la caja está abierta, se añade a la cola y
        //se muestra por pantalla el cliente generado, de lo contrario, debe mostrarse un
        //mensaje que indique que la caja está cerrada.
        //• Atender un cliente: Si hay clientes en la cola, atenderá al que le toque. Se
        //mostrará por pantalla un mensaje indicando a quién se ha atendido, así como uno
        //si no hubiera clientes a los que atender.
        //• Ver clientes pendientes: Muestra los clientes que hay esperando actualmente en
        //la cola junto con el identificador del cajero/a.
        //• Cerrar supermercado: Si está abierta, cierra la caja antes de salir del programa.
        //2
        //8. Incluye documentación en tu proyecto en la que se indique la necesidad a partir de la
        //que surge el proyecto y una explicación de la funcionalidad del menú de usuario.

    }
}