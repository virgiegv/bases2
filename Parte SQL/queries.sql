/*Numero trece (13)>*/

/* los bebedores que frecuentan sitios con bebidads que les gustan,
y no frecuentan sitios que vendan alguna bebida que no les guste*/


SELECT DISTINCT Be.cedula,Be.nombre
FROM fuente_soda F, bebida B, vende V, bebedor Be, gusta G, frecuenta Fr
WHERE (V.codfs = F.codfs) AND (V.codbeb = B.codbeb) AND 
      (G.codbeb = B.codbeb) AND (G.cedula = Be.cedula) AND 
      (Fr.cedula = Be.cedula) AND (Fr.codfs = F.codfs) 
EXCEPT (
  
  SELECT DISTINCT Be.cedula,Be.nombre
  FROM fuente_soda F, bebida B, vende V, bebedor Be, gusta G, frecuenta Fr
  WHERE (V.codfs = F.codfs) AND (V.codbeb = B.codbeb) AND 
    (Fr.cedula = Be.cedula) AND (Fr.codfs = F.codfs) AND
    (G.cedula = Be.cedula) AND (G.codbeb != B.codbeb) AND
    
    NOT( B.codbeb IN (SELECT DISTINCT B.codbeb
      FROM fuente_soda F, bebida B, vende V, bebedor Be, gusta G, frecuenta Fr
      WHERE (V.codfs = F.codfs) AND (V.codbeb = B.codbeb) AND 
    (Fr.cedula = Be.cedula) AND (Fr.codfs = F.codfs) AND
    (G.cedula = Be.cedula) AND (G.codbeb = B.codbeb) ))
    ); 

/*A Planchart solo le gusta el agua y solo va a un sitio donde venden agua.
A Yriarte le gusta el cafe, el agua y el refresco y solo va a un sitio donde solo venden 
agua y cafe.*/


/*Numero diesciseis (16)>*/

/* los bebedores que frecuentan sitios que vendan todas las bebidas que les gusten*/

SELECT DISTINCT Be.cedula,Be.nombre
FROM fuente_soda F, bebida B, vende V, bebedor Be, gusta G, frecuenta Fr
WHERE (V.codfs = F.codfs) AND (V.codbeb = B.codbeb) AND 
      (G.codbeb = B.codbeb) AND (G.cedula = Be.cedula) AND 
      (Fr.cedula = Be.cedula) AND (Fr.codfs = F.codfs) 
EXCEPT (
  
  SELECT DISTINCT Be.cedula,Be.nombre
  FROM fuente_soda F, bebida B, vende V, bebedor Be, gusta G, frecuenta Fr
  WHERE (V.codfs = F.codfs) AND (V.codbeb != B.codbeb) AND 
    (Fr.cedula = Be.cedula) AND (Fr.codfs = F.codfs) AND
    (G.cedula = Be.cedula) AND (G.codbeb = B.codbeb) 
  );


/*A Planchart solo le gusta el agua y solo va a un sitio donde venden exclusivamente agua*/



/*Numero vencitinco (25)>*/

/* las bebidas que se venden en alguna fuente de sodas pero que a nadie les gusta*/

SELECT DISTINCT B.codbeb, B.nombrebeb
FROM fuente_soda F, bebida B, vende V, bebedor Be, gusta G, frecuenta Fr
WHERE (V.codfs = F.codfs) AND (V.codbeb = B.codbeb) AND  
      NOT( B.codbeb IN (SELECT DISTINCT B.codbeb
      FROM fuente_soda F, bebida B, vende V, bebedor Be, gusta G, frecuenta Fr
      WHERE (V.codfs = F.codfs) AND (V.codbeb = B.codbeb) AND 
      (G.cedula = Be.cedula) AND (G.codbeb = B.codbeb) ));


/*El whisky se vende pero a nadie le gusta. El vodka no aparece porque no le gusta a
nadie pero no se vende*/



/*numero treinta (30)>*/

/*Bebidas mas servidas en los lugares frecuentados por Luis Perez*/
/*asumo que esto es un order by apariciones en los locales*/

SELECT DISTINCT  B.nombrebeb, (count(V.codbeb)/
                              (SELECT DISTINCT count(*) FROM fuente_soda))+1 AS sitios_de_venta
FROM fuente_soda F, bebida B, vende V, bebedor Be, frecuenta Fr
WHERE (V.codfs = F.codfs) AND (V.codbeb = B.codbeb) AND 
      (Fr.cedula = 11) AND (Fr.codfs = F.codfs) AND
    ( V.codbeb  IN (SELECT DISTINCT V.codbeb
    FROM fuente_soda F, bebida B, vende V, bebedor Be, frecuenta Fr
    WHERE (V.codfs = F.codfs) AND (V.codbeb = B.codbeb) AND 
    (Fr.cedula = 11) AND (Fr.codfs = F.codfs) ))
GROUP BY B.nombrebeb
ORDER BY rownumber DESC;


/*numero cuarenta (40)>*/

/*Promedio de las bebidas que no le gustan a Luis Perez*/


SELECT AVG (V.precio) as promedio_precios
FROM fuente_soda F, bebida B, vende V, bebedor Be, gusta G
WHERE (V.codfs = F.codfs) AND (V.codbeb = B.codbeb) AND 
      (G.codbeb = B.codbeb) AND (G.cedula = Be.cedula) AND
     
      NOT( V.precio IN (SELECT DISTINCT V.precio
      FROM fuente_soda F, bebida B, vende V, gusta G
      WHERE (V.codfs = F.codfs) AND (V.codbeb = B.codbeb) AND 
      (G.cedula = 11) AND (G.codbeb = B.codbeb) ))
    ; 
