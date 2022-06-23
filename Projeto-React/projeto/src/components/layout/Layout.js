import React from "react";
import Header from "../header";
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