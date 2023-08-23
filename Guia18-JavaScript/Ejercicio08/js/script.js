var maximo = -99999999999;
var minimo = 99999999999;
var contador = 0;
var suma = 0;
do {
    var num = parseInt(prompt("Ingrese un numero: (0 pera terminar)"));
    if (num !== 0) {


        if (num > maximo) {
            maximo = num;
        }
        if (num < minimo) {
            minimo = num;
        }
        suma += num;
        contador = contador + 1;
    }
} while (num !== 0);

alert("El maximo numero ingresado es " + maximo);
alert("El minimo numero ingresado es " + minimo);
alert("El promedio de los numeros ingresados es " + suma / contador);




// Escribir un programa que lea números enteros hasta teclear 0 (cero). Al finalizar el
// programa se debe mostrar el máximo número ingresado, el mínimo, y el promedio de
// todos ellos.