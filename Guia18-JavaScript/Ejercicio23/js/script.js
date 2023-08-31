document.addEventListener("DOMContentLoaded", function() {
    var parrafo = document.getElementById("par");
    var boton = document.getElementById("btn");
    var contenidoOriginal = parrafo.textContent;
    
    boton.addEventListener("click", function() {
        var palabras = contenidoOriginal.split(" ");
        var palabrasLargas = palabras.filter(function(palabra) {
            return palabra.length > 8;
        });
        var contenidoResaltado = palabras.map(function(palabra) {
            return palabrasLargas.includes(palabra) ? `<span class="highlight">${palabra}</span>` : palabra;
        }).join(" ");
        parrafo.innerHTML = contenidoResaltado;
        boton.disabled = true;
    });
});


// Resalte todas las palabras de más de 8 caracteres en el texto del párrafo (con un fondo
//     amarillo, por ejemplo)