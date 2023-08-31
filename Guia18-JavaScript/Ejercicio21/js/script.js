const persona = {};

persona.nombre = prompt('Ingrese un nombre: ');
persona.edad = parseInt(prompt('Ingrese la edad: '));
persona.sexo = prompt('Ingrese el sexo (H para hombre, M para mujer, O para otro): ');
persona.peso = parseFloat(prompt('Ingrese el peso: '));
persona.altura = parseFloat(prompt('Ingrese la altura: '));

const atributosPersona = Object.keys(persona);
const valorPersona = Object.values(persona);

alert('Atributos de la persona: ' + atributosPersona.join(', ')); // Muestra atributos
alert('Valores ingresados: ' + valorPersona.join(', ')); // Muestra valores de los atributos


// Escribir un programa para obtener un array de las propiedades de un objeto Persona.
// Las propiedades son nombre, edad, sexo ('H' hombre, 'M' mujer, 'O' otro), peso y altura.