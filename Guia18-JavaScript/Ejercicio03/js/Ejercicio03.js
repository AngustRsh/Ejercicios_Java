let edad = parseInt(prompt("Ingrese edad: "));

if (isNaN(edad)) {      //isNaN significa "is Not a Number"
    alert("No ingresó un número válido");
} else {
    if (edad >= 18) {
        alert("Es mayor de edad");
    } else {
        alert("Es menor de edad");
    }
}