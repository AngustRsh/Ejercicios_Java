var matrizOriginal = [[3], [6], [9], [12], [15]];

function incremento(matriz){
    const arreglo = [];

    for( let i = 0; i < matriz.length ; i++){
        arreglo.push(matriz[i][0]+3);
    }
    return arreglo;
}

const nuevoArreglo = incremento(matrizOriginal);

alert(`
Matriz Original: ${matrizOriginal}
Matriz Alterada: ${nuevoArreglo}`);

// Realizar un programa que obtenga la siguiente matriz [[3], [6], [9], [12], [15]] y devuelve y
// muestre el siguiente array [6, 9, 12, 15, 18].