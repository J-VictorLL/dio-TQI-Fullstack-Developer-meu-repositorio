import React from "react";//Tem que colocar sempre
import './Counter.css'

function Counter(){//Contador de algo da página
//<> < /> -> fragmente -> simula uma div, sem criar uma

    let quantity = 0;
    return(
        <>
        <button>-</button>
        <h1>{quantity}</h1>
        <button>+</button>
        </>
    )
}

export default Counter;