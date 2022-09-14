create table users_(
id serial primary key,
full_name varchar(255) not null,
user_name varchar(255) not null,
password varchar(50) not null,
createdAt timestamp not null,
modifiedAt timestamp not null
);