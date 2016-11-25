# initial setup of mysql
```
mysqld --console --skip-grant-tables
mysql -u root
use mysql
update user set authentication_string=password('root') where user='root';
SET PASSWORD = PASSWORD('root');
```

# create database and user
```
CREATE DATABASE testdb;
CREATE USER 'test'@'localhost' IDENTIFIED BY 'test';
GRANT ALL PRIVILEGES ON testdb.* TO 'test'@'localhost';
flush privileges;
```

# starting mysql and logging in as user
```
mysqld --console
mysql -u test -p -D testdb
```

# creating tables
```
CREATE TABLE pet (
 id MEDIUMINT NOT NULL AUTO_INCREMENT,
 name VARCHAR(20), 
 owner VARCHAR(20),
 species VARCHAR(20), 
 sex CHAR(1), 
 birth DATE, 
 death DATE,
 PRIMARY KEY(id)
);

CREATE TABLE car (
 id MEDIUMINT NOT NULL AUTO_INCREMENT,
 make VARCHAR(20), 
 model VARCHAR(20),
 year INTEGER,
 PRIMARY KEY(id)
);
```