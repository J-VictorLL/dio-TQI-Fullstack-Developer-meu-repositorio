const title = document.getElementById("page-title")
const botao = document.getElementById("mode-selector")
const foot = document.getElementsByTagName("footer")[0]
const body = document.getElementsByTagName("body")[0]
const darkModeClass = "dark-mode";
const darkMode = "Dark Mode"
const lightMode = "Light Mode"


botao.addEventListener("click",mudarTema);

function mudarClasse(){
    title.classList.toggle(darkModeClass);
    body.classList.toggle(darkModeClass);
    botao.classList.toggle(darkModeClass);
    foot.classList.toggle(darkModeClass);
}

function mudarTexto(){
    if (botao.classList.contains(darkModeClass)){
        title.innerHTML= darkMode+" ON"
        botao.innerHTML = lightMode
        return;
    }
    
    title.innerHTML = lightMode+" ON"
    botao.innerHTML = darkMode 
}

function mudarTema(){
    mudarClasse();
    mudarTexto();
}