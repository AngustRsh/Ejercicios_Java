var radio = parseFloat(prompt("Ingrese el radio de la circunferencia: "));

let area = Math.PI * Math.pow(radio,2);

let perimetro = 2 * Math.PI * radio;

let mensaje = `El area del circulo de radio ${radio} es de ${area.toFixed(2)}
y su perimetro es de ${perimetro.toFixed(2)}`;
alert(mensaje);

// .toFixed(2) redonde a 2 decimales

// Escribe un programa JavaScript para calcular el área y el perímetro de un objeto Círculo
// con la propiedad radio. Nota: Cree dos métodos para calcular el área y el perímetro. El
// radio del círculo lo proporcionará el usuario.