import React from "react";//Tem que colocar sempre
import styled from "styled-components";
import './Counter.css'

function Counter(){//Contador de algo da página
//<> < /> -> fragmente -> simula uma div, sem criar uma

    let quantity = 0;

    function upQuantity(){
        quantity = quantity +1;
        document.getElementById("counter-box").innerHTML = quantity; //tem que ser chamada aqui, se não retorna vazio
    }

    function downQuantity(){
        if(quantity>0) {
            quantity = quantity - 1;
            document.getElementById("counter-box").innerHTML = quantity;
        }
    }

    return(
        <>
        <Button onClick={downQuantity}>-</Button>
        <h1 id="counter-box">{quantity}</h1>
        <Button onClick={upQuantity}>+</Button>
        </>
    )
}

const Button = styled.button`
    background-color: aqua;
    height: 50px;
    width: 50px;
    font-size: 20px;
`

export default Counter;