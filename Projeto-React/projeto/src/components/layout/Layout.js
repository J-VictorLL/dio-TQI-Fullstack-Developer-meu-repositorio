import React from "react";
import Header from "../Header";
import * as Style from "./styled";

const Layout = ({ children }) => {
  return (
    <Style.WrapperLayout>
      <Header />
      {children}
    </Style.WrapperLayout>
  );
};

export default Layout;