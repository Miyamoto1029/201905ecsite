set names utf8;
set foreign_key_checks = 0;
drop database if exists logindb_miyamoto03;
create database logindb_miyamoto03;
use logindb_miyamoto03;

create table user(
id int,
user_name varchar(255),
password varchar(255)
);

insert into user values
(1,"taro03","123"),
(2,"jiro03","123"),
(3,"hanako03","123"),
(4,"saburo03","123");