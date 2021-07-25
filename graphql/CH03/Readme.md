# MongoDB setup

Follow the steps from [mongodb installation](https://docs.mongodb.com/manual/tutorial/install-mongodb-on-ubuntu/)

1. Download packages
    - *wget -qO - https://www.mongodb.org/static/pgp/server-5.0.asc | sudo apt-key add -*
    - *wget -qO - https://www.mongodb.org/static/pgp/server-5.0.asc | sudo apt-key add -*

2. Add to source list
    - Create the /etc/apt/sources.list.d/mongodb-org-5.0.list file for Ubuntu 20.04 (Focal)
            - *sudo touch /etc/apt/sources.list.d/mongodb-org-5.0.list*
            - *echo "deb [ arch=amd64,arm64 ] https://repo.mongodb.org/apt/ubuntu focal/mongodb-org/5.0 multiverse" | sudo tee /etc/apt/sources.list.d/mongodb-org-                 5.0.list*
3. Update and install

    - *sudo apt-get update*
    - *sudo apt-get install -y mongodb-org -* 
If you are unsure which init system your platform uses, run the following command:
    *ps --no-headers -o comm 1 systemd*

4. mongodb commands

    - *sudo systemctl start mongod*
    - *sudo systemctl status mongod*
    - *sudo systemctl status mongod*
    - *sudo systemctl restart mongod*
    - *mongo*

# SQLite setup
 - Install sqlite
        - *npm install sqlite3 sequelize lodash casual*



