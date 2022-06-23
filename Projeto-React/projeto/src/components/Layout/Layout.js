import React from "react";
import Header from "../Header/Header";
import * as Style from "./styled";

function Layout({ children }){
  return (
    <Style.WrapperLayout>
      <Header />
      {children}
    </Style.WrapperLayout>
  );
};

export default Layout;
