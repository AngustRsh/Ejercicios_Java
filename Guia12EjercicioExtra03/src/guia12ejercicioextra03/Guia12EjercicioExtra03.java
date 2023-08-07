/*
Una compañía de promociones turísticas desea mantener información sobre la infraestructura
de alojamiento para turistas, de forma tal que los clientes puedan planear sus vacaciones de
acuerdo con sus posibilidades. Los alojamientos se identifican por un nombre, una dirección,
una localidad y un gerente encargado del lugar. La compañía trabaja con dos tipos de
alojamientos: Hoteles y Alojamientos Extrahoteleros.
Los Hoteles tienen como atributos: Cantidad de Habitaciones, Número de Camas, Cantidad de
Pisos, Precio de Habitaciones. Y estos pueden ser de cuatro o cinco estrellas. Las
características de las distintas categorías son las siguientes:
 */
package guia12ejercicioextra03;

import entidades.Alojamientos;
import entidades.Camping;
import entidades.Hotel;
import entidades.Residencias;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Guia12EjercicioExtra03 {

    public static void main(String[] args) {

        List<Alojamientos> alojamientos = new ArrayList<>();

        alojamientos.add(new Hotel(100, 200, 5, "Hotel 1", "Calle Falsa 123", "Springfield", "Homero"));
        alojamientos.add(new Hotel(150, 300, 7, "Hotel 2", "Avellaneda", "Puerto Madero", "Cecilia"));
        alojamientos.add(new Camping(50, 10, true, "Camping El buen Dormir", "Costanera Norte 325", "Colon", "Juan"));
        alojamientos.add(new Camping(25, 5, false, "Camping Del Fondo", "Parque Patricios 123", "Puebla", "Carmen"));
        alojamientos.add(new Residencias(20, true, true, "Residencia 1", "Cantor 432", "Olivos", "Luis"));
        alojamientos.add(new Residencias(12, false, false, "Residencia 2", "Uruguay 1990", "Nunes", "Luis"));

        //Consultar todos los alojamientos
        System.out.println("Todos los alojamientos:");
        for (Alojamientos alojamientoAux : alojamientos) {
            System.out.println(alojamientoAux);
        }

        //Ordenar Hoteles de mas caro a mas barato
        List<Hotel> hoteles = new ArrayList<>();
        for (Alojamientos hotelAux : alojamientos) {
            if (alojamientos instanceof Hotel) {
                hoteles.add((Hotel) alojamientos);
            }
        }

        Collections.sort(hoteles, Comparator.comparingDouble(Hotel::getPrecioHabitaciones).reversed());

        System.out.println("Hoteles de mas caros a mas baratos:");
        for (Hotel hotelAux : hoteles) {
            System.out.println(hotelAux);
        }

        //consultar todos los campings con restaurante
        System.out.println("Campings con restaurantes:");
        for (Alojamientos alojAux : alojamientos) {
            if (alojAux instanceof Camping) {
                Camping camping = (Camping) alojAux;
                if (camping.isTieneRestaurante()) {
                    System.out.println(camping);
                }
            }
        }

        //Consultar todas las residencias que tienen descuento
        for (Alojamientos alojamiento : alojamientos) {
            if (alojamiento instanceof Residencias) {
                Residencias residenciaAux = (Residencias) alojamiento;
                if (residenciaAux.isHaceDescuentos()) {
                    System.out.println(residenciaAux);
                }
            }
        }

    }
}
