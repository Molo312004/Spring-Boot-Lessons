create table profiles(
	id bigint primary key,
    bio varchar(255),
    phone_number varchar(15),
    date_of_birth date,
    loyalty_points bigint unsigned default 0,
    
    constraint fk_profiles_users
		foreign key (id)
        references users(id)
);

