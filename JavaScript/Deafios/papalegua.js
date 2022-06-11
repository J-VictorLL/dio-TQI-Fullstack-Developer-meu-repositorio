let input = gets()

let qtdEntradas = parseInt(input)
let melhor = 999

for(let i = 0; i < qtdEntradas; i++){
    
    input = gets()
    let tempo = parseFloat(input)
    if (tempo<melhor) melhor = tempo;
        	
}
print(melhor)
/*
let input = 3

let qtdEntradas = parseInt(input)
let melhor = 999
let t = [9.71,9.60,9.80]
for(let i = 0; i < qtdEntradas; i++){
    
    input = t[i]
    let tempo = parseFloat(input)
    if (tempo<melhor) melhor = tempo;
        	
}
console.log(melhor);
*/