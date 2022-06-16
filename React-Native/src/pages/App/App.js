import React from "react";
import styled from "styled-components";
import narutoImg from '../../images/test.png';
import Quotes from "../../components/Quotes/Quotes";
//import { getQuote } from "../../services/quoteServices/quoteServices";
import { getQuote } from "../../services";
import { useState, useEffect, useRef } from "react";
import justsoSound from '../../sounds/jutso_sound.mp3'

const audio = new Audio(justsoSound);

const App = () =>{
    let isMounted = useRef(true);

    const [quoteState,setQuoteState] = useState({quote: 'ok', speaker: 'Speaker'})

    const onUpdate =async ()=>{
        const quote = await getQuote();

        if (isMounted.current){    
            audio.play();
            setQuoteState(quote)
        }
    }

    useEffect(()=>{
        //console.log("quoteState foi alterado")//vai acontecer toda ver que quoteState for alterado
        onUpdate();

        return ()=>{
            isMounted.current = false;
        }
    }, [quoteState]);

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