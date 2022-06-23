import React from "react";
import useGithub from "../../hooks/github-hooks";
import * as Style from "./styled";

function Profile() {
  const { githubState } = useGithub();

  return (
    <Style.Wrapper>
      <Style.WrapperImage src={githubState.user.avatar} alt="Avatar do usuário" />
      <Style.WrapperInfoUser>
        <div>
          <h1>{githubState.user.name}</h1>
          <Style.WrapperUserGeneric>
            <h3>Username:</h3>
            <a
              href={githubState.user.html_url}
              target="_blank"
              rel="noreferrer"
            >
              {githubState.user.login}
            </a>
          </Style.WrapperUserGeneric>
          <Style.WrapperUserGeneric>
            <h3>Company:</h3>
            <span>{githubState.user.company}</span>
          </Style.WrapperUserGeneric>
          <Style.WrapperUserGeneric>
            <h3>Location:</h3>
            <span>{githubState.user.location}</span>
          </Style.WrapperUserGeneric>
          <Style.WrapperUserGeneric>
            <h3>Blog:</h3>
            <a href={githubState.user.blog} target="_blank" rel="noreferrer">
              {githubState.user.blog}
            </a>
          </Style.WrapperUserGeneric>
        </div>
        <Style.WrapperStatusCount>
          <div>
            <h4>Followers</h4>
            <span> {githubState.user.followers}</span>
          </div>
          <div>
            <h4>Followings</h4>
            <span> {githubState.user.following}</span>
          </div>
          <div>
            <h4>Gists</h4>
            <span> {githubState.user.public_gists}</span>
          </div>
          <div>
            <h4>Repositories</h4>
            <span> {githubState.user.public_repos}</span>
          </div>
        </Style.WrapperStatusCount>
      </Style.WrapperInfoUser>
    </Style.Wrapper>
  );
};

export default Profile;