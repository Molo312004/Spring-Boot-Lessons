create table products(
	id bigint primary key auto_increment,
    name varchar(255) not null,
    price decimal(10,2) not null
);

create table users(
	id bigint primary key auto_increment
);

CREATE TABLE user_products (
    user_id BIGINT NOT NULL,
    product_id BIGINT NOT NULL,

    CONSTRAINT pk_user_products
        PRIMARY KEY (user_id, product_id),

    CONSTRAINT fk_user_products_user
        FOREIGN KEY (user_id)
        REFERENCES users(id)
        ON DELETE CASCADE,

    CONSTRAINT fk_user_products_product
        FOREIGN KEY (product_id)
        REFERENCES products(id)
        ON DELETE CASCADE
);
