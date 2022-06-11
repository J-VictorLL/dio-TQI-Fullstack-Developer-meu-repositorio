function calcularIdade(anos){
    //return 'Daqui a $(anos) anos, ${this.nome} terá ${this.idade + anos} anos de idade.'; -> not working
    return 'Daqui a '+anos+' anos, '+this.nome+' terá '+(this.idade + anos)+' anos de idade.';
}

const pessoa1={
    nome: "A",
    idade: 30
}

const pessoa2={
    nome: "B",
    idade: 26
}

const animal={
    nome: "C",
    idade: 5,
    raça: "Pug"
}

console.log(calcularIdade.call(pessoa1, 40))