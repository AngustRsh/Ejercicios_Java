function getFormValores() {
    const nombre = document.getElementsByName("nombre")[0].value;
    const apellido = document.getElementsByName("apellido")[0].value;

    alert("Nombre: " + nombre + "\nApellido: " + apellido);

    // Evita que el formulario se envíe realmente
    return false;
}

const form = document.getElementById("form1");
form.addEventListener("submit", getFormValores);

