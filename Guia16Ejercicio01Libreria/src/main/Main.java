/*
Main
Esta clase tiene la responsabilidad de llevar adelante las funcionalidades necesarias para
interactuar con el usuario. En esta clase se muestra el menú de opciones con las operaciones
disponibles que podrá realizar el usuario.
 */
package main;

// import persistencia.DAO;


public class Main {

    public static void main(String[] args) {

        // DAO dao = new DAO();     fue creado para poder crear las tablas en la base de datos
        Menu menu = new Menu();
        menu.mostrarMenu();
     
    }

}
