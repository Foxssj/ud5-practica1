import com.utils.randomGenerator.RandomGenerator;

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
        //6. Genera un mecanismo para que todas las clases dispongan de una representación
        //como cadena de texto que se asemeje a lo siguiente:
        //Cliente
        //===================================
        //* Nombre: <Nombre del cliente>
        //* Total de productos: <Número de productos>
        //* Lista de artículos en la cesta:
        //<Nombre artículo 1>
        //<Nombre artículo 2>
        //===================================
        //Cajero
        //===================================
        //* Número de caja: <Número de caja>:
        //* Total de clientes: <Número de clientes>
        //* Clientes en la fila:
        //<Nombre cliente 1>
        //<Nombre cliente 2>
        //===================================
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
        //9. [Reto opcional] Añade dos cajeros adicionales y modifica el menú de la clase
        //ejecutable para que:
        //• A la hora de crear un cliente, este se ponga automáticamente en la caja con menos
        //personas esperando.
        //• Atender un cliente hará que se atienda un cliente en cada caja.
        //• Al ver clientes pendientes, se preguntará de qué caja, enseñando sus
        //identificadores.
        //• Las opciones de abrir y cerrar cajas deberán preguntar qué caja quiere abrir o
        //cerrar. Cuando no queden cajas abiertas, se cierra el supermercado y el programa.


    }
}