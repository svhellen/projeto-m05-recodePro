

INSERT INTO `cliente` VALUES 
(1,'Maria@email.com','Maria','1234','99999999990'),
(2,'Joao@email.com','João','1234','99999999999'),
(3,'Jose@email.com','José','1234','99999999999'),
(4,'Clara@email.com','Clara','1234','99999999999'),
(5,'Bruno@email.com','Bruno','1234','99999999999');

select * from cliente;

INSERT INTO `passagem` VALUES 
(1,'Primeira Classe','24-03-2024','Aracaju - SE','São Paulo - SP',386),
(3,'Econômica','28-05-2024','Salvador - BA','São Paulo - SP',357),
(4,'Econômica','06-11passagem-2024','Maceio - AL','São Paulo - SP',349),
(5,'Executiva','24-03-2023','Rio de Janeiro - RJ','São Paulo - SP',338),
(6,'Econômica','24-03-2023','São Paulo - SP','Rio de Janeiro - RJ',386),
(7,'Econômica','24-11-2024','São Paulo - SP','Recife - PE',357),
(8,'Executiva','28-03-2024','São Paulo - SP','Salvador - BA',338),
(9,'Primeira Classe','13-05-2024','São Paulo - SP','Aracaju - SE',293),
(10,'Econômica','06-08-2023','São Paulo - SP','Maceio - AL',349);

select * from passagem;

INSERT INTO `reserva` VALUES (1,5,10), (2,4,4), (3, 3,12);

select * from reserva;





