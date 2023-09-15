// export function obtenerApi(){
// fetch('https://rickandmortyapi.com/api/character')
// .then(response => response.json())
// .then(data => console.log(data));
// }

/*Se utiliza esta forma*/

export async function obtenerApi(){
    const response = await fetch('https://rickandmortyapi.com/api/character')
    const data = await response.json()
    return data
}