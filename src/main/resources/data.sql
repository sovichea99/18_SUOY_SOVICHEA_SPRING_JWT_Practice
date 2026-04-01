
INSERT INTO app_roles (name) VALUES ('ROLE_USER'), ('ROLE_ADMIN');

INSERT INTO app_user_role (user_id, role_id) VALUES (1, 1);

INSERT INTO app_users (full_name, email, password)
VALUES ('senji', 'senji@gmail.com', '$2a$12$m9FXZ97lznFKhVwONp5AH.BUC7NA5p3IxSI7M4RgH0d2bHH86pRCa');