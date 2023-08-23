var palabra = prompt("Ingrese una frase: ");

function palabraMasLarga(frase) {
    var palabras = frase.split(" ");
    var palabraLarga = palabras[0];

    for (var i = 1; i < palabras.length; i++) {
        if (palabras[i].length > palabraLarga.length) {
            palabraLarga = palabras[i];
        }
    }

    return palabraLarga;
}

var resultado = palabraMasLarga(palabra);
alert("La palabra más larga es: " + resultado);

// Escribir una función que reciba un String y devuelva la palabra más larga.
// String Ejemplo: “Guia de JavaScript”
// Resultado esperado : “JavaScript”