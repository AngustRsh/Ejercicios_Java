var frase = prompt("Ingrese una frase: ");
var fraseReves = palabra => palabra.split("").reverse().join("");

var fraseAlReves = fraseReves(frase);

alert("Frase al revés: " + fraseAlReves);

// Escribir una función flecha que reciba una palabra y la devuelva al revés.