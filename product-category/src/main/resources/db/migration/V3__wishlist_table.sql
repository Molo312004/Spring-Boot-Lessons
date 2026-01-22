-- create table wishlist(
--     category_id tinyint not null,
--     product_id bigint not null,

--     constraint pk_wishlist
--     primary key(category_id, product_id),

--     constraint fk_wishlist_category
--     foreign key(category_id)
--     references categories(id),

--     constraint fk_wishlist_product
--     foreign key(product_id)
--     references products(id)

-- )