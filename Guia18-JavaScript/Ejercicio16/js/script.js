function generarNumeros(min,max) {
return Math.floor(Math.random()*(max-min))+min;
}
// Math.floor redondea al entero menor.

let vector1 = [];
let vector2 = [];

for(let i = 0 ; i < 5 ; i++ ){
    vector1.push(generarNumeros(1,50));
    vector2.push(generarNumeros(1,50));
}

alert(`Vector 1 : ${vector1} 
Vector 2: ${vector2}`);


// Realizar un programa que rellene dos vectores al mismo tiempo, con 5 valores aleatorios
// y los muestre por pantalla.