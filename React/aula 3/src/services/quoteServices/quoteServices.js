//export const getQuote = () => fetch('http://127.0.0.1:5000').then(response => response.json());

export const getQuote = () => {
    return fetch(process.env.REACT_APP_API).then((res) => {
      console.log(res);
      return res.json();
    });
  };