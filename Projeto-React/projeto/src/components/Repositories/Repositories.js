import React, { useEffect, useState } from "react";
import useGithub from "../../hooks/GithubHooks";
import ItemRepository from "../Item-Repository";
import * as Style from "./styled";

function Repositories(){
  const { githubState, getUserRepos, getUserStarred } = useGithub();
  const [hasUserForSearchrepos, setHasUserForSearchrepos] = useState(false);

  useEffect(() => {
    if (githubState.user.login) {
      getUserRepos(githubState.user.login);
      getUserStarred(githubState.user.login);
    }
    setHasUserForSearchrepos(githubState.repositories);

    // eslint-disable-next-line react-hooks/exhaustive-deps
    }, [githubState.user.login]);

  return (
    <>
      {hasUserForSearchrepos ? (
        <Style.WrapperTabs
          selectedTabClassName="is-selected"
          selectedTabPanelClassName="is-selected"
        >
          <Style.WrapperTabList>
            <Style.WrapperTab>Repositories</Style.WrapperTab>
            <Style.WrapperTab>Starred</Style.WrapperTab>
          </Style.WrapperTabList>
          <Style.WrapperTabPanel>
            <Style.WrapperList>
              {githubState.repositories.map((item) => (
                <ItemRepository
                  key={item.id}
                  name={item.name}
                  linkToRepo={item.full_name}
                  fullName={item.full_name}
                />
              ))}
            </Style.WrapperList>
          </Style.WrapperTabPanel>
          <Style.WrapperTabPanel>
            <Style.WrapperList>
              {githubState.starred.map((item) => (
                <ItemRepository
                  key={item.id}
                  name={item.name}
                  linkToRepo={item.html_url}
                  fullName={item.full_name}
                />
              ))}
            </Style.WrapperList>
          </Style.WrapperTabPanel>
        </Style.WrapperTabs>
      ) : (
        <></>
      )}
    </>
  );
};

export default Repositories;