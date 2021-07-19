GraphQl is a query language used to query multiple dbs at the same time and multi level queries(correct).
Install npm
Setup babel dependencies..
Babel is a JavaScript compiler
Babel is a toolchain that is mainly used to convert ECMAScript 2015+ code into a backwards compatible version of JavaScript in current and older browsers or environments. Here are the main things Babel can do for you:
    Transform syntax
    Polyfill features that are missing in your target environment (through a third-party polyfill such as core-js)
    Source code transformations (codemods)
    And more! (check out these videos for inspiration) ->https://babeljs.io/videos.html

**Setup

1)Create directory graphql_Test
2)Create package.json by executing npm init
3)install dev dependencies
    a)npm install --save-dev babel-cli babel-preset-env babel-preset-stage-0
    b)Install main dependencies - npm install express express-graphql graphql nodemon
    c

Note: Express.js, or simply Express, is a back end web application framework for Node.js, released as free and open-source software under the MIT License. It is designed for building web applications and APIs. It has been called the de facto standard server framework for Node.js.

nodemon is a tool that helps develop node.js based applications by automatically restarting the node application when file changes in the directory are detected.

npm install graphql-tools

**MongoDB

https://docs.mongodb.com/manual/tutorial/install-mongodb-on-ubuntu/

wget -qO - https://www.mongodb.org/static/pgp/server-5.0.asc | sudo apt-key add -
wget -qO - https://www.mongodb.org/static/pgp/server-5.0.asc | sudo apt-key add -

Create the /etc/apt/sources.list.d/mongodb-org-5.0.list file for Ubuntu 20.04 (Focal)

sudo touch /etc/apt/sources.list.d/mongodb-org-5.0.list

echo "deb [ arch=amd64,arm64 ] https://repo.mongodb.org/apt/ubuntu focal/mongodb-org/5.0 multiverse" | sudo tee /etc/apt/sources.list.d/mongodb-org-5.0.list

sudo apt-get update

** Install the latest stable version
sudo apt-get install -y mongodb-org - 

If you are unsure which init system your platform uses, run the following command:
ps --no-headers -o comm 1
systemd

**start mongodb by 
sudo systemctl start mongod

*Verify that MongoDB has started successfully.
sudo systemctl status mongod

**Stop
sudo systemctl status mongod

**Restart MongoDB
sudo systemctl restart mongod

**Begin using MongoDB
mongo

--------------------------------------------
Install sqlite
npm install sqlite3 sequelize lodash casual

------------------------------------------------------------
Install Robo3T using Official packages

https://thelinuxgurus.com/install-robo3t-on-ubuntu/

$ wget https://download-test.robomongo.org/linux/robo3t-1.3.1-linux-x86_64-7419c406.tar.gz

sudo mkdir robo3t

tar -xvzf robo3t-1.3.1-linux-x86_64-7419c406.tar.gz -C robo3t

./robot3t


