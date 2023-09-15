import React, { useState } from 'react'

export default function State() {
    const [contador, setContador] = useState(0)
    function sumarContador() {

        setContador(contador + 1)
    }

    return (
        <div>
            <p>Contador numerico {contador}</p>
            <button onClick={sumarContador}>Sumar Contador</button>
        </div>
    )
}
