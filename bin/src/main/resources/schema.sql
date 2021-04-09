drop table if exists friends;
create table friends(
    id bigint not null AUTO_INCREMENT,
    name varchar(30) not null,
    address varchar(40) not null,
    city varchar(25) not null,
    state varchar(2) not null,
    zip varchar(10) not null,
    phone varchar(15) not null,
    email varchar(40) not null,
    primary key(id)
);