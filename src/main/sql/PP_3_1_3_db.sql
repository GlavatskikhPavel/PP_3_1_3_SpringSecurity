
INSERT INTO user(id, name, age, email, password, username)
    value (1, 'Pavel', 25, 'Pavel@mail.ru', 1, 'user1');

INSERT INTO user(id, name, age, email, password, username)
    value (2, 'Pavel2', 26, 'Pavel2@mail.ru', 2, 'user2');

INSERT INTO user(id, name, age, email, password, username)
    value (3, 'Pavel3', 27, 'Pavel3@mail.ru', 3, 'user3');

INSERT INTO user(id, name, age, email, password, username)
    value (4, 'Pavel4', 28, 'Pavel4@mail.ru', 4, 'user4');

INSERT INTO role(id, role) VALUES (1, 'ROLE_USER');
INSERT INTO role(id, role) VALUES (2, 'ROLE_ADMIN');

insert into user_role(user_id, role_id) VALUES (1,2);
insert into user_role(user_id, role_id) VALUES (2,1);
insert into user_role(user_id, role_id) VALUES (3,1);
insert into user_role(user_id, role_id) VALUES (4,1);

