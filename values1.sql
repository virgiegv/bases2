drop database if exists larry;
create database larry;
\c larry

create table fuente_soda(codfs integer primary key, nombrefs varchar(20));
create table bebida(codbeb integer primary key, nombrebeb varchar(20));
create table bebedor(cedula integer primary key, nombrefs varchar(20));
create table frecuenta(cedula integer references bebedor(cedula),codfs integer references fuente_soda(codfs));
create table gusta(cedula integer references bebedor(cedula),codbeb integer references bebida(codbeb));
create table vende(codfs integer references fuente_soda(codfs),codbeb integer references bebida(codbeb));


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

/* select * from fuente_soda
postgres-# ;
 codfs |  nombrefs
-------+-------------
     1 | Amper
     2 | Acuario
     3 | Estudiantes
     4 | MYS
     5 | ElPunto
     6 | SalaCompu
     7 | SalaMate
     8 | SalaMeca
     9 | Subway
    10 | CasaProf
(10 filas)
*/

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

/*
QUE SITIOS QUE FRECUENTA MARLENE VENDEN AL MENOS UNA COSA QUE LE GUSTA

SELECT F.nombrefs,B.nombrebeb 
FROM fuente_soda F, bebida B, vende V, bebedor Be, gusta G, frecuenta Fr 
WHERE (V.codfs = F.codfs) AND (V.codbeb = B.codbeb) AND 
      (G.codbeb = B.codbeb) AND (G.cedula = Be.cedula) AND 
      (Be.cedula = 5) AND (Fr.cedula = Be.cedula) AND (Fr.codfs = F.codfs);
 nombrefs | nombrebeb 
----------+-----------
 Amper    | Agua
 Acuario  | Agua
 MYS      | Vino
 MYS      | Agua
(4 rows)


*/


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
insert into gusta values (9, 15);

/*
DONDE VENDEN LAS COSAS QUE LE GUSTAN A MARLENE
SELECT F.nombrefs,B.nombrebeb 
FROM fuente_soda F, bebida B, vende V, bebedor Be, gusta G 
WHERE (V.codfs = F.codfs) AND (V.codbeb = B.codbeb) AND 
      (G.codbeb = B.codbeb) AND (G.cedula = Be.cedula) 
      AND (G.cedula = 5);
 nombrefs  | nombrebeb 
-----------+-----------
 Amper     | Agua
 Acuario   | Agua
 MYS       | Vino
 MYS       | Agua
 SalaCompu | Agua
 SalaMate  | Agua
 SalaMeca  | Agua
 Subway    | Agua
 CasaProf  | Agua
(9 rows)
*/

insert into vende values (1,6);
insert into vende values (1,9);
insert into vende values (1,14);
insert into vende values (1,15);
insert into vende values (2,6);
insert into vende values (2,7);
insert into vende values (2,14);
insert into vende values (2,15);
insert into vende values (3,9);
insert into vende values (3,10);
insert into vende values (3,11);
insert into vende values (3,12);
insert into vende values (3,13);
insert into vende values (4,1);
insert into vende values (4,2);
insert into vende values (4,3);
insert into vende values (4,4);
insert into vende values (4,15);
insert into vende values (6,6);
insert into vende values (6,15);
insert into vende values (7,6);
insert into vende values (7,15);
insert into vende values (8,6);
insert into vende values (8,15);
insert into vende values (9,6);
insert into vende values (9,14);
insert into vende values (9,15);
insert into vende values (10,6);
insert into vende values (10,9);
insert into vende values (10,10);
insert into vende values (10,11);
insert into vende values (10,12);
insert into vende values (10,13);
insert into vende values (10,14);
insert into vende values (10,15);

/*
SELECT F.nombrefs,B.nombrebeb 
FROM fuente_soda F, bebida B, vende V 
WHERE (V.codfs = F.codfs) AND (V.codbeb = B.codbeb);
  nombrefs   |    nombrebeb    
-------------+-----------------
 Amper       | Refresco
 Amper       | Jugo de naranja
 Amper       | Cafe
 Amper       | Agua
 Acuario     | Refresco
 Acuario     | Toddy
 Acuario     | Cafe
 Acuario     | Agua
 Estudiantes | Jugo de naranja
 Estudiantes | Jugo de manzana
 Estudiantes | Jugo de lechoza
 Estudiantes | Jugo de guayaba
 Estudiantes | Jugo de fresa
 MYS         | Cerveza
 MYS         | Vino
 MYS         | Ron
 MYS         | Whisky
 MYS         | Agua
 SalaCompu   | Refresco
 SalaCompu   | Agua
 SalaMate    | Refresco
 SalaMate    | Agua
 SalaMeca    | Refresco
 SalaMeca    | Agua
 Subway      | Refresco
 Subway      | Cafe
 Subway      | Agua
 CasaProf    | Refresco
 CasaProf    | Jugo de naranja
 CasaProf    | Jugo de manzana
 CasaProf    | Jugo de lechoza
 CasaProf    | Jugo de guayaba
 CasaProf    | Jugo de fresa
 CasaProf    | Cafe
 CasaProf    | Agua
(35 rows)


*/





