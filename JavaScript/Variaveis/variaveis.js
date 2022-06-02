//tipos primitivos

//boolean -> verdadeiro ou falso
var vOuF = false;
console.log(typeof(vOuF))

//number -> números
var num = 1;
console.log(typeof(num))

//string -> texto
var str = "texto";
console.log(typeof(str))

//function -> função
var f = function() {};
console.log(typeof(str))

//var -> declaração de variaveis locais ou globais

//let -> variaveis de escopo local

//const -> constante, só leitura e com valor inicial

//arrays
var array = ['texto', 1, true, ['array1',1], ['array2',2]]
//interação
array.forEach(function(item, indice){console.log(intem, indice)})
//adicionar
array.push("novo")//final
array.unshift("novo")//inicio
//remoção
array.pop()//final
array.shift()//inicio
//index de um valor
console.log(array.indexOf(true))
//remoção ou subtituição por index
array.slice(0,3);//remoção
//atribuição de slice
var novoArray = array.slice(0,3)

//Objeto
let objeto = {string: 'string', numero: 2, boolean: false, array: [1,2], objetoInterno: {objeto: 'objeto interno'}}
//acesso
console.log(objeto.objetoInterno.objeto)
//desestruturação
var {string, boolean, objetoInterno} = objeto//Cada variavel vai obter o valor do campo com mesmo nome

//Estruturas
//-----> condicionais
if (condição){//só demonstração
    //comandos de TRUE
    if (condição3){
        //Ninho de if
    }
}else if(condição2){//só demonstração
    //comandos de TRUE
}else{
    //comando de FALSE
}
//if ternario
condição ? comandosTrue:comandosFalse;
//switch case
switch(varivelCondição){
    case caso1:
        //comandos
        break;
    case caso_n:
        //comandos
        break;
    default:
        //comandos
        break;
}


//------->Repetição
//for
for (let indice=0; indice<valorLimiteCondição; indice++){
    //comandos
}
//for/in -> indices/propiedades
for (i in array){
    //comandos sobre os indices/propiedades
}
//for/of -> valores
for (i of array){
    //comandos sobre os valores do array
}

//while
while(condição){
    //comandos
}
//do while
do{
    //comandos
}while(condição);