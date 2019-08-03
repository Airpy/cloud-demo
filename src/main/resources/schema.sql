drop table if exists tbUser;
drop table if exists tbProduct;
drop table if exists tbProduct_comment;

create table tbProduct(
    id int unsigned not null auto_increment comment '主键',
    name   varchar (100) comment '商品名称',
    cover_image varchar(100) comment '图片',
    price int not null default 0 comment '价格',
    primary key(id)
);

create table tbProductComment(
    id int unsigned not null auto_increment comment '主键',
    product_id   int unsigned,
    author_id int unsigned,
    content varchar (200),
    created timestamp ,
    primary key(id)
);

create table tbUser(
    id int unsigned not null auto_increment comment '主键',
    nickname   varchar (50),
    avatar varchar (255),
    primary key(id)
);



