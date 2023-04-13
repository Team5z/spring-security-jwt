-- coll next value for hibernate_sequence; -- 넣은 숫자 이후로 자동 증가
insert into NAccount ( `name`, `password`, `email`, `cellphone`, `reg_Date`)
values (2, 'h1', '1234', '1xxx@xxx.xxx', '123456', now());
--
-- -- coll next value for hibernate_sequence; -- 넣은 숫자 이후로 자동 증가
-- insert into NAccount (`na_seq`, `name`, `password`, `email`, `cellphone`, `regDate`)
-- values (3,'h2', '1234', '2xxx@xxx.xxx', '123456', now())
--
-- --coll next value for hibernate_sequence; -- 넣은 숫자 이후로 자동 증가
-- insert into NAccount (`na_seq`, `name`, `password`, `email`, `cellphone`, `regDate`)
-- values (4, 'h3', '1234', '3xxx@xxx.xxx', '123456', now())

show tables;
