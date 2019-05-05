insert into usr (id, username, password, active)
    values (1, 'admin', '$2a$08$qFJv9zokdc3kYCKPwd0JeulUFQ77sSeR/iJJxtukzcjJgXFGnlwD6', true);

insert into user_role (user_id, roles)
    values (1, 'USER'), (1, 'ADMIN');