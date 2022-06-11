class contaBancaria {
    constructor(agencia,numero,tipo,saldo){
        this._agencia = agencia;
        this._numero = numero;
        this._tipo = tipo;
        this._saldo = saldo;
    }
    //get e set
    //agencia
    set agencia(agencia){
        this._saldo = agencia;
    }
    get agencia(){
        return this._agencia;
    }
    //numero
    set numero(numero){
        this._numero = numero;
    }
    get numero(){
        return this._numero;
    }
    //tipo
    set tipo(tipo){
        this._tipo = stipo;
    }
    get tipo(){
        return this._tipo;
    }
    //saldo
    set saldo(saldo){
        this._saldo = saldo;
    }
    get saldo(){
        return this._saldo;
    }

    //metodos
    sacar(valor){
        if(valor > this._saldo){
            return "Operação negada";
        }
        this._saldo = this._saldo - valor;
        return this._saldo;
    }

    depositar(valor){
        this._saldo = this._saldo + valor;
        return this._saldo;
    }
}

class contaCorrente extends contaBancaria {
    constructor(agencia,numero,saldo,cartaoCredito){
        super(agencia,numero,saldo);
        this._tipo = "Corrente";
        this._cartaoCredito = cartaoCredito;
    }
    //get e set
    //cartaoCredito
    set cartaoCredito(cartaoCredito){
        this._cartaoCredito = cartaoCredito;
    }
    get cartaoCredito(){
        return this._cartaoCredito;
    }
}

class contaPoupança extends contaBancaria {
    constructor(agencia,numero,saldo){
        super(agencia,numero,saldo);
        this._tipo = "Poupança";
    }
}

class contaUniversitaria extends contaBancaria {
    constructor(agencia,numero,saldo){
        super(agencia,numero,saldo);
        this._tipo = "Universitaria";
    }
    //metodos
    sacar(valor){
        if(valor > 500){
            return "Operação negada";
        }
        this._saldo = this._saldo - valor;
        return this._saldo;
    }
}