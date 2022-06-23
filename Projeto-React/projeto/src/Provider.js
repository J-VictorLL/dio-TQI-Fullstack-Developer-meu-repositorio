import React from "react";
import App from "./App";
import GithubProvider from "./providers/GithubProvider";

function Providers(){
  return (
    <main>
      <GithubProvider>
        <App />
      </GithubProvider>
    </main>
  );
};

export default Providers;