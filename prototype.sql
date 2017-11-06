drop database if exists bases2p1;
create database bases2p1;
\c bases2p1

create table fuente_soda(codfs integer primary key, nombrefs varchar(20));
create table bebida(codbeb integer primary key, nombrebeb varchar(20));
create table bebedor(cedula integer primary key, nombre varchar(20));
create table frecuenta(cedula integer references bebedor(cedula),codfs integer references fuente_soda(codfs));
create table gusta(cedula integer references bebedor(cedula),codbeb integer references bebida(codbeb));
create table vende(codfs integer references fuente_soda(codfs),codbeb integer references bebida(codbeb), precio real);


insert into fuente_soda values(1, 'Amper');
insert into fuente_soda values(2, 'Acuario');
insert into fuente_soda values(3, 'Estudiantes');
insert into fuente_soda values(4, 'MYS');
insert into fuente_soda values(5, 'ElPunto');
insert into fuente_soda values(6, 'SalaCompu');
insert into fuente_soda values(7, 'SalaMate');
insert into fuente_soda values(8, 'SalaMeca');
insert into fuente_soda values(9, 'Subway');
insert into fuente_soda values(10, 'CasaProf');



insert into bebedor values(1, 'Sergio');
insert into bebedor values(2, 'Virginia');
insert into bebedor values(3, 'Larry');
insert into bebedor values(4, 'Josue');
insert into bebedor values(5, 'Marlene');
insert into bebedor values(6, 'Miguel Torrealba');
insert into bebedor values(7, 'Carolina Chang');
insert into bebedor values(8, 'Ricardo Monascal');
insert into bebedor values(9, 'Vicente Yriarte');
insert into bebedor values(10, 'Enrique Planchart');




insert into bebida values(1, 'Cerveza');
insert into bebida values(2, 'Vino');
insert into bebida values(3, 'Ron');
insert into bebida values(4, 'Whisky');
insert into bebida values(5, 'Vodka');
insert into bebida values(6, 'Refresco');
insert into bebida values(7, 'Toddy');
insert into bebida values(8, 'Te');
insert into bebida values(9, 'Jugo de naranja');
insert into bebida values(10, 'Jugo de manzana');
insert into bebida values(11, 'Jugo de lechoza');
insert into bebida values(12, 'Jugo de guayaba');
insert into bebida values(13, 'Jugo de fresa');
insert into bebida values(14, 'Cafe');
insert into bebida values(15, 'Agua');


insert into frecuenta values(1, 2);
insert into frecuenta values(1, 4);
insert into frecuenta values(1, 6);
insert into frecuenta values(2, 1);
insert into frecuenta values(2, 3);
insert into frecuenta values(2, 5);
insert into frecuenta values(3, 7);
insert into frecuenta values(3, 9);
insert into frecuenta values(4, 8);
insert into frecuenta values(4, 10);
insert into frecuenta values(5, 1);
insert into frecuenta values(5, 2);
insert into frecuenta values(5, 3);
insert into frecuenta values(5, 4);
insert into frecuenta values(5, 5);
insert into frecuenta values(6, 6);
insert into frecuenta values(6, 7);
insert into frecuenta values(6, 8);
insert into frecuenta values(6, 9);
insert into frecuenta values(6, 10);
insert into frecuenta values(7, 10);



insert into gusta values (1, 2);
insert into gusta values (1, 3);
insert into gusta values (1, 6);
insert into gusta values (2, 1);
insert into gusta values (2, 8);
insert into gusta values (2, 10);
insert into gusta values (3, 2);
insert into gusta values (4, 6);
insert into gusta values (4, 7);
insert into gusta values (5, 15);
insert into gusta values (5, 2);
insert into gusta values (6, 3);
insert into gusta values (6, 9);
insert into gusta values (7, 1);
insert into gusta values (7, 8);
insert into gusta values (7, 11);
insert into gusta values (8, 12);
insert into gusta values (8, 13);
insert into gusta values (8, 14);
insert into gusta values(6, 10);


insert into vende values (1,6,3.8);
insert into vende values (1,9,4.0);
insert into vende values (1,14,15.1);
insert into vende values (1,15,10.0);
insert into vende values (2,6,7.78);
insert into vende values (2,7,8.15);
insert into vende values (2,14,9.0);
insert into vende values (2,15,3.2);
insert into vende values (3,9,18.3);
insert into vende values (3,10,8.0);
insert into vende values (3,11,10.1);
insert into vende values (3,12,3.69);
insert into vende values (3,13,7.2);
insert into vende values (4,1,2.5);
insert into vende values (4,2, 4.2);
insert into vende values (4,3, 4.3);
insert into vende values (4,4, 4.4);
insert into vende values (4,15, 9.57);
insert into vende values (6,6, 9.3);
insert into vende values (6,15, 9.2);
insert into vende values (7,6, 3.5);
insert into vende values (7,15, 8.09);
insert into vende values (8,6, 3.99);
insert into vende values (8,15, 7.12);
insert into vende values (9,6, 9.09);
insert into vende values (9,14, 16.5);
insert into vende values (9,15, 12.1);
insert into vende values (10,6, 8.16);
insert into vende values (10,9, 0.79);
insert into vende values (10,10, 6.8);
insert into vende values (10,11, 10.3);
insert into vende values (10,12, 4.32);
insert into vende values (10,13, 6.7);
insert into vende values (10,14, 11.0);
insert into vende values (10,15, 15.0);


insert into fuente_soda values(11, 'La Montana');
insert into frecuenta values(10, 11);
insert into gusta values(10, 15);
insert into vende values(11, 15);

insert into fuente_soda values(12, 'Guardabosques');
insert into frecuenta values(9, 12);
insert into gusta values (9, 15);
insert into vende values(12, 15, 9.0);
insert into gusta values (9, 14);
insert into vende values(12, 14, 8.77);

insert into gusta values(9,6);


insert into bebedor values(11, 'luis Perez');
insert into frecuenta values(11, 4);
