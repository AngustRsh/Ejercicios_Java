/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import entidades.Cliente;
import java.util.List;

public class ClienteDAO extends DAO<Cliente> {

    @Override
    public void guardar(Cliente cliente) {
        try {
            super.guardar(cliente);
        } catch (Exception e) {
            System.out.println("Error al guardar el cliente: " + e.getMessage());
        }
    }

    public Cliente buscarPorDocumento(Long documento) {
        conectarBase();
        try {
            Cliente cliente = em.find(Cliente.class, documento);
            return cliente;
        } catch (Exception e) {
            System.out.println("Error al buscar cliente por documento: " + e.getMessage());
            return null;
        } finally {
            desconectarBase();
        }
    }

    public List<Cliente> listarTodos() {
        conectarBase();
        try {
            List<Cliente> clientes = em.createQuery("SELECT c FROM Cliente c", Cliente.class)
                    .getResultList();
            return clientes;
        } catch (Exception e) {
            System.out.println("Error al listar todos los clientes: " + e.getMessage());
            return null;
        } finally {
            desconectarBase();
        }
    }

    public Cliente buscarPorId(Integer id) {
        conectarBase();
        try {
            Cliente cliente = em.find(Cliente.class, id);
            return cliente;
        } catch (Exception e) {
            System.out.println("Error al buscar cliente por ID: " + e.getMessage());
            return null;
        } finally {
            desconectarBase();
        }
    }

}
