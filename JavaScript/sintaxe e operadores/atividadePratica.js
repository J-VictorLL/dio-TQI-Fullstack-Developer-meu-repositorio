var a = 18;
var b = 2;

function compareNumeros(num1,num2){
    if(!num1 || !num2){
        return "Defina dois números!"
    }
    var primeiraFrase,segundaFrase;

    //primeira frase
    primeiraFrase = "Os números "+num1+" e "+num2+" ";

    (num1===num2) ? primeiraFrase : primeiraFrase += "não ";

    primeiraFrase+= "são iguais."

    //segunda frase
    const soma = num1+num2;
    
    segundaFrase = "Sua soma é "+soma+", que é ";

    if(soma>10){
        (soma<20) ? segundaFrase += "maior que 10 e menor que 20":segundaFrase += "maior que 10 e maior que 20";
    }else{
        segundaFrase += "menor que 10 e menor que 20";
    }

    return primeiraFrase+" "+segundaFrase;
}

console.log(compareNumeros(a,b));
