import React, { Children } from "react"
//É im
function ComponenteA(props){
    return(
        <h2>Componente A
            <div>{props.children}</div>
        </h2>
    )
}

export default ComponenteA