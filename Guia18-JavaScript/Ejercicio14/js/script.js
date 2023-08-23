let libro = {
    ISBN: "",
    Titulo: "",
    Autor: "",
    NumPaginas: 0,

    cargaLibro: function () {
        this.ISBN = prompt("Ingrese ISBN del libro: ");
        this.Titulo = prompt("Ingrese titulo del libro: ");
        this.Autor = prompt("Ingrese autor del libro: ");
        this.NumPaginas = parseInt(prompt("Ingrese el numero de paginas del libro: "));
    },

    mostrarLibro: function () {
        let mensaje = `El libro ingresado es: 
        ISBN: ${this.ISBN}
        Título: ${this.Titulo}
        Autor: ${this.Autor}
        Número de páginas: ${this.NumPaginas}`;
        alert(mensaje);
    }
};


libro.cargaLibro();
libro.mostrarLibro();

// Crear un objeto libro que contenga las siguientes propiedades: ISBN, Título, Autor,
// Número de páginas. Crear un método para cargar un libro pidiendo los datos al usuario
// y luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
// numero de páginas.