import React from "react";
import styled from "styled-components";
import narutoImg from '../../images/test.png';
import Quotes from "../../components/Quotes/Quotes";
//import { getQuote } from "../../services/quoteServices/quoteServices";
import { getQuote } from "../../services";
import { useState } from "react";

const App = () =>{
    const [quoteState,setQuoteState] = useState({quote: 'ok', speaker: 'Speaker'})

    const onUpdate =async ()=>{
        const quote = await getQuote();

        setQuoteState(quote)
    }

    return(
        <Content>
            <Quotes 
            {...quoteState}//mapeamento do que está em quoteState para as propiedades do elemento
            //quote={quoteState.quote} speaker={quoteState.speaker} 
            onUpdate={onUpdate()}/>
            <NarutoImg src={narutoImg} alt="imagem com naruto"/>
        </Content>
    );
}

const Content = styled.div`
    height: 100vh;
    padding: 0 50px;
    display: flex;
    justify-content: center;
    align-items: center;
`

const NarutoImg = styled.img`
    max-width: 50vw;
    aling-self: flex-end;
`

export default App;