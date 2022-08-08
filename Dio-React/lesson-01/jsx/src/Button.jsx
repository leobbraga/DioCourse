import React from 'react'


function Button() {
const {name, onClick} = props

    return(
   <button onClick={onClick}>{name}</button>
    )
}

export default Button