import React from 'react';
import ReactDOM from 'react-dom';
import GithubProvider from "./providers/GithubProvider";

ReactDOM.render(
  <React.StrictMode>
    <GithubProvider />
  </React.StrictMode>
, document.getElementById('root'));
