import React from "react";
import styled from "styled-components";
import {string, func} from 'prop-types';//tipagem ->idica o tipo esperado do elemento
import Button from '../Button/Button'; 

const Quotes = ({quote, speaker, onUpdate}) =>{
    return(
        <Wrapper>
            <Quote>
                {quote}
            </Quote>
            <Speaker>
               - {speaker}
            </Speaker>
            <Button onClick={onUpdate}>Quote No Jutsu</Button>
        </Wrapper>
    )
}

Quotes.propType = {
    quote: string,
    speaker: string,
    onUpdate: func
};

const Quote = styled.p`
    font-size: 2em;
    margin: 0;
`
//utilizar componentes criados anteriormente para criar novos
const Speaker = styled(Quote)`
    text-align: right;
    margin-bottom: 50px;
`
const Wrapper = styled.div`
    flex: 1;
    display: flex;
    flex-direction: column;
    align-items: center;
`

export default Quotes;