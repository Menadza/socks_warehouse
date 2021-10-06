drop table if exists socks;
drop table if exists colors;

create table colors
(
    id    bigint auto_increment primary key,
    title varchar(255) not null
);

create table socks
(
    id          bigint auto_increment primary key,
    color_id    bigint references colors (id),
    quantity    bigint not null,
    cotton_Part bigint not null check (cotton_Part >= 0 and cotton_Part <= 100)
);