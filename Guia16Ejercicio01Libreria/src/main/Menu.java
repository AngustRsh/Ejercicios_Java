/*
Tareas a realizar
1) Crear base de datos Librería
2) Crear unidad de persistencia
3) Crear entidades previamente mencionadas (excepto Préstamo)
4) Generar las tablas con JPA
5) Crear servicios previamente mencionados.
6) Crear los métodos para persistir entidades en la base de datos librería
7) Crear los métodos para dar de alta/bajo o editar dichas entidades.
8) Búsqueda de un Autor por nombre.
9) Búsqueda de un libro por ISBN.
10) Búsqueda de un libro por Título.
11) Búsqueda de un libro/s por nombre de Autor.
12) Búsqueda de un libro/s por nombre de Editorial.
13) Agregar las siguientes validaciones a todas las funcionalidades de la aplicación:
• Validar campos obligatorios.
• No ingresar datos duplicados.
 */
package main;

import entidades.Autor;
import entidades.Cliente;
import entidades.Editorial;
import entidades.Libro;
import entidades.Prestamo;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import servicios.AutorServicio;
import servicios.ClienteServicio;
import servicios.EditorialServicio;
import servicios.LibroServicio;
import servicios.PrestamoServicio;

public class Menu {

    private final AutorServicio autorService = new AutorServicio();
    private final EditorialServicio editorialService = new EditorialServicio();
    private final LibroServicio libroService = new LibroServicio();
    private final PrestamoServicio prestamoService = new PrestamoServicio();
    private final ClienteServicio clienteService = new ClienteServicio();

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Menu() {
        autorService.setServicios(editorialService, libroService);
        editorialService.setServicios(autorService, libroService);
        libroService.setServicios(autorService, editorialService);
    }

    public void mostrarMenu() {
        int opcion = 0;

        do {
            System.out.println("------ Menú Principal ------");
            System.out.println("1- Agregar Autor");
            System.out.println("2- Agregar Editorial");
            System.out.println("3- Agregar Libro");
            System.out.println("4- Agregar Cliente");
            System.out.println("5- Agregar un Prestamo");
            System.out.println("6- Buscar Libro Por Titulo");
            System.out.println("7- Listar Todos Los Libros");
            System.out.println("8- Buscar Autor Por Nombre");
            System.out.println("9- Listar Todos Los Autores");
            System.out.println("10- Buscar Editorial Por Nombre");
            System.out.println("11- Listar todas Las Editoriales");
            System.out.println("12- Listar Todos Los Clientes");
            System.out.println("13- Buscar Prestamo por Cliente");
            System.out.println("14- Devolver Libro");
            System.out.println("15- Registrar Prestamo");
            System.out.println("16- Salir");
            System.out.println("Ingrese su opción: ");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    agregarAutor();
                    break;
                case 2:
                    agregarEditorial();
                    break;
                case 3:
                    agregarLibro();
                    break;
                case 4:
                    agregarCliente();
                    break;
                case 5:
                    agregarPrestamo();
                    break;
                case 6:
                    buscarLibroPorTitulo();
                    break;
                case 7:
                    listarTodosLosLibros();
                    break;
                case 8:
                    buscarAutorPorNombre();
                    break;
                case 9:
                    listarTodosLosAutores();
                    break;
                case 10:
                    buscarEditorialPorNombre();
                    break;
                case 11:
                    listarTodasLasEditoriales();
                    break;
                case 12:
                    listarTodosLosClientes();
                    break;
                case 13:
                    buscarPrestamosPorCliente();
                    break;
                case 14:
                    devolverLibro();
                    break;
                case 15:
                    registrarPrestamo();
                    break;
                case 16:
                    System.out.println("¡Saliendo!");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, ingrese una opción válida.");
            }
        } while (opcion != 16);
    }

    //Opcion 1
    private void agregarAutor() {
        System.out.println("------ Agregar Autor ------");
        System.out.println("Ingrese el nombre del autor: ");
        String nombre = leer.next();
        boolean alta = true;

        // Llama al método del servicio para agregar el autor
        Autor autor = autorService.crearAutor(nombre, alta);

        if (autor != null) {
            System.out.println("Autor agregado exitosamente.");
        } else {
            System.out.println("Error al agregar el autor. Por favor, inténtelo nuevamente.");
        }
    }

    // Opcion 2
    private void agregarEditorial() {
        System.out.println("------ Agregar Editorial ------");
        System.out.println("Ingrese el nombre de la editorial: ");
        String nombre = leer.next();
        boolean alta = true;

        // Llama al método del servicio para agregar la editorial
        Editorial editorial = editorialService.crearEditorial(nombre, alta);

        if (editorial != null) {
            System.out.println("Editorial agregada exitosamente.");
        } else {
            System.out.println("Error al agregar la editorial. Por favor, inténtelo nuevamente.");
        }
    }

    //Opcion 3
    private void agregarLibro() {
        System.out.println("----- Agregar Libro -----");
        System.out.println("Ingrese el título del libro: ");
        String titulo = leer.next();

        System.out.println("Ingrese el año del libro: ");
        int anio = leer.nextInt();

        System.out.println("Ingrese la cantidad de libros: ");
        int ejemplares = leer.nextInt();

        System.out.println("Ingrese cantidad de Libros Prestados: ");
        int ejemplaresPrestados = leer.nextInt();

        int ejemplaresRestantes = ejemplares - ejemplaresPrestados;
        boolean alta = true;
        // Pedie al usuario que seleccione un autor y una editorial existentes
        System.out.println("Autores existentes:");
        List<Autor> autores = autorService.listarAutores();
        for (Autor autor : autores) {
            System.out.println(autor.getId() + ": " + autor.getNombre());
        }

        System.out.println("Seleccione el ID del autor: ");
        int autorId = Integer.parseInt(leer.next());
        Autor autorSeleccionado = autorService.buscarPorId(autorId);

        System.out.println("Editoriales existentes:");
        List<Editorial> editoriales = editorialService.listarEditoriales();
        for (Editorial editorial : editoriales) {
            System.out.println(editorial.getId() + ": " + editorial.getNombre());
        }

        System.out.println("Seleccione el ID de la editorial: ");
        int editorialId = Integer.parseInt(leer.next());
        Editorial editorialSeleccionada = editorialService.buscarPorId(editorialId);

        // Después de obtener la información necesaria, llamamos al método agregarLibro del servicio
        Libro libro = libroService.crearLibro(titulo, anio, ejemplares, ejemplaresPrestados, ejemplaresRestantes,
                alta, autorSeleccionado, editorialSeleccionada);
        if (libro != null) {
            System.out.println("Libro agregado exitosamente.");
        } else {
            System.out.println("Error al agregar el libro. Por favor, inténtelo nuevamente.");
        }
    }

    //Opcion 4
    private void agregarCliente() {
        System.out.println("------ Agregar Cliente ------");
        System.out.println("Ingrese el documento del cliente: ");
        Long documento = leer.nextLong();

        System.out.println("Ingrese Nombre del cliente");
        String nombre = leer.next();

        System.out.println("Ingrese Apellido del cliente");
        String apellido = leer.next();

        System.out.println("Ingrese telefono del cliente");
        String telefono = leer.next();

        // Llama al método del servicio para agregar el autor
        Cliente cliente = clienteService.crearCliente(documento, nombre, apellido, telefono);

        if (cliente != null) {
            System.out.println("Cliente agregado exitosamente.");
        } else {
            System.out.println("Error al agregar el cliente. Por favor, inténtelo nuevamente.");
        }
    }

    //Opcion 5
    private void agregarPrestamo() {
        System.out.println("------ Agregar Prestamo ------");
        System.out.println("Ingrese fecha de retiro del libro (dd/mm/yyyy): ");
        String fechaPrestamoString = leer.next();
        System.out.println("Ingrese fecha de devolucion del libro (dd/mm/yyyy): ");
        String fechaDevolucionString = leer.next();

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date fechaPrestamo = dateFormat.parse(fechaPrestamoString);
            Date fechaDevolucion = dateFormat.parse(fechaDevolucionString);

            System.out.println("Ingresar Cliente: ");
            // Pedie al usuario que seleccione un cliente existentes
            System.out.println("Clientes existentes:");
            List<Cliente> clientes = clienteService.listarClientes();
            for (Cliente cliente : clientes) {
                System.out.println(cliente.getId() + ": " + cliente.getNombre());
            }
            System.out.println("Seleccione el ID del cliente: ");
            int clienteId = Integer.parseInt(leer.next());
            Cliente clienteSeleccionado = clienteService.buscarPorId(clienteId);

            System.out.println("Ingresar Libro: ");
            // Pedie al usuario que seleccione un libro existentes
            System.out.println("Libros existentes:");
            List<Libro> libros = libroService.listarLibros();
            for (Libro libro : libros) {
                System.out.println(libro.getIsbn() + ": " + libro.getTitulo());
            }
            System.out.println("Seleccione el isbn del libro: ");
            int libroisbn = Integer.parseInt(leer.next());
            Libro libroSeleccionado = libroService.buscarPorIsbn(libroisbn);

            // Llama al método del servicio para agregar el prestamo
            Prestamo prestamo = prestamoService.crearPrestamo(fechaPrestamo, fechaDevolucion, clienteSeleccionado, libroSeleccionado);

            if (prestamo != null) {
                System.out.println("Prestamo agregado exitosamente.");
            } else {
                System.out.println("Error al agregar el prestamo. Por favor, inténtelo nuevamente.");
            }
        } catch (ParseException e) {
            System.out.println("Error: Formato de fecha incorrecto. Por favor, ingrese la fecha en el formato dd/MM/yyyy.");
        }
    }

    //Opcion 6
    private void buscarLibroPorTitulo() {
        System.out.println("------ Buscar Libro por Título ------");
        System.out.println("Ingrese el título del libro a buscar: ");
        String titulo = leer.next();

        // Llama al método del servicio para buscar el libro por título
        Libro libro = libroService.buscarPorTitulo(titulo);

        if (libro != null) {
            System.out.println("Libro encontrado:");
            System.out.println("ISBN: " + libro.getIsbn());
            System.out.println("Título: " + libro.getTitulo());
            System.out.println("Autor: " + libro.getAutor().getNombre());
        } else {
            System.out.println("Libro no encontrado.");
        }
    }

    //Opcion 7
    private void listarTodosLosLibros() {
        System.out.println("------ Listar Todos los Libros ------");
        List<Libro> libros = libroService.listarLibros();

        if (!libros.isEmpty()) {
            System.out.println("Lista de libros:");
            for (Libro libroAux : libros) {
                System.out.println("ISBN: " + libroAux.getIsbn() + ", Título: " + libroAux.getTitulo() + ", Autor: " + libroAux.getAutor().getNombre());
            }
        } else {
            System.out.println("No hay libros registrados.");
        }
    }

    //Opcion 8
    private void buscarAutorPorNombre() {
        System.out.println("------ Buscar Autor por Nombre ------");
        System.out.println("Ingrese el nombre del autor a buscar: ");
        String nombre = leer.next();

        // Llama al método del servicio para buscar el autor por nombre
        Autor autor = autorService.buscarPorNombre(nombre);

        if (autor != null) {
            System.out.println("Autor encontrado:");
            System.out.println("ID: " + autor.getId());
            System.out.println("Nombre: " + autor.getNombre());
        } else {
            System.out.println("Autor no encontrado.");
        }
    }

    //Opcion 9
    private void listarTodosLosAutores() {
        System.out.println("------ Listar Todos los Autores ------");
        List<Autor> autores = autorService.listarAutores();

        if (!autores.isEmpty()) {
            System.out.println("Lista de autores:");
            for (Autor autor : autores) {
                System.out.println("ID: " + autor.getId() + ", Nombre: " + autor.getNombre());
            }
        } else {
            System.out.println("No hay autores registrados.");
        }
    }

    //Opcion 10
    private void buscarEditorialPorNombre() {
        System.out.println("------ Buscar Editorial por Nombre ------");
        System.out.println("Ingrese el nombre de la editorial a buscar: ");
        String nombre = leer.next();

        // Llama al método del servicio para buscar la editorial por nombre
        Editorial editorial = editorialService.buscarPorNombre(nombre);

        if (editorial != null) {
            System.out.println("Editorial encontrada:");
            System.out.println("ID: " + editorial.getId());
            System.out.println("Nombre: " + editorial.getNombre());
        } else {
            System.out.println("Editorial no encontrada.");
        }
    }

    //Opcion 11
    private void listarTodasLasEditoriales() {
        System.out.println("------ Listar Todas las Editoriales ------ ");
        List<Editorial> editoriales = editorialService.listarEditoriales();

        if (!editoriales.isEmpty()) {
            System.out.println("Lista de editoriales:");
            for (Editorial editorial : editoriales) {
                System.out.println("ID: " + editorial.getId() + ", Nombre: " + editorial.getNombre());
            }
        } else {
            System.out.println("No hay editoriales registradas.");
        }
    }

    //Opcion 12
    private void listarTodosLosClientes() {
        System.out.println("------ Listar Todos los Clientes ------");
        List<Cliente> clientes = clienteService.listarClientes();

        if (!clientes.isEmpty()) {
            System.out.println("Lista de clientes:");
            for (Cliente cliente : clientes) {
                System.out.println("ID: " + cliente.getId() + ", Nombre: " + cliente.getNombre());
            }
        } else {
            System.out.println("No hay autores registrados.");
        }
    }

    //Opcion 13
    private void buscarPrestamosPorCliente() {
        System.out.println("------ Buscar Préstamos por Cliente ------");
        System.out.println("Ingrese el ID del cliente: ");
        int clienteId = leer.nextInt();

        // Llama al método del servicio para buscar el cliente por ID
        Cliente cliente = clienteService.buscarPorId(clienteId);
        if (cliente != null) {
            System.out.println("Cliente encontrado:");
            System.out.println("ID: " + cliente.getId());
            System.out.println("Nombre: " + cliente.getNombre());

            // Ahora, busca los préstamos asociados a este cliente
            List<Prestamo> prestamosCliente = prestamoService.buscarPorCliente(cliente);
            if (!prestamosCliente.isEmpty()) {
                System.out.println("Préstamos del cliente:");
                for (Prestamo prestamo : prestamosCliente) {
                    System.out.println("ID Préstamo: " + prestamo.getId());
                    System.out.println("Fecha de Préstamo: " + prestamo.getFechaPrestamo());
                    System.out.println("Fecha de Devolución: " + prestamo.getFechaDevolucion());
                    System.out.println("Libro Prestado: " + prestamo.getLibro().getTitulo());
                    System.out.println("-----------------------------------------");
                }
            } else {
                System.out.println("El cliente no tiene préstamos registrados.");
            }
        } else {
            System.out.println("Cliente no encontrado.");
        }

    }

    //Opcion 14
    private void devolverLibro() {
        System.out.println("------ Devolver Libro ------");
        System.out.println("Ingrese el ISBN del libro a devolver: ");
        int isbn = leer.nextInt();

        // Llama al método del servicio para buscar el libro por ISBN
        Libro libro = libroService.buscarPorIsbn(isbn);

        if (libro != null) {
            // Buscar los préstamos activos del libro
            List<Prestamo> prestamosActivos = prestamoService.buscarPrestamosActivosPorLibro(libro);

            if (prestamosActivos.isEmpty()) {
                System.out.println("El libro con ISBN " + isbn + " no tiene préstamos activos.");
            } else {
                // Mostrar los préstamos activos del libro
                System.out.println("Préstamos activos del libro con ISBN " + isbn + ":");
                for (Prestamo prestamo : prestamosActivos) {
                    System.out.println("Fecha de préstamo: " + prestamo.getFechaPrestamo());
                    System.out.println("Fecha de devolución: " + prestamo.getFechaDevolucion());
                    System.out.println("Cliente: " + prestamo.getCliente().getNombre());
                    System.out.println("------------");
                }

                // Pedir al usuario que seleccione el préstamo a devolver
                System.out.println("Seleccione el ID del préstamo a devolver: ");
                int prestamoId = leer.nextInt();
                Prestamo prestamoSeleccionado = prestamoService.buscarPorId(prestamoId);

                if (prestamoSeleccionado != null) {
                    // Pedir al usuario que ingrese la fecha de devolución
                    System.out.println("Ingrese la fecha de devolución (dd/mm/yyyy): ");
                    String fechaDevolucionString = leer.next();

                    SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                    try {
                        Date fechaDevolucion = dateFormat.parse(fechaDevolucionString);

                        // Registrar la devolución del libro
                        prestamoService.devolverLibro(prestamoSeleccionado, fechaDevolucion);

                        System.out.println("Libro devuelto exitosamente.");
                    } catch (ParseException e) {
                        System.out.println("Error: Formato de fecha incorrecto. Por favor, ingrese la fecha en el formato dd/MM/yyyy.");
                    }
                } else {
                    System.out.println("No se encontró un préstamo con el ID proporcionado.");
                }
            }
        } else {
            System.out.println("No se encontró un libro con el ISBN proporcionado.");
        }
    }

    //Opcion 15
    public void registrarPrestamo() {
        System.out.println("------ Registrar Préstamo ------");
        System.out.println("Ingrese el ISBN del libro a prestar: ");
        int isbn = leer.nextInt();

        // Llama al método del servicio para buscar el libro por ISBN
        Libro libro = libroService.buscarPorIsbn(isbn);

        if (libro != null) {
            // Verificar si el libro tiene ejemplares disponibles para prestar
            if (libro.getEjemplaresRestantes() > 0) {
                // Pedir al usuario que seleccione un cliente existente
                System.out.println("Clientes existentes:");
                List<Cliente> clientes = clienteService.listarClientes();
                for (Cliente cliente : clientes) {
                    System.out.println(cliente.getId() + ": " + cliente.getNombre());
                }

                System.out.println("Seleccione el ID del cliente: ");
                int clienteId = leer.nextInt();
                Cliente clienteSeleccionado = clienteService.buscarPorId(clienteId);

                if (clienteSeleccionado != null) {
                    // Pedir al usuario que ingrese las fechas de préstamo y devolución
                    System.out.println("Ingrese fecha de retiro del libro (dd/MM/yyyy): ");
                    String fechaPrestamoString = leer.next();
                    System.out.println("Ingrese fecha de devolucion del libro (dd/MM/yyyy): ");
                    String fechaDevolucionString = leer.next();

                    SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                    try {
                        Date fechaPrestamo = dateFormat.parse(fechaPrestamoString);
                        Date fechaDevolucion = dateFormat.parse(fechaDevolucionString);

                        // Llama al método del servicio para registrar el préstamo
                        Prestamo prestamo = prestamoService.crearPrestamo(fechaPrestamo, fechaDevolucion, clienteSeleccionado, libro);

                        if (prestamo != null) {
                            System.out.println("Préstamo registrado exitosamente.");
                        } else {
                            System.out.println("Error al registrar el préstamo. Por favor, inténtelo nuevamente.");
                        }
                    } catch (ParseException e) {
                        System.out.println("Error: Formato de fecha incorrecto. Por favor, ingrese la fecha en el formato dd/MM/yyyy.");
                    }
                } else {
                    System.out.println("No se encontró un cliente con el ID proporcionado.");
                }
            } else {
                System.out.println("No hay ejemplares disponibles para prestar del libro con ISBN " + isbn + ".");
            }
        } else {
            System.out.println("No se encontró un libro con el ISBN proporcionado.");
        }
    }

}
