/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Cliente;
import java.util.List;
import persistencia.ClienteDAO;

public class ClienteServicio {

    private LibroServicio libroServicio;
    private final ClienteDAO DAO;

    public ClienteServicio() {
        this.DAO = new ClienteDAO();
    }

    public void setServicio(LibroServicio libroServicio) {
        this.libroServicio = libroServicio;
    }

    public Cliente crearCliente(Long documento, String nombre, String apellido, String telefono) {
        Cliente clienteExistente = buscarPorDocumento(documento);
        if (clienteExistente != null) {
            return clienteExistente;
        } else {
            Cliente cliente = new Cliente();
            cliente.setDocumento(documento);
            cliente.setNombre(nombre);
            cliente.setApellido(apellido);
            cliente.setTelefono(telefono);
            try {
                DAO.guardar(cliente);
                return cliente;
            } catch (Exception e) {
                System.out.println("Error al guardar el cliente: " + e.getMessage());
                return null;
            }
        }
    }

    private Cliente buscarPorDocumento(Long documento) {
        try {
            return DAO.buscarPorDocumento(documento);
        } catch (Exception e) {
            System.out.println("Error al buscar cliente por documento: " + e.getMessage());
            return null;
        }

    }

    public List<Cliente> listarClientes() {
        try {
            return DAO.listarTodos();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public Cliente buscarPorId(Integer id) {
        try {
            return DAO.buscarPorId(id);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

}
