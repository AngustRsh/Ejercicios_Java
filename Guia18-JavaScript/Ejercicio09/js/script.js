var frase = prompt("Ingresar una frase: ");
var fraseEspaciada = "";

for (let i = 0; i < frase.length; i++) {
    fraseEspaciada += frase.substring(i, i + 1) + " ";
}

alert(fraseEspaciada);



// Realizar un programa que pida una frase y el programa deberá mostrar la frase con un
// espacio entre cada letra. La frase se mostrara así: H o l a. Nota: recordar el
// funcionamiento de la función Substring().