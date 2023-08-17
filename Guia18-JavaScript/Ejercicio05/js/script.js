var num1 = parseInt(prompt("Ingrese el primer número: "));
var num2 = parseInt(prompt("Ingrese el segundo número: "));

function realizarOperacion(opcMenu, num1, num2) {
    switch (opcMenu) { // Cambiado 'opcion' a 'opcMenu'
        case 'S':
        case 's':
            return num1 + num2;
        case 'R':
        case 'r':
            return num1 - num2;
        case 'M':
        case 'm':
            return num1 * num2;
        case 'D':
        case 'd':
            if (num2 !== 0) {
                return num1 / num2;
            } else {
                return "No es posible realizar la operación debido al divisor = 0.";
            }
        default:
            return "Operación inválida";
    }
}

function mostrarMenu() {
    let opcMenu = prompt(`Seleccione una opción a realizar:
    S o s - Sumar números 
    R o r - Restar números
    M o m - Multiplicar números 
    D o d - Dividir números`);
    
    return opcMenu;
}

var opcMenu = mostrarMenu();

var resultado = realizarOperacion(opcMenu, num1, num2);
alert(`El resultado es: ${resultado}`);

// Construir un programa que simule un menú de opciones para realizar las cuatro
// operaciones aritméticas básicas (suma, resta, multiplicación y división) con dos valores
// numéricos enteros. El usuario, además, debe especificar la operación con el primer
// carácter de la operación que desea realizar: ‘S' o ‘s’ para la suma, ‘R’ o ‘r’ para la resta, ‘M’
// o ‘m’ para la multiplicación y ‘D’ o ‘d’ para la división.