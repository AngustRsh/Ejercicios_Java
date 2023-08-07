/*
Finalmente, en el main debemos realizar lo siguiente:
Vamos a crear una Lavadora y un Televisor y llamar a los métodos necesarios para mostrar
el precio final de los dos electrodomésticos.

Siguiendo el ejercicio anterior, en el main vamos a crear un ArrayList de Electrodomésticos
para guardar 4 electrodomésticos, ya sean lavadoras o televisores, con valores ya asignados.
Luego, recorrer este array y ejecutar el método precioFinal() en cada electrodoméstico. Se
deberá también mostrar el precio de cada tipo de objeto, es decir, el precio de todos los
televisores y el de las lavadoras. Una vez hecho eso, también deberemos mostrar, la suma del
precio de todos los Electrodomésticos. Por ejemplo, si tenemos una lavadora con un precio de
2000 y un televisor de 5000, el resultado final será de 7000 (2000+5000) para
electrodomésticos, 2000 para lavadora y 5000 para televisor.
 */
package guia12ejercicio02;

import entidades.Electrodomestico;
import entidades.Lavadora;
import entidades.Televisor;
import java.util.ArrayList;

public class Guia12Ejercicio02 {

    public static void main(String[] args) {

        ArrayList<Electrodomestico> electro = new ArrayList();
        electro.add(new Lavadora(20, 250, "rojo", 'B', 56));
        electro.add(new Televisor(32, true, 2500, "blanco", 'F', 26));
        electro.add(new Televisor(50, false, 5600, "negro", 'A', 40));
        electro.add(new Lavadora(65, 3500, "violeta", 'C', 125));

        double precioTotalElectrodomesticos = 0;
        double precioTotalLavadoras = 0;
        double precioTotalTelevisores = 0;

        for (Electrodomestico electroaux : electro) {
            double precioFinal = electroaux.precioFinal();
            precioTotalElectrodomesticos += precioFinal;

            if (electroaux instanceof Lavadora) {
                precioTotalLavadoras += precioFinal;

            } else if (electroaux instanceof Televisor) {
                precioTotalTelevisores += precioFinal;
            }
        }

        System.out.println("Precio total de Electrodomesticos: " + precioTotalElectrodomesticos);
        System.out.println("Precio total de Lavadoras: " + precioTotalLavadoras);
        System.out.println("Precio total de Televisores: " + precioTotalTelevisores);

    }

}
