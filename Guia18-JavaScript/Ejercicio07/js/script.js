var numIngresado = parseInt(prompt("Ingrese un valor límite positivo: "));
var suma = 0;
do {
  var num = parseInt(prompt("Ingrese un número: "));
  suma = suma + num;
} while (suma < numIngresado);

alert("La suma de los números es " + suma);


// Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación
// solicite números al usuario hasta que la suma de los números introducidos supere el
// límite inicial.