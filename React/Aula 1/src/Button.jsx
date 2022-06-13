import React from "react"
//É im
function Button(props){

    const {name, onClick} = props//destruturração

    return(
        <button onClick={onClick}>{name}</button>
    )
}

export default Button