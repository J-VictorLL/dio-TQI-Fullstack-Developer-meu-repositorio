const path = require('path');
const HtmlWebPackPlugin = require("html-webpack-plugin")

module.exports ={
    devtool: 'source-map',//mapeia todos os arquivos de maneira a debugar falhas no código
    mode: 'development',
    entry: './src/index.js',
    output: {
        path: path.resolve(__dirname, 'dist'),
        filename: 'bundle.js'
    },
    module:{
        rules:[
            {
                test: /\.(js|jsx)$/,
                exclude: /node_modules/,
                use:{
                    loader: "babel-loader"
                }
            },
            {
                test: /\.(png|jpe?g|gif)$/i,
                use: [
                  {
                    loader: 'file-loader',
                  },
                ],
              },
              {                                        
                test: /\.(sa|sc|c)ss$/,              
                use: [   
                    "css-loader",                    
                    "sass-loader",                   
                ],                                   
                sideEffects: true,                   
              },   
        ]
    },
    plugins:[
        new HtmlWebPackPlugin({
            template: "./public/index.html",
            filename: "./index.html"
        })
    ]
} 