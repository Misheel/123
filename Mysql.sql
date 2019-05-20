show databases;

use java2019;

show tables;

create table menu (
    id integer auto_increment,
    name varchar(200) not null,
    ordering integer default 0,
    link text,
    created datetime not null,
    primary key(id),

    key(name),
    index(ordering)

);


alter table menu add has_child bool;
alter table menu add test int after name;

alter table menu drop test;

alter table menu modify link int;

alter table menu rename column link to url;

drop table menu;

--------

insert into menu values(null,"Politics",null,null,sysdate());
insert into menu(id,name,created) values(null,"Entertainment",sysdate());

select * from menu;
delete from menu;
delete from menu where id=4;

update menu set name='Entertainment' where id=3;

--------

select * from menu order by id;
select * from menu order by id asc;

select * from menu order by id desc;

select * from menu order by ordering asc, name desc;


------

select count(*) from menu where ordering=0;
select min(id) from menu;
select max(id) from menu;
select avg(id) from menu;
select sum(id) from menu;

--------
create table category (
    id integer auto_increment,
    name varchar(200) not null,
    ordering integer default 0,
    primary key(id),
    key(ordering)    
);

insert into category values(null,"Politics",1);
insert into category values(null,"Entertainment",3);
insert into category values(null,"Economy",2);

create table content (
    id integer auto_increment,
    name varchar(200) not null,
    created datetime not null,
    text text,
    category_id integer,
    primary key(id),
    foreign key (category_id) references category(id)    
);

insert into content values(null,"Uls toriing medee",sysdate(), "",1);
insert into content values(null,"Uls toriing medee",sysdate(), "",null);


select * from content left join category on content.category_id = category.id;





