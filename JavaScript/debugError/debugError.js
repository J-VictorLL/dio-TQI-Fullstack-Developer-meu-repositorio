function validaçãoErros(lista, num){
    try{
        if(!lista && !num) throw new ReferenceError("Envie os parametros");
        if(typeof lista !== 'object') throw new TypeError("Lista precisa ser tipo Object");
        if(typeof num !== 'number') throw new TypeError("Numero precisa ser tipo Number");
        if(lista.length !== num) throw new RangeError("Tamanho de lista inválido");

        return lista;
    }catch(e){
        if(e instanceof ReferenceError){
            console.log("O erro foi de ReferenceError");
            console.log(e.message);
            console.log(e.log);
        
        } else if(e instanceof TypeError){
            console.log("O erro foi de TypeError");
            console.log(e.message);
            console.log(e.log);
        } else if(e instanceof RangeError){
            console.log("O erro foi de RangeError");
            console.log(e.message);
            console.log(e.log);
        }else{
            console.log("Tipo de erro não esperado:" + e);
        }
    }
}