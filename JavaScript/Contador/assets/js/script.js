//teste contador
//var heading1 = document.getElementsByTagName('h1')[0]
//mudar cor d primeiro h1
//heading1.style.color = 'red'

var limite = 10;
var valorWrapper = document.getElementById("valorAtual");
var valor = 0;
//não permitindo números negativos
function subtrair(){
    if(valor>0){
        valor=valor-1;
        valorWrapper.innerHTML=valor;
    }
}

//mudando cor dos negativos
function subtrair2(){
    if(valor>(-limite)){
        valor=valor-1;
        if(valor<0){
            valorWrapper.style.color = 'red'
        }
        valorWrapper.innerHTML=valor;
    }
}

function adicionar(){
    if(valor<limite){
        valor=valor+1;
        if(valor>=0){
            valorWrapper.style.color = 'black'
        }
        valorWrapper.innerHTML=valor;
    }
}

//teste addEventeListener
var adi = document.getElementsByName("adicionar")[0];
var sub = document.getElementsByName("subtrair")[0];

adi.addEventListener("click", adicionar)
sub.addEventListener("click", subtrair2)