insert into users (id, balance, name, surname)
values (1, 61500.00, 'Ivan', 'Ivanov');

insert into users (id, balance, name, surname)
values (2, 4200.00, 'Pasha', 'Sidorov');

insert into users (id, balance, name, surname)
values (3, 2400.00, 'Petr', 'Petrov');

insert into operations (id, date_of_operation, operation_type, sum, user_id)
values (100, '2026-02-02', 'PUT_MONEY', 300.0, 1);