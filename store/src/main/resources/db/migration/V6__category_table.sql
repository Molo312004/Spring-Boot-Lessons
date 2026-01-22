create table categories(
	id tinyint primary key auto_increment,
    name varchar(255) not null
);

create table products(
	id bigint primary key auto_increment,
    name varchar(255) not null,
    price decimal(10,2) not null,
    category_id tinyint not null,
    
    constraint fk_product_category
    foreign key(category_id)
    references categories(id)
    on delete restrict 
    on update cascade
);

