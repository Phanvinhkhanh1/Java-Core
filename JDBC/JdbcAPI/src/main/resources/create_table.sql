create table users(
username varchar (50) unique not null,
password varchar(50) unique not null,
createdDate timestamp not null
);

create table user_(
 id serial primary key,
 username varchar(50) not null,
 password varchar(50) not null,
 createdDate timestamp not null
);
