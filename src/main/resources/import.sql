INSERT INTO users (name, email, password, enabled) VALUES ('adrian','adrian@gmail.com', '$2a$10$kv6V.xbjPOz7Oobdz.JT3ugX8J7FOLrui0NXM/a50BUzOpJ9kSZem',1);
INSERT INTO users (name, email, password, enabled) VALUES ('admin','admin@gmail.com', '$2a$10$LeHrq3fIQIRXo4Cf3KaRoeCjIv7f2ichiSe0SMAwDZiqZLdmnlMOu',1);

INSERT INTO ROLES (authority,user_id) VALUES ('ROLE_USER',1);
INSERT INTO ROLES (authority,user_id) VALUES ('ROLE_USER',2);
INSERT INTO ROLES (authority,user_id) VALUES ('ROLE_ADMIN',2);