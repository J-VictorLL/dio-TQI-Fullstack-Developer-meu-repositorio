const alunos =[{
    nome: "A",
    nota: 7,
    turma: "A1"
},{
    nome: "B",
    nota: 6,
    turma: "A1"
},{
    nome: "C",
    nota: 8,
    turma: "A1"
}]

function aprovados(alunos, mediaFinal){
    let aprovados = [];

    for(let i=0; i<alunos.length;i++){

        //object destructing
    const {nota,nome} = alunos[i]

        if(nota>=mediaFinal){
            aprovados.push(nome);
        }
    }

    return aprovados;
}

console.log(aprovados(alunos, 7))