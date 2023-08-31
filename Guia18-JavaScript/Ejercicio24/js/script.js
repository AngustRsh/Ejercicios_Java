const form = document.getElementById("formulario");
const resultElement = document.getElementById("resultado");

form.addEventListener("submit", function (event) {
    event.preventDefault();
    const diameter = parseFloat(document.getElementById("diametro").value);
    const radius = diameter / 2;
    resultElement.textContent = `El radio del círculo es: ${radius}`;
});


// Escribir un programa de JavaScript que a través de un formulario calcule el radio de un
// circulo y lo muestre en el HTML.