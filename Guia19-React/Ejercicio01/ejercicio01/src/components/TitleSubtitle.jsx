/*rfc crea toda la estructura del componente*/

import React from 'react'

const title= "Bienvenidos";
const subtitle= "Primer ejercicio utilizando react";

export default function TitleSubtitle() {
  return (
    <div>
      <h1>{title}</h1>
      <h2>{subtitle}</h2>
    </div>
  )
}
