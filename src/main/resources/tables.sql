create table users (username varchar(50) not null primary key,
	password varchar(50) not null,
    enabled boolean not null);



 create table authorities (
username varchar(50) not null,
authority varchar(50) not null,
constraint fk_authorities_users
foreign key(username) references users(username));


create unique index idx_authusername on
authorities (username, authority);

insert into users(username, password, enabled)
values ("admin", "secret", true);


insert into authorities(username, authority)
values ("admin", "ROLE_USER");
insert into authorities(username, authority)
values ("admin", "ROLE_ADMIN");

select * from users;

select * from authorities;