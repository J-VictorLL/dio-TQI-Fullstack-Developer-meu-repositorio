import React from "react";
import * as Style from "./styled";

function RepositoryItem({ name, linkToRepo, fullName }){
  return (
    <Style.Wrapper>
      <Style.WrapperTitle>{name}</Style.WrapperTitle>
      <Style.WrapperFullName>full name:</Style.WrapperFullName>
      <Style.WrapperLink href={linkToRepo} target="_blank" rel="noreferrer">
        {fullName}
      </Style.WrapperLink>
    </Style.Wrapper>
  );
};

export default RepositoryItem;
