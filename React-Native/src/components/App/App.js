import React from "react";
import styled from "styled-components";
import Counter from '../Counter/Counter'

const App = () =>{

    return(
        <Content>
            <h1>TREINO COMPONENTES</h1>
            <Cot>
                <Counter />
            </Cot>
        </Content>
    );
}

const Content = styled.div`
    height: 100vh;
    padding: 0 50px;
    display: flex;
    flex-direction: column;
    justify-content: center;
    align-items: center;
`
const Cot = styled.div`
    display: flex;
    flex-direction: row;
    gap: 50px;
`

export default App;