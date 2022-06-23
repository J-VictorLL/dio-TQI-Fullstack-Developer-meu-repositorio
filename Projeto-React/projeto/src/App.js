import React from "react";
import Layout from "./components/Layout/Layout";
import NoSearch from "./components/NoSearch/NoSearch";
import Profile from "./components/Profile/Profile";
import Repositories from "./components/Repositories/Repositories";
import useGithub from "./hooks/GithubHooks";

function App(){
  const { githubState } = useGithub();
  return (
    <Layout>
      {githubState.hasUser ? (
        <>
          {githubState.loading ? (
            <p>Carregando</p>
          ) : (
            <>
              <Profile />
              <Repositories />
            </>
          )}
        </>
      ) : (
        <NoSearch />
      )}
    </Layout>
  );
};

export default App;
