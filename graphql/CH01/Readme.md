## 1. GraphQL

GraphQl is a query language used to query multiple dbs at the same time and multi level queries.

##  2. Environment setup
1. Install npm
2. Setup babel dependencies.

Babel is a JavaScript compiler
Babel is a toolchain that is mainly used to convert ECMAScript 2015+ code into a backwards compatible version of JavaScript in current and older browsers or environments. Here are the main things Babel can do for you:
    - Transform syntax
    - Polyfill features that are missing in your target environment (through a third-party polyfill such as core-js)
    - Source code transformations (codemods)
    - Check out these videos for inspiration [here](https://babeljs.io/videos.html)

##  3. Setting up project

1. Create directory graphql_Test
2. Create package.json by executing npm init
3. Install dev dependencies
    - npm install --save-dev babel-cli babel-preset-env babel-preset-stage-0
    - Install main dependencies - npm install express express-graphql graphql nodemon
    
Note: Express.js, or simply Express, is a back end web application framework for Node.js, released as free and open-source software under the MIT License. It is designed for building web applications and APIs. It has been called the de facto standard server framework for Node.js.
nodemon is a tool that helps develop node.js based applications by automatically restarting the node application when file changes in the directory are detected.
