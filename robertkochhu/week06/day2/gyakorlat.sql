create database blog;
use blog;
create table users(
id int primary key auto_increment,
name varchar(30),
age int
);

INSERT INTO users (name,age) values('Sanyi', '30');
select * from users;
INSERT INTO users (name,age) values('Adam', '22');
INSERT INTO users (name,age) values('Eva', '45');
select * from users;


create table posts(
id int primary key auto_increment,
title varchar(100),
content text,
author_id int

);
insert into posts(title,content,author_id)
values('New blogpost','Nice new logpost',1);
insert into posts(title,content,author_id)
values('New blogpost1','Nice new logpost1',1);
insert into posts(title,content,author_id)
values('New blogpost2','Nice new logpost2',2);

select * from posts
join users on posts.author_id = users.id;

select name, count(posts.id) from users
left join posts on posts.author_id =users.id
group by users.name
order by users.name;

update posts set content='This is a very nice blog'
where id=2;

delete from posts where id=2;
select * from posts;

