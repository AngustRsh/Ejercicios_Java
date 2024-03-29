/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import entidades.Direccion;
import java.util.List;

public class DireccionDAO extends DAO<Direccion> {

    @Override
    public void guardar(Direccion direccion) {
        super.guardar(direccion);
    }

    public void eliminar(String id) throws Exception {
        Direccion direccion = buscarPorId(id);
        super.eliminar(direccion);
    }

    public Direccion buscarPorId(String id) throws Exception {
        conectar();
        Direccion direccion = em.find(Direccion.class, id);
        desconectar();
        return direccion;
    }

    public List<Direccion> listarTodos() throws Exception {
        conectar();
        List<Direccion> direcciones = em.createQuery("SELECT d FROM Direccion d")
                .getResultList();
        desconectar();
        return direcciones;
    }
}