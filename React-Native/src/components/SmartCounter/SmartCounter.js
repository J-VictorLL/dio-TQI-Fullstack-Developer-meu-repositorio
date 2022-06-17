import React from "react";
import styled from "styled-components";
import './SmartCounter.css'
import {useState} from 'react';

function SmartCounter(){
    //retorna um vetor
    //1. variavel statefull
    //2. função amarrada a essa variavel, a qual é atualizada
    const [quantity,changeQuantity] = useState(1);

    return(
        <>
        <Button onClick={()=>{if(quantity>0) changeQuantity(quantity-1)}}>-</Button>
        <h1 id="counter-box">{quantity}</h1>
        <Button onClick={()=>changeQuantity(quantity+1)}>+</Button>
        </>
    )
}

const Button = styled.button`
    background-color: aqua;
    height: 50px;
    width: 50px;
    font-size: 20px;
`

export default SmartCounter;