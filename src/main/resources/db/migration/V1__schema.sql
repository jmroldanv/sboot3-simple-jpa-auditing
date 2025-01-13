create table customers (
    id int primary key AUTO_INCREMENT,
    name varchar(50),
    created_date datetime(6),
    created_by varchar(255),
    last_modified_date datetime(6),
    last_modified_by varchar(255)
);
