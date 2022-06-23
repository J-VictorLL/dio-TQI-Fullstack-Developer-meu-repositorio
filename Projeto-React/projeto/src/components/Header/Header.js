import React, { useState } from "react";
import * as Style from "./styled";
import useGithub from "../../hooks/GithubHooks";

function Header(){
  const { getUser } = useGithub();
  const [usernameForSearch, setUsernameForSearch] = useState();

  const submitGetUser = () => {
    if (!usernameForSearch) return;
    return getUser(usernameForSearch);
  };

  return (
    <header>
      <Style.Wrapper>
        <input
          type="text"
          placeholder="Digite o username da conta Github para a pesquisa..."
          onChange={(event) => setUsernameForSearch(event.target.value)}
        />
        <button type="submit" onClick={submitGetUser}>
          <span>Buscar</span>
        </button>
      </Style.Wrapper>
    </header>
  );
};

export default Header;
