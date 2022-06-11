function verificaPalindromo(string){
    if(!string) return "String inexixtente!";
    string = string.replace(/[.,\/#!$%\^&\*;:{}=\-_`~()]/g,"");
    string = string.replace(" ","");
    return string.split("").reverse().join("") === string;
}
console.log(verificaPalindromo("ad, a"));