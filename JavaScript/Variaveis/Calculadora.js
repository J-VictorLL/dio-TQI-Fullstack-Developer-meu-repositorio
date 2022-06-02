function calculadora(){
    
    const operacao =  Number(prompt("Escolha uma operação:\n 1 - Soma(+)\n 2 - Subtração(-)\n 3 - Multiplicação(*)\n 4 - Divisão real(/)\n 5 - Divisão inteira(%)\n 6 - Potenciação(**)"));
    //console.log(operação)

    if(!operação || operação>=7){
        alert("digite uma opção valida");
        calculadora();
    }else{
        let n1 = Number(prompt('Insira o primeiro valor: '));
        let n2 =  Number(prompt('Insira o segundo valor: '));
        let resultado;

        if(!n1 || !n2){
            alert("digite uma opção valida");
            calculadora();
            }else{ 
            function soma(){
                resultado = n1+n2;
                alert('$(n1) + $(n2) = $(resultado)');
            }
            function subtração(){
                resultado = n1-n2;
                alert('$(n1) - $(n2) = $(resultado)');
            }
            function multiplicação(){
                resultado = n1*n2;
                alert('$(n1) * $(n2) = $(resultado)');
            }
            function divisaoReal(){
                resultado = n1/n2;
                alert('$(n1) / $(n2) = $(resultado)');
            }
            function divisaoInteira(){
                resultado = n1%n2;
                alert('$(n1) + $(n2) = $(resultado)');
            }
            function potenciacao(){
                resultado = n1**n2;
                alert('$(n1) elevado a $(n2) é igual a $(resultado)');
            }
        
            function novaOperacao(){
                let opcao = prompt('Deseja fazer outra operação:\n 1 - Sim\n 2 - Não ');
                if(opcao==1){
                    calculadora();
                }else if(opcao==2){
                    alert('Até mais!');
                }else{
                    alert("digite uma opção valida");
                    novaOperacao();
                }
            }
        
        
            switch(operação){
                case operacao = 1:
                    soma();
                    break;
                case operacao = 2:
                    subtração();
                    break;
                case operacao = 3:
                    multiplicação();
                    break;
                case operacao = 4:
                    divisaoReal();
                    break;
                case operacao = 5:
                    divisaoInteira();
                    break;
                case operacao = 6:
                    potenciacao();
                    break;
            }
            novaOperacao();
        }
    }
}

calculadora();