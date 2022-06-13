import React, {Component} from "react"
import ReactDOM from "react-dom"
import "./styles.css"
import Button from "./Button.jsx"
import Button from "./ComponenteA.jsx"
import Button from "./ComponenteB.jsx"
import ComponenteA from "./ComponenteA.jsx"
import ComponenteB from "./ComponenteB.jsx"

function soma(a,b){
    return a+b
}

function testeJSX(){
    return(
        <div className="teste">
            Teste de atuação JSX
            <h1>Soma: {soma(10,4)}</h1>
            <ComponenteA>
                <ComponenteB>
                    <Button onClick={() => soma(10,20)} name="Botão teste2" />
                </ComponenteB>
            </ComponenteA>
        </div>
    )
}

const element = ''//elemento -> menor parte da contrução
const element1 = 'Pode ser string'
const element2 = <h1>Pode ser HTML</h1>

//chamar elemento js dentro de chaves
function App(){

    return(
        <div className="App">
            {testeJSX()}
            <Button onClick={() => soma(10,20)} name="Botão teste" />
        </div>
    )
}

class App_class extends Component{
    constructor(props){
        super(props)

        this.state = {
            clock: 1000,
            como: 'água'
        }
    }

    componentDidMount(){//Vai agir quando o componente tiver sido renderizado
        window.setTimeout(()=>{
            this.setState({
                copo: "Água" 
            })
        },3000)
    }

    alterarCopo(){
        this.setState({
            copo: "Nono refrigerante" 
        })

        //this.state.copo = 'outro valor' -> não recomendado fazer assim
    } 

    render(){
        const {clock, copo} = this.state
        return(
            <div>
                <h1>{clock}</h1>
                <button onClick={() => this.alterarCopo()}>{copo}</button>
            </div>
        )
    }
}

const rootEelement = document.getElementById("root")
ReactDOM.render(<App />,rootEelement)