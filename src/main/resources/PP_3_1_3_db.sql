INSERT INTO user (`id`, `age`, `email`, `name`, `password`, `username`) VALUES ('1', '12', 'Egor@mail.ru', 'Egor', '1', 'user1');
INSERT INTO user (`id`, `age`, `email`, `name`, `password`, `username`) VALUES ('2', '25', 'Olga@mail.ru', 'Olga', '2', 'user2');

INSERT INTO role (`id`, `role`) VALUES ('1', 'ROLE_ADMIN');
INSERT INTO role (`id`, `role`) VALUES ('2', 'ROLE_USER');

INSERT INTO user_role (`user_id`, `role_id`) VALUES ('1', '1');
INSERT INTO user_role (`user_id`, `role_id`) VALUES ('2', '2');


