import styled from "styled-components";

export const Wrapper = styled.div`
  display: flex;
  width: 90%;
  padding: 4px;
  margin:auto;
  

  input {
    border: 1px solid #ccc;
    background-color: #FAFAFA;
    border-radius: 8px;
    width: 100%;
    height: 44px;
    padding: 8px;
    font-weight: 500;
    box-shadow: 2px 2px 2px 1px rgba(0, 0, 0, 0.2);
  }

  input::placeholder {
    opacity: 0.4;
  }

  button {
    background-color: #1A50BB;
    padding: 8px 30px;
    margin: 0 16px;
    border-radius: 8px;
    box-shadow: 2px 2px 2px 1px rgba(0, 0, 0, 0.2);

    &:hover {
      background-color: #2c5282;
      box-shadow: 3px 2px 10px rgba(0, 0, 0, 0.2);
    }

    span {
      font-weight: bold;
      color: #ffff;
    }
  }
`;
