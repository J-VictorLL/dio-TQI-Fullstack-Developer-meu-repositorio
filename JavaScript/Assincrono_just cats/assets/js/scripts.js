const BASE_URL = "https://thatcopy.pw/catapi/rest/";
const botaoCat = document.getElementById("change-cat")
const imagemCat = document.getElementById("cat")

const getCats = async () => {
    //try{
        const data = await fetch(BASE_URL).then(res=> res.json())
        .catch(e=>console.log(e));
        
        //const json = await data.json();

        return json.webpurl;
    //}catch(e){
      //  console.log(e.message);
    //}
}

const loadImg = async () => {
    imagemCat.src = await getCats();
}

botaoCat.addEventListener('click',loadImg);

loadImg();