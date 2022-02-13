CREATE TABLE employees (
    id         serial,
    name       varchar(15),
    surname    varchar(25),
    department varchar(20),
    salary     int,
    PRIMARY KEY (id)
);

grant all on employees to bestuser;
grant all on employees_id_seq to bestuser;

INSERT INTO employees (name, surname, department, salary)
VALUES
    ('Zaur', 'Tregulov', 'IT', 500),
    ('Oleg', 'Ivanov', 'Sales', 700),
    ('Nina', 'Sidorova', 'HR', 850);

