show databases;

use java2019;

show tables;

create table menu (
    id integer auto_increment,
    name varchar(200) not null,
    ordering integer default 0,
    link text,
    created datetime not null,
    primary key(id)
);


alter table menu add has_child bool;
alter table menu add test int after name;

alter table menu drop test;

alter table menu modify link int;

alter table menu rename column link to url;

drop table menu;

--------

insert into menu values(null,"Politics",null,null,sysdate());
insert into menu(id,name) values(null,"Entertainment");

select * from menu;
delete from menu;
delete from menu where id=4;

update menu set name='Entertainment' where id=3;
