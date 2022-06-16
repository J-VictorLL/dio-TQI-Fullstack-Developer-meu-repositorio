import {createGlobalStyle} from 'styled-components'
import bgImg from '../../images/bg.jpg'

export const GlobalStyle = createGlobalStyle`
@import url('https://fonts.googleapis.com/css2?family=New+Tegomin&display=swap');

    body{
        color: #332c36;
        background: url(${bgImg}) center no-repeat;
        background-size: cover;
        padding:0;
        margin:0;
        font-family:'New Tegomin', serif;
    }
`;