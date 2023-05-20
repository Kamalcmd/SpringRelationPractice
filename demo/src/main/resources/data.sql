--Data For Category
INSERT INTO Category (name) VALUES ('Pilot');
INSERT INTO Category (name) VALUES ('Bullet');
INSERT INTO Category (name) VALUES ('Tesla');
INSERT INTO Category (name) VALUES ('cat');

--Data for Product
INSERT INTO Product(name, price, rating, category_id) VALUES ('16 Inch churot',5.0,3.0,1);
INSERT INTO Product(name, price, rating, category_id) VALUES ('tapari',9.0,5.0,2);
INSERT INTO Product(name, price, rating, category_id) VALUES ('Y-Model',1200.0,5.0,3);

--Data for Address

INSERT INTO Address(city,street,zip) VALUES ('Lexington','limestone','40508');
INSERT INTO Address(city,street,zip) VALUES ('Lex','lime','40501');
INSERT INTO Address(city,street,zip) VALUES ('gton','stone','40502');

--Data for User

INSERT INTO Users(email, first_name,lastname,password,address_id) VALUES ('kamal@gmire.com','Kamal','Ghimire','azcf',1);
INSERT INTO Users(email, first_name,lastname,password,address_id) VALUES ('Bimal@gmire.com','Pooja','Shiwakoti','Kolkota',2);
INSERT INTO Users(email, first_name,lastname,password,address_id) VALUES ('karna@gmail.com','Karna','shrestha','Karkrebihar',3);


--Data for review
INSERT INTO review(comment,product_id,user_id) VALUES ('I dont know what to do',1,1);
INSERT INTO review(comment,product_id,user_id) VALUES ('Is everything Okey',2,2);
INSERT INTO review(comment,product_id,user_id) VALUES ('How dare you',3,3);

