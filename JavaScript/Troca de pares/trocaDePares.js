function subtituiPares(lista){
    if(!lista) return -1;
    if(!lista.length) return -1;

    for(let i = 0; i<lista.length; i++){
        if(typeof(lista[i])=="number"){
            if(lista[i]===0){ 
                console.log("Você já é zero!")
            }else if(lista[i]%2===0){
                console.log('Substituindo ${lista[i]} por 0...');
                lista[i]=0;
            }
        }else{
            return -1;
        }
    }
    return lista;
}

console.log(subtituiPares([0,1,2,3,4,5,6,7,8,9,10]));
console.log(subtituiPares(false));
console.log(subtituiPares("[0,1,2,3,4,5,6,7,8,9,10]"));