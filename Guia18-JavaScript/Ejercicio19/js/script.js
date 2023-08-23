function generarNumero(min, max) {
    let resultado = Math.random() * (max - min) + min;
    return Number(resultado.toFixed(2));    //convertimos a numero con 2 decimales solamente
  }

let arregloA = [];
for (let i = 0 ; i < 50 ; i++){
arregloA.push(generarNumero(0,50));
}

alert(`Arreglo A sin ordenar: ` +arregloA);

arregloA.sort((a,b) => a - b);    // ordena de menor a mayor. Va comparando la resta de a y b para determinar el mas grande.

let arregloB = arregloA.slice(0,10).concat(Array(10).fill(0.5));   // Array(10) creo un array de 10 elementos vacios. Con el .fill llenamos esos espacios

alert(`
El Vector A ordenado: ${arregloA}
El Vector B completo: ${arregloB}`);




// Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo A
// de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El
// programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por pantalla.
// Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros 10 números
// ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos elementos con el valor
// 0.5. Mostrar los dos arreglos resultantes: el ordenado de 50 elementos y el combinado
// de 20.