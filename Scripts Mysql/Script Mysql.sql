create database itau;
use itau;

CREATE TABLE itau.clientes (
    codigo_cliente INTEGER NOT NULL,
    nome_cliente VARCHAR(50) NOT NULL,
    idade_cliente INTEGER(3) NOT NULL,
    email_cliente VARCHAR(80) NOT NULL,
    PRIMARY KEY (codigo_cliente)
);
insert into itau.clientes
(codigo_cliente,nome_cliente,idade_cliente,email_cliente)
values
(1,"Marcello Fernandes",25,"Marcelo.f@itau.com.br"),
(2,"Wilian Moraes",20,"Willian@itau.com.br"),
(3,"Thiago Souza",18,"Thiago.l@itau.com.br"),
(4,"Renato Campos",22,"renato.c@itau.com.br");

SELECT 
    *
FROM
    itau.clientes
ORDER BY nome_cliente;

SELECT 
    nome_cliente, idade_cliente
FROM
    itau.clientes
ORDER BY nome_cliente;



use itau;
INSERT INTO `clientes` (`codigo_cliente`,`nome_cliente`,`idade_cliente`,`email_cliente`) VALUES (5,"Ivan Guzman",42,"(167) 848-5018"),(6,"Robert Y. Cummings",83,"(371) 370-1215"),(7,"Ali Copeland",40,"(604) 694-7675"),(8,"Christian Emerson",38,"(947) 705-2186"),(9,"Brett Clay",47,"(267) 816-5862"),(10,"Kimberley H. Mayo",34,"(832) 650-5619"),(11,"Melanie N. Sanchez",85,"(877) 689-7410"),(12,"Zephania A. Velez",67,"(730) 107-0889"),(13,"Tashya E. Trevino",39,"(837) 454-3734"),(14,"Rhonda D. Brennan",83,"(927) 267-7902");
INSERT INTO `clientes` (`codigo_cliente`,`nome_cliente`,`idade_cliente`,`email_cliente`) VALUES (15,"Maya Greer",34,"(541) 361-6959"),(16,"Branden D. Lawrence",89,"(359) 984-8131"),(17,"Dylan Cline",85,"(236) 562-6450"),(18,"Maris G. Hodges",49,"(359) 941-6667"),(19,"Gray Buchanan",57,"(989) 394-6838"),(20,"Madison S. Bartlett",96,"(700) 187-5089"),(21,"Benedict Riggs",20,"(686) 572-4783"),(22,"Fletcher K. Rose",73,"(982) 829-1569"),(23,"Doris Mcmillan",80,"(633) 186-1724"),(24,"Stewart M. Valentine",46,"(753) 822-5936");
INSERT INTO `clientes` (`codigo_cliente`,`nome_cliente`,`idade_cliente`,`email_cliente`) VALUES (25,"Whoopi D. Dickerson",61,"(783) 316-9498"),(26,"Summer U. Byrd",77,"(499) 977-8599"),(27,"Pamela S. Woodward",62,"(699) 168-5975"),(28,"Harper D. Hanson",46,"(944) 855-7482"),(29,"Karyn Z. Waters",98,"(319) 922-7033"),(30,"August R. Villarreal",45,"(933) 332-2905"),(31,"Carissa Dominguez",83,"(297) 747-7441"),(32,"Nomlanga I. Wilder",99,"(451) 576-4461"),(33,"Shaeleigh Bender",71,"(379) 824-9508"),(34,"Keiko Livingston",97,"(558) 120-3683");
INSERT INTO `clientes` (`codigo_cliente`,`nome_cliente`,`idade_cliente`,`email_cliente`) VALUES (35,"Carly Burks",23,"(319) 757-8574"),(36,"Madeson Meyer",36,"(840) 171-8755"),(37,"Cadman Mitchell",20,"(506) 930-8325"),(38,"Abdul R. Norton",91,"(323) 565-0768"),(39,"Ulysses Randall",79,"(827) 272-1328"),(40,"Kyra Z. Wilcox",71,"(803) 851-3372"),(41,"Ria H. Dillon",63,"(563) 244-5531"),(42,"Adele S. Burns",41,"(658) 467-6894"),(43,"Dora M. Glenn",76,"(936) 173-8093"),(44,"Olga Y. Duran",37,"(633) 447-5099");
INSERT INTO `clientes` (`codigo_cliente`,`nome_cliente`,`idade_cliente`,`email_cliente`) VALUES (45,"Uriel T. Guthrie",45,"(922) 244-8698"),(46,"Eve Y. Roth",24,"(634) 422-8183"),(47,"Shafira Beard",36,"(715) 290-3444"),(48,"Kendall Z. Ferguson",65,"(974) 277-0198"),(49,"Echo G. Spence",96,"(777) 673-9188"),(50,"Yen Fletcher",50,"(164) 805-9817"),(51,"Rooney S. Witt",44,"(195) 136-7739"),(52,"Castor H. Allison",95,"(852) 259-3276"),(53,"Desiree N. Howe",50,"(223) 576-7179"),(54,"Rebecca B. Camacho",58,"(773) 125-4511");
INSERT INTO `clientes` (`codigo_cliente`,`nome_cliente`,`idade_cliente`,`email_cliente`) VALUES (55,"Rosalyn Q. Juarez",59,"(481) 767-8947"),(56,"Lavinia W. Hobbs",82,"(552) 113-2118"),(57,"Neve K. Small",43,"(681) 135-6884"),(58,"Jared O. Burch",86,"(647) 838-4409"),(59,"Keelie Grant",77,"(170) 451-7334"),(60,"Allistair Moss",93,"(285) 578-9494"),(61,"Addison G. Brady",22,"(685) 245-4711"),(62,"Kenneth Mcknight",32,"(313) 507-6295"),(63,"Sybill Clemons",98,"(425) 654-3789"),(64,"Jessica A. Cooper",90,"(472) 740-0719");
INSERT INTO `clientes` (`codigo_cliente`,`nome_cliente`,`idade_cliente`,`email_cliente`) VALUES (65,"Kaseem Sanford",87,"(327) 389-5259"),(66,"Cassandra Dickson",28,"(859) 397-7096"),(67,"Zenia Q. Hurst",52,"(655) 547-8840"),(68,"Jolene Y. Becker",66,"(151) 997-3186"),(69,"Hedy O. Rivas",95,"(777) 502-1721"),(70,"Jayme Cantu",50,"(241) 473-8657"),(71,"Ingrid T. Cole",92,"(185) 922-0841"),(72,"Abel V. Mcgee",44,"(385) 722-8017"),(73,"Maisie Q. Holcomb",34,"(836) 604-9634"),(74,"Lance C. Bright",32,"(604) 686-1646");
INSERT INTO `clientes` (`codigo_cliente`,`nome_cliente`,`idade_cliente`,`email_cliente`) VALUES (75,"Noelani D. Barron",70,"(176) 580-6700"),(76,"Moses Suarez",82,"(403) 860-4126"),(77,"Slade Morton",68,"(643) 973-9097"),(78,"Jenna Dyer",65,"(744) 104-6513"),(79,"Cara Y. Mccullough",25,"(168) 690-6133"),(80,"Hall Conway",87,"(947) 263-2755"),(81,"Knox T. Malone",23,"(447) 439-4097"),(82,"Hannah T. Vargas",81,"(932) 516-7471"),(83,"Buckminster M. Hoffman",55,"(323) 664-0209"),(84,"Elizabeth K. Phelps",48,"(593) 587-7073");
INSERT INTO `clientes` (`codigo_cliente`,`nome_cliente`,`idade_cliente`,`email_cliente`) VALUES (85,"Hector C. Hurst",77,"(709) 705-5122"),(86,"Elton Z. Small",56,"(677) 680-8099"),(87,"Brent Sloan",43,"(250) 877-8606"),(88,"Jane H. Wheeler",48,"(351) 534-2825"),(89,"Bryar Richard",50,"(337) 552-1213"),(90,"Magee W. Ball",28,"(789) 836-8501"),(91,"Brenda K. Rutledge",36,"(992) 958-2611"),(92,"Morgan B. Franks",97,"(165) 967-7349"),(93,"Tiger P. Curtis",57,"(867) 376-6184"),(94,"Carolyn X. Mcgee",98,"(416) 170-2220");
INSERT INTO `clientes` (`codigo_cliente`,`nome_cliente`,`idade_cliente`,`email_cliente`) VALUES (95,"Chastity Fields",87,"(448) 966-3637"),(96,"Ocean C. Shepherd",83,"(267) 511-1902"),(97,"Theodore Parrish",47,"(751) 476-1831"),(98,"Nerea Parker",57,"(519) 137-1664"),(99,"Duncan T. Gamble",77,"(511) 851-4674"),(100,"Linus D. Burks",46,"(189) 590-6950"),(101,"Paul Bray",86,"(794) 975-3951"),(102,"Ora Mendoza",57,"(250) 694-1826"),(103,"Kaitlin Christian",75,"(460) 434-4647"),(104,"Geoffrey Davidson",26,"(361) 885-4529");


SELECT 
    *
FROM
    itau.clientes
WHERE
    idade_cliente >= 18
        AND idade_cliente <= 30
ORDER BY idade_cliente;

SELECT 
    COUNT(*) AS Total_Registros
FROM
    itau.clientes
WHERE
    idade_cliente >= 18
        AND idade_cliente <= 30
ORDER BY idade_cliente;

SELECT 
    *
FROM
    itau.clientes
WHERE
    idade_cliente IN (20 , 30, 40)
ORDER BY idade_cliente;

SELECT 
    *
FROM
    itau.clientes
WHERE
    codigo_cliente = 4;

SELECT 
    *
FROM
    itau.clientes
WHERE
    nome_cliente = 'Renato';
SELECT 
    *
FROM
    itau.clientes
WHERE
    nome_cliente LIKE 'Renato%';
SELECT 
    *
FROM
    itau.clientes
WHERE
    nome_cliente LIKE '%A.%';
SELECT 
    COUNT(*) AS Total_Registros
FROM
    itau.clientes
WHERE
    nome_cliente LIKE '%A.%';

alter table itau.clientes add endereco varchar(60) not null;


alter table itau.clientes rename column endereco_clientes to endereco_cliente;
-- procedimento utilizado para alterar a estrutura do tipo de dados de um campo na tabela.
alter table itau.clientes change endereco_cliente endereco_cliente varchar(80) not null;

describe itau.clientes;

SELECT 
    *
FROM
    itau.clientes;

UPDATE itau.clientes 
SET 
    endereco_cliente = 'Rua Tito'
WHERE
    codigo_cliente = 1;

UPDATE itau.clientes 
SET 
    endereco_cliente = 'Atualizar campo endereço'
WHERE
    codigo_cliente >= 2;

UPDATE itau.clientes 
SET 
    endereco_cliente = 'Atualizar campo endereço'
WHERE
    endereco_cliente <> 'Rua tito';

alter table itau.clientes add estado_cliente char(2)  not null;

UPDATE itau.clientes 
SET 
    estado_cliente = 'SP'
WHERE
    idade_cliente >= 18
        AND idade_cliente <= 30;
UPDATE itau.clientes 
SET 
    estado_cliente = 'xx'
WHERE
    estado_cliente = '';


CREATE TABLE itau.bkp_clientes SELECT * FROM
    itau.clientes;


describe itau.bkp_clientes;


DELETE FROM itau.clientes;

insert into itau.clientes 
(codigo_cliente,nome_cliente,idade_cliente,email_cliente,endereco_cliente,estado_cliente)
select codigo_cliente,nome_cliente,idade_cliente,email_cliente,endereco_cliente,estado_cliente
 from itau.clientes where idade_cliente>=50;

SELECT 
    *
FROM
    itau.clientes;
    
    
create database unibanco;
CREATE TABLE unibanco.clientes SELECT * FROM
    itau.clientes;

SELECT 
    *
FROM
    unibanco.clientes;

drop table itau.clientes;
drop table itau.bkp_clientes;
SELECT 
    *
FROM
    itau.clientes;


insert into itau.clientes
(codigo_cliente,nome_cliente,cpf_cliente,idade_cliente,endereco_cliente,bairro_cliente,estado_cliente,agencia_cliente,conta_corrente_cliente,digito_verificador_cliente,telefone_contato_cliente,email_cliente,data_modificacao_registro_cliente)
select codigo_cliente,nome_cliente,"atualizar",idade_cliente,endereco_cliente,"atualizar",estado_cliente,"0000","000000",0,"atualizar",email_cliente,now() from unibanco.clientes;



create table itau.clientes(
codigo_cliente int not null,
nome_cliente varchar(50) not null,
cpf_cliente char(11) not null,
idade_cliente int(3) not null,
endereco_cliente varchar(80) not null,
bairro_cliente varchar(60) not null,
estado_cliente char(2) not null,
agencia_cliente char(4) not null,
conta_corrente_cliente varchar(8) not null,
digito_verificador_cliente int(1) not null,
telefone_contato_cliente char(11) not null,
email_cliente varchar(80) not null,
data_modificacao_registro_cliente datetime,
primary key (codigo_cliente,cpf_cliente)
);
 
 insert into itau.clientes
(codigo_cliente,nome_cliente,idade_cliente,email_cliente)
values
(1,"Marcello Fernandes",25,"marcello.f@itau.com.br"),
(2,"William Moraes",20,"william.m@itau.com.br"),
(3,"Tiago Lopes Souza",18,"tiago.l@itau.com.br"),
(4,"Renato Campos",22,"renato.c@itau.com.br");
 
 select * from itau.clientes;
 
 select table itau.controle_horas and a
 
 create table itau.controle_horas(
 cod_controlador int auto_increment,
 nome_funcionario varchar(50) not null,
 quantidade_horas_trab int(2) not null,
 valor_hora decimal(8,2) not null,
 primary key (cod_controlador)
 );
 
insert into itau.controle_horas
(nome_funcionario, quantidade_horas_trab,valor_hora)
values
("Pedro da Silva",12,10.50),
("Flamir da Silva",8,50.00),
("Alberto José",12,11.50),
("Andre Oliveira",17,12.50);

select * from itau.controle_horas;

SELECT 
    nome_funcionario,
    quantidade_horas_trab,
    valor_hora,
    (quantidade_horas_trab * valor_hora) AS Vl_Sal_dia
FROM
    itau.controle_horas;
    
alter table itau.controle_horas add genero varchar(20) not null;

select * from itau.controle_horas;

describe itau.controle_horas;

update itau.controle_horas set genero="Masculino" where cod_controlador in (1,2,3,4);

alter table itau.controle_horas drop genero;


select genero, sum(quantidade_horas_trab*valor_hora) as Tot_Sal_dia from itau.controle_horas group by genero order by genero;

insert into itau.controle_horas
(cod_controlador,nome_funcionario, quantidade_horas_trab,valor_hora,genero)
values
(5,"Renata",17,12.50,"Feminino");



use itau;


CREATE TABLE `Produtos` (
	`Codigo_Produto` int NOT NULL AUTO_INCREMENT,
	`Nome_Produto` varchar(50) NOT NULL,
	`Valor_Produto` DECIMAL(8,2) NOT NULL,
	`Cod_Marca` int NOT NULL,
	PRIMARY KEY (`Codigo_Produto`)
);

CREATE TABLE `Marcas` (
	`Codigo_Marca` int NOT NULL AUTO_INCREMENT,
	`Nome_Marca` varchar(50) NOT NULL,
	PRIMARY KEY (`Codigo_Marca`)
);

ALTER TABLE `Produtos` ADD CONSTRAINT `Produtos_fk0` FOREIGN KEY (`Cod_Marca`) REFERENCES `Marcas`(`Codigo_Marca`);


insert into itau.marcas
(nome_marca)
values
("Walita"),
("Cadence"),
("Brastemp");

insert into itau.produtos
(nome_produto,valor_produto,cod_marca)
values
("Batedeira",128.89,1),
("Fogao",222.89,2),
("Geladeira",444.89,2),
("Microondas",111.89,1),
("Depurador de Ar",111.89,3);

select * from itau.produtos

use itau;

select p.Nome_Produto,p.Valor_Produto,m.Nome_Marca
from itau.produtos as p,
itau.marcas as m
where
p.Cod_Marca=m.Codigo_Marca 