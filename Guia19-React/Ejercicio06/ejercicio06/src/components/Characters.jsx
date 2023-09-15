import React, { useEffect, useState } from 'react'
import { obtenerApi } from '../services/apiService'

export default function Characters() {

  /*seteamos un arreglo vacio para que se almacenen los datos ahi. Almacena y actualia los datos con el setCharacters*/
  const [characters, setCharacters] = useState([])

  useEffect(() => {
    obtenerApi().then(data => {                          /*llama a la funcion del javaScript 'obtenerApi'. then(data) maneja la promesa que devuelve obtenerApi*/
      const charactersData = data.results.slice(0, 20);  /*data.results toma las propiedades de la Api. slice(0,20) devuelve los 20 primeros  */
      setCharacters(charactersData)                      /* actualiza el estado de characters en el componente React con los 20 personajes*/
    });
  }, [])                                                  /* solo renderiza la primera vez*/

  return (
    <div>
      <h1>Lista de los primeros 20 personajes de Rick and Morty</h1>
      <ul>
        {
          characters.map(character =>
          (                                               /*.name .species . gender son las propiedades que queremos llamar del Api*/
            <li key={character.id} className='character-list'>
              <strong>Nombre: {character.name}</strong><br />
              <strong>Especie: {character.species}</strong><br />
              <strong>Genero: {character.gender}</strong><br />
              <br />
            </li>

          )
          )
        }

      </ul>

    </div>
  )
}
