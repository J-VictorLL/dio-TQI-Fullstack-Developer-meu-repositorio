import React from "react";
import styled from "styled-components";
import {string} from 'prop-types';


const Button_styled = styled.button`
    background: #DC872C;
    color: #fff;
    border:none;
    font-size: 1.5em;
    padding: 10px 20px;
    font-family: 'New Tegomin', serif;
    cursor:pointer;
    box-shadow: #333 3px 3px;

    &:hover{
        background: #A40000;
    }
`

const Button = ({children}) =>{
    return(
        <Button_styled>{children}</Button_styled>
    )
}

Button.propTypes={
    children:string
}

export default Button;