/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Direccion;
import entidades.Mascota;
import entidades.Persona;
import enums.Rol;
import persistencia.PersonaDAO;
import java.util.Date;
import java.util.List;

public class PersonaServicio {

    private DireccionServicio direccionServicio;
    private MascotaServicio mascotaServicio;
    private final PersonaDAO DAO;

    public PersonaServicio() {
        this.DAO = new PersonaDAO();
    }

    public void setServicios(DireccionServicio direccionServicio, MascotaServicio mascotaServicio) {
        this.direccionServicio = direccionServicio;
        this.mascotaServicio = mascotaServicio;
    }

    // este método persiste un registro de tipo Persona en la base de datos
    // a través del método guardar() de la clase DAO.
    public Persona crearPersona(String nombre, String apellido, String dni, Date nacimiento, Rol rol, Direccion direccion, List<Mascota> mascotas) {

        Persona persona = new Persona();
        try {
            persona.setApellido(apellido);
            persona.setNombre(nombre);
            persona.setDni(dni);
            persona.setNacimiento(nacimiento);
            persona.setRol(rol);
            persona.setMascotas(mascotas);
            persona.setDireccion(direccion);

            DAO.guardar(persona);
            return persona;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public Persona buscarPorDni(String dni) {
        try {
            return DAO.buscarPorDNI(dni);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public boolean eliminarPorDni(String dni) {
        try {
            DAO.eliminar(dni);
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public List<Persona> listarPersonas() {
        try {
            return DAO.listarTodos();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public List<Persona> buscarPorPaisYProvincia(String pais, String provincia) {
        try {
            return DAO.buscarPorPaisYProvincia(pais, provincia);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

}