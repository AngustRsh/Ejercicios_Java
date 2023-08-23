var valores = [true, 5, false, "hola", "adios", 2];

// a)
if (valores[3].length > valores[4].length) {
    alert("El elemento 'hola' es mayor que el elemento 'adios'.");
} else if (valores[4].length > valores[3].length) {
    alert("El elemento 'adios' es mayor que el elemento 'hola'.");
} else {
    alert("Ambos elementos tienen la misma longitud.");
}

//b)
let resultadoVeradero = valores[0] || valores[2];
let resultadoFalso = valores[0] && valores[2];

alert(`
    Resultado verdadero: ${resultadoVeradero}
    Resultado falso: ${resultadoFalso}`);

//c)
let num1 = valores[1];
let num2 = valores[5];

let suma = num1 + num2;
let resta = num1 - num2;
let multi = num1 * num2;
let divi = num1 / num2;
let modulo = num1 % num2;

alert(`
  La suma entre ${valores[1]} y ${valores[5]} es: ${suma}
  La resta entre ${valores[1]} y ${valores[5]} es: ${resta}
  El producto entre ${valores[1]} y ${valores[5]} es: ${multi}
  El cociente entre ${valores[1]} y ${valores[5]} es: ${divi}
  El resto entre ${valores[1]} y ${valores[5]} es: ${modulo}
  `);



// A partir del siguiente array: var valores = [true, 5, false, "hola", "adios", 2]:
// a) Determinar cual de los dos elementos de texto es mayor
// b) Utilizando exclusivamente los dos valores booleanos del array, determinar los
// operadores necesarios para obtener un resultado true y otro resultado false
// c) Determinar el resultado de las cinco operaciones matemáticas realizadas con los
// dos elementos numéricos