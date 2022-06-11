const cards = document.querySelectorAll(".card");
const completude = document.getElementById("completude");
//console.log(completude)
//console.log(cards)
let hasFlipedCard = false;
let primeiraCard, segundaCard;
let lockBoard = false;
let count = 0;

cards.forEach((card)=>{
    card.addEventListener('click', flipCard);
})

(function shuffle(){
    cards.forEach((card)=>{
        let randomPosition = Math.floor(Math.random()*12);
        card.style.order = randomPosition;
    });
}());
function disableCards(){
    primeiraCard.removeEventListener('click', flipCard);
    segundaCard.removeEventListener('click', flipCard);

    resetBoard();
}

function compareCards(){
    if(primeiraCard.dataset.card === segundaCard.dataset.card){
        disableCards();
        count = count+1;
        completude.innerHTML = ((count/6)*100).toFixed(0)+"%"
        return;
    }
    unflipCards();
}

function unflipCards(){
    lockBoard = true;
    setTimeout(()=>{
        primeiraCard.classList.remove('flip');
        segundaCard.classList.remove('flip');
        resetBoard();
    }, 1500)
}

function flipCard(){
    if(lockBoard) return;
    if(this === primeiraCard) return;
    //this.classList.toggle('flip');
    this.classList.add('flip');
    if(!hasFlipedCard){
        hasFlipedCard = true;
        primeiraCard = this;
        return
    }

    hasFlipedCard = false
    segundaCard = this;

    compareCards();
}

function resetBoard(){
    [hasFlipedCard, lockBoard] = [false, false];
    [primeiraCard, segundaCard] = [null, null];
}