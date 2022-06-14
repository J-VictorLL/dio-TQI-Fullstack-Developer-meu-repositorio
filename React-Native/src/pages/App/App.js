import React from "react";
import styled from "styled-components";
import narutoImg from '../../images/test.png';
import Quotes from "../../components/Quotes/Quotes";

const App = () =>{
    return(
        <Content>
            <Quotes quote={"teste"} />
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