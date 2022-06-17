import React,{useState} from "react";
import styled from "styled-components";
import style from './IFoodCounter.css' 
console.log(style)

function iFoodCounter(){
    const [value,setValue] = useState(1);
    const [buttonStyle,setButtonStyle] = useState("counter-button-minus-active")

    function down(){
        if(value<=1) setButtonStyle("counter-button-minus-desactive")
        if(value>0) setValue(value-1)
    }

    function up(){
        if(value>=0) setButtonStyle("counter-button-minus-active")
        setValue(value+1)
    }

    return(
        <Content >
            <button className={buttonStyle} onClick={down}>-</button>
            <h1 id="counter-box">{value}</h1>
            <button className="counter-button-plus-active" onClick={up}>+</button>
        </Content>
    )
}

const Content = styled.div`
    display: flex;
    flex-direction: row;
    border: 3px solid rgb(192, 192, 192);
    border-radius: 4px;
    align-items: center;
    justify-content: space-between;
    height: 30px;
    width: 6%;
    
    .counter-button-plus-active{
        border: none;
        background-color: transparent;
        height: 100%;
        font-size: large;
        color: red;
        cursor: pointer;
    }
        
    .counter-button-minus-active{
        border: none;
        background-color: transparent;
        height: 100%;
        font-size: large;
        color: red;
        cursor: pointer;
    }

    .counter-button-minus-desactive{
        border: none;
        background-color: transparent;
        height: 100%;
        font-size: large;
        color: rgb(105, 105, 105);
        cursor: pointer;
    }
`



export default iFoodCounter;