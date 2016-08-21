CREATE TABLE users
(
username varchar(50) PRIMARY KEY NOT NULL,
password varchar(50) NOT NULL,
role varchar(50) NOT NULL,
enabled tinyint(1) NOT NULL,
CONSTRAINT uq_username UNIQUE (username)
)