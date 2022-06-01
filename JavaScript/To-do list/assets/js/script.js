const formulario = document.getElementById("entrada");
var lista = document.getElementById("list");

formulario.onsubmit = function adicionar(e){
    e.preventDefault();
    var texto = document.getElementById("texto").value;
    if(texto!=""){
        colocarTask(texto);
    }
    formulario.reset();
};

function colocarTask(entrada){
    const containerTask = document.createElement('li');

    const inputTask = document.createElement('input');
    inputTask.setAttribute('type','checkbox')
    inputTask.setAttribute('class','chek')
    inputTask.setAttribute('id',entrada)

    const textTask = document.createTextNode(entrada);

    const labelTask = document.createElement('label');
    labelTask.setAttribute('for', entrada)
    labelTask.appendChild(textTask)

    containerTask.appendChild(inputTask)
    containerTask.appendChild(labelTask)

    lista.appendChild(containerTask)
}
