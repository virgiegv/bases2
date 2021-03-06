import com.sparsity.sparksee.gdb.*;
import java.util.Dictionary;
import java.util.Hashtable;

public class BebedoresYBebidas
{
public static void main(String argv[])
throws java.io.IOException , java.lang.Exception
{
SparkseeConfig cfg = new SparkseeConfig();
cfg.setCacheMaxSize(2048); // 2 GB
cfg.setLogFile("BebedoresYBebidas.log");
//...
Sparksee sparksee = new Sparksee(cfg);
Database db = sparksee.create("BebedoresYBebidas.gdb", "BebedoresYBebidas");
Session sess = db.newSession();
Graph g = sess.getGraph();
// Use 'g' to perform operations on the graph database

//********************NODOS**********************

//Añadir tipo nodo para Fuente_Soda
int fuenteSodaType = g.newNodeType("FUENTE DE SODA");
int codFSType = g.newAttribute(fuenteSodaType , "CodFS", DataType.Long, AttributeKind.
Unique);
int nombreFSType = g.newAttribute(fuenteSodaType , "NombreFS", DataType.String,
AttributeKind.Indexed);

//Añadir tipo nodo para Bebida
int bebidaType = g.newNodeType("BEBIDA");
int codBebType = g.newAttribute(bebidaType , "CodBeb", DataType.Long, AttributeKind.
Unique);
int nombreBebType = g.newAttribute(bebidaType , "NombreBeb", DataType.String,
AttributeKind.Indexed);

//Añadir tipo nodo para Bebedor
int bebedorType = g.newNodeType("BEBEDOR");
int CIType = g.newAttribute(bebedorType , "CI", DataType.Long, AttributeKind.
Unique);
int nombreType = g.newAttribute(bebedorType , "Nombre", DataType.String,
AttributeKind.Indexed);

//******************ARISTAS**********************

//Añadir un tipo arista para Gusta
int gustaType = g.newRestrictedEdgeType("LE GUSTA", bebedorType , bebidaType , false);
//Añadir un tipo arista para Vende
int vendeType = g.newRestrictedEdgeType("VENDE", fuenteSodaType , bebidaType , false);
int precioVentaType = g.newAttribute(vendeType , "PRECIO", DataType.Integer,
AttributeKind.Indexed);
//Añadir un tipo arista para Frecuenta
int frecuentaType = g.newRestrictedEdgeType("FRECUENTA", bebedorType , fuenteSodaType , false);

//******RELLENANDO LA BASE DE DATOS**************

Value value = new Value();

//Añadir nodos para Fuentes de Soda

long mAmper = g.newNode(fuenteSodaType);
g.setAttribute(mAmper , codFSType , value.setLong(1));
g.setAttribute(mAmper , nombreFSType , value.setString("Amper"));
long mAcuario = g.newNode(fuenteSodaType);
g.setAttribute(mAcuario , codFSType , value.setLong(2));
g.setAttribute(mAcuario , nombreFSType , value.setString("Acuario"));
long mEstudiantes = g.newNode(fuenteSodaType);
g.setAttribute(mEstudiantes , codFSType , value.setLong(3));
g.setAttribute(mEstudiantes , nombreFSType , value.setString("Estudiantes"));
long mMYS = g.newNode(fuenteSodaType);
g.setAttribute(mMYS , codFSType , value.setLong(4));
g.setAttribute(mMYS , nombreFSType , value.setString("MYS"));
long mElPunto = g.newNode(fuenteSodaType);
g.setAttribute(mElPunto , codFSType , value.setLong(5));
g.setAttribute(mElPunto , nombreFSType , value.setString("El Punto"));
long mSalaCompu = g.newNode(fuenteSodaType);
g.setAttribute(mSalaCompu , codFSType , value.setLong(6));
g.setAttribute(mSalaCompu , nombreFSType , value.setString("SalaCompu"));
long mSalaMate = g.newNode(fuenteSodaType);
g.setAttribute(mSalaMate , codFSType , value.setLong(7));
g.setAttribute(mSalaMate , nombreFSType , value.setString("SalaMate"));
long mSalaMeca = g.newNode(fuenteSodaType);
g.setAttribute(mSalaMeca , codFSType , value.setLong(8));
g.setAttribute(mSalaMeca , nombreFSType , value.setString("SalaMeca"));
long mSubway = g.newNode(fuenteSodaType);
g.setAttribute(mSubway , codFSType , value.setLong(9));
g.setAttribute(mSubway , nombreFSType , value.setString("Subway"));
long mCasaProf = g.newNode(fuenteSodaType);
g.setAttribute(mCasaProf , codFSType , value.setLong(10));
g.setAttribute(mCasaProf , nombreFSType , value.setString("CasaProf"));
long mLaMontana = g.newNode(fuenteSodaType);
g.setAttribute(mLaMontana , codFSType , value.setLong(11));
g.setAttribute(mLaMontana , nombreFSType , value.setString("La Montana"));
long mGuardabosques = g.newNode(fuenteSodaType);
g.setAttribute(mGuardabosques , codFSType , value.setLong(12));
g.setAttribute(mGuardabosques , nombreFSType , value.setString("Guardabosques"));



//Añadir nodos para Bebidas

long mCerveza = g.newNode(bebidaType);
g.setAttribute(mCerveza , codBebType , value.setLong(1));
g.setAttribute(mCerveza , nombreBebType , value.setString("Cerveza"));
long mVino = g.newNode(bebidaType);
g.setAttribute(mVino , codBebType , value.setLong(2));
g.setAttribute(mVino , nombreBebType , value.setString("Vino"));
long mRon = g.newNode(bebidaType);
g.setAttribute(mRon , codBebType , value.setLong(3));
g.setAttribute(mRon , nombreBebType , value.setString("Ron"));
long mWhisky = g.newNode(bebidaType);
g.setAttribute(mWhisky , codBebType , value.setLong(4));
g.setAttribute(mWhisky , nombreBebType , value.setString("Whisky"));
long mVodka = g.newNode(bebidaType);
g.setAttribute(mVodka , codBebType , value.setLong(5));
g.setAttribute(mVodka , nombreBebType , value.setString("Vodka"));
long mRefresco = g.newNode(bebidaType);
g.setAttribute(mRefresco , codBebType , value.setLong(6));
g.setAttribute(mRefresco , nombreBebType , value.setString("Refresco"));
long mToddy = g.newNode(bebidaType);
g.setAttribute(mToddy , codBebType , value.setLong(7));
g.setAttribute(mToddy , nombreBebType , value.setString("Toddy"));
long mTe = g.newNode(bebidaType);
g.setAttribute(mTe , codBebType , value.setLong(8));
g.setAttribute(mTe , nombreBebType , value.setString("Te"));
long mJugoNaranja = g.newNode(bebidaType);
g.setAttribute(mJugoNaranja , codBebType , value.setLong(9));
g.setAttribute(mJugoNaranja , nombreBebType , value.setString("Jugo de Naranja"));
long mJugoManzana = g.newNode(bebidaType);
g.setAttribute(mJugoManzana , codBebType , value.setLong(10));
g.setAttribute(mJugoManzana , nombreBebType , value.setString("Jugo de Manzana"));
long mJugoLechoza = g.newNode(bebidaType);
g.setAttribute(mJugoLechoza , codBebType , value.setLong(11));
g.setAttribute(mJugoLechoza , nombreBebType , value.setString("Jugo de Lechoza"));
long mJugoGuayaba = g.newNode(bebidaType);
g.setAttribute(mJugoGuayaba , codBebType , value.setLong(12));
g.setAttribute(mJugoGuayaba , nombreBebType , value.setString("Jugo de Guayaba"));
long mJugoFresa = g.newNode(bebidaType);
g.setAttribute(mJugoFresa , codBebType , value.setLong(13));
g.setAttribute(mJugoFresa , nombreBebType , value.setString("Jugo de Fresa"));
long mCafe = g.newNode(bebidaType);
g.setAttribute(mCafe , codBebType , value.setLong(14));
g.setAttribute(mCafe , nombreBebType , value.setString("Cafe"));
long mAgua = g.newNode(bebidaType);
g.setAttribute(mAgua , codBebType , value.setLong(15));
g.setAttribute(mAgua , nombreBebType , value.setString("Agua"));
long mMalta = g.newNode(bebidaType);
g.setAttribute(mMalta , codBebType , value.setLong(16));
g.setAttribute(mMalta , nombreBebType , value.setString("Malta"));

//Añadir nodos para Bebedores

long mSergio = g.newNode(bebedorType);
g.setAttribute(mSergio , CIType , value.setLong(1));
g.setAttribute(mSergio , nombreType , value.setString("Sergio"));
long mVirginia = g.newNode(bebedorType);
g.setAttribute(mVirginia , CIType , value.setLong(2));
g.setAttribute(mVirginia , nombreType , value.setString("Virginia"));
long mLarry = g.newNode(bebedorType);
g.setAttribute(mLarry , CIType , value.setLong(3));
g.setAttribute(mLarry , nombreType , value.setString("Larry"));
long mJosue = g.newNode(bebedorType);
g.setAttribute(mJosue , CIType , value.setLong(4));
g.setAttribute(mJosue , nombreType , value.setString("Josue"));
long mMarlene = g.newNode(bebedorType);
g.setAttribute(mMarlene , CIType , value.setLong(5));
g.setAttribute(mMarlene , nombreType , value.setString("Marlene"));
long mMiguelTorrealba = g.newNode(bebedorType);
g.setAttribute(mMiguelTorrealba , CIType , value.setLong(6));
g.setAttribute(mMiguelTorrealba , nombreType , value.setString("Miguel Torrealba"));
long mCarolinaChang = g.newNode(bebedorType);
g.setAttribute(mCarolinaChang , CIType , value.setLong(7));
g.setAttribute(mCarolinaChang , nombreType , value.setString("Carolina Chang"));
long mRicardoMonascal = g.newNode(bebedorType);
g.setAttribute(mRicardoMonascal , CIType , value.setLong(8));
g.setAttribute(mRicardoMonascal , nombreType , value.setString("Ricardo Monascal"));
long mVicenteYriarte = g.newNode(bebedorType);
g.setAttribute(mVicenteYriarte , CIType , value.setLong(9));
g.setAttribute(mVicenteYriarte , nombreType , value.setString("Vicente Yriarte"));
long mEnriquePlanchart = g.newNode(bebedorType);
g.setAttribute(mEnriquePlanchart , CIType , value.setLong(10));
g.setAttribute(mEnriquePlanchart , nombreType , value.setString("EnriquePlanchart"));
long mLuisPerez = g.newNode(bebedorType);
g.setAttribute(mLuisPerez , CIType , value.setLong(11));
g.setAttribute(mLuisPerez , nombreType , value.setString("Luis Perez"));


long anEdge;
//Añadir aristas para Gusta
//int gustaType = g.newRestrictedEdgeType("LE GUSTA", bebedorType , bebidaType , false);
anEdge = g.newEdge(gustaType , mSergio , mVino);
anEdge = g.newEdge(gustaType , mSergio , mRon);
anEdge = g.newEdge(gustaType , mSergio , mRefresco);
anEdge = g.newEdge(gustaType , mVirginia , mCerveza);
anEdge = g.newEdge(gustaType , mVirginia , mTe);
anEdge = g.newEdge(gustaType , mVirginia , mJugoManzana);
anEdge = g.newEdge(gustaType , mLarry , mCerveza);
anEdge = g.newEdge(gustaType , mJosue , mRefresco);
anEdge = g.newEdge(gustaType , mJosue , mToddy);
anEdge = g.newEdge(gustaType , mMarlene , mAgua);
anEdge = g.newEdge(gustaType , mMarlene , mVino);
anEdge = g.newEdge(gustaType , mMiguelTorrealba , mRon);
anEdge = g.newEdge(gustaType , mMiguelTorrealba , mJugoNaranja);
anEdge = g.newEdge(gustaType , mMiguelTorrealba , mJugoManzana);
anEdge = g.newEdge(gustaType , mCarolinaChang , mCerveza);
anEdge = g.newEdge(gustaType , mCarolinaChang , mTe);
anEdge = g.newEdge(gustaType , mCarolinaChang , mJugoLechoza);
anEdge = g.newEdge(gustaType , mRicardoMonascal , mJugoLechoza);
anEdge = g.newEdge(gustaType , mRicardoMonascal , mJugoFresa);
anEdge = g.newEdge(gustaType , mRicardoMonascal , mCafe);
anEdge = g.newEdge(gustaType , mRicardoMonascal , mJugoGuayaba);
anEdge = g.newEdge(gustaType , mEnriquePlanchart , mAgua);
anEdge = g.newEdge(gustaType , mVicenteYriarte , mCafe);
anEdge = g.newEdge(gustaType , mVicenteYriarte , mAgua);
anEdge = g.newEdge(gustaType , mLuisPerez , mCerveza);
anEdge = g.newEdge(gustaType , mLuisPerez , mRefresco);
anEdge = g.newEdge(gustaType , mLuisPerez , mToddy);
anEdge = g.newEdge(gustaType , mLuisPerez , mJugoNaranja);

//Añadir aristas para Frecuenta
anEdge = g.newEdge(frecuentaType , mSergio , mAcuario);
anEdge = g.newEdge(frecuentaType , mSergio , mMYS);
anEdge = g.newEdge(frecuentaType , mSergio , mSalaCompu);
anEdge = g.newEdge(frecuentaType , mVirginia , mAmper);
anEdge = g.newEdge(frecuentaType , mVirginia , mEstudiantes);
anEdge = g.newEdge(frecuentaType , mVirginia , mElPunto);
anEdge = g.newEdge(frecuentaType , mLarry , mSalaMate);
anEdge = g.newEdge(frecuentaType , mLarry , mSubway);
anEdge = g.newEdge(frecuentaType , mJosue , mSalaMeca);
anEdge = g.newEdge(frecuentaType , mJosue , mCasaProf);
anEdge = g.newEdge(frecuentaType , mMarlene , mAmper);
anEdge = g.newEdge(frecuentaType , mMarlene , mAcuario);
anEdge = g.newEdge(frecuentaType , mMarlene , mMYS);
anEdge = g.newEdge(frecuentaType , mMarlene , mEstudiantes);
anEdge = g.newEdge(frecuentaType , mMarlene , mElPunto);
anEdge = g.newEdge(frecuentaType , mMiguelTorrealba , mSalaMeca);
anEdge = g.newEdge(frecuentaType , mMiguelTorrealba , mSalaMate);
anEdge = g.newEdge(frecuentaType , mMiguelTorrealba , mSalaCompu);
anEdge = g.newEdge(frecuentaType , mMiguelTorrealba , mSubway);
anEdge = g.newEdge(frecuentaType , mMiguelTorrealba , mCasaProf);
anEdge = g.newEdge(frecuentaType , mCarolinaChang , mCasaProf);
anEdge = g.newEdge(frecuentaType , mEnriquePlanchart , mLaMontana);
anEdge = g.newEdge(frecuentaType , mVicenteYriarte , mGuardabosques);
anEdge = g.newEdge(frecuentaType , mLuisPerez , mMYS);
anEdge = g.newEdge(frecuentaType , mLuisPerez , mEstudiantes);
anEdge = g.newEdge(frecuentaType , mLuisPerez , mAcuario);
anEdge = g.newEdge(frecuentaType , mLuisPerez , mAmper);
anEdge = g.newEdge(frecuentaType , mRicardoMonascal , mAcuario);

//Añadir aristas para Vende
anEdge = g.newEdge(vendeType , mAmper , mRefresco);
g.setAttribute(anEdge, precioVentaType , value.setInteger(3));
anEdge = g.newEdge(vendeType , mAmper , mJugoNaranja);
g.setAttribute(anEdge, precioVentaType , value.setInteger(4));
anEdge = g.newEdge(vendeType , mAmper , mCafe);
g.setAttribute(anEdge, precioVentaType , value.setInteger(15));
anEdge = g.newEdge(vendeType , mAmper , mAgua);
g.setAttribute(anEdge, precioVentaType , value.setInteger(10));
anEdge = g.newEdge(vendeType , mAcuario , mRefresco);
g.setAttribute(anEdge, precioVentaType , value.setInteger(7));
anEdge = g.newEdge(vendeType , mAcuario , mToddy);
g.setAttribute(anEdge, precioVentaType , value.setInteger(8));
anEdge = g.newEdge(vendeType , mAcuario , mCafe);
g.setAttribute(anEdge, precioVentaType , value.setInteger(9));
anEdge = g.newEdge(vendeType , mAcuario , mAgua);
g.setAttribute(anEdge, precioVentaType , value.setInteger(3));
anEdge = g.newEdge(vendeType , mEstudiantes , mJugoNaranja);
g.setAttribute(anEdge, precioVentaType , value.setInteger(18));
anEdge = g.newEdge(vendeType , mEstudiantes , mJugoManzana);
g.setAttribute(anEdge, precioVentaType , value.setInteger(8));
anEdge = g.newEdge(vendeType , mEstudiantes , mJugoLechoza);
g.setAttribute(anEdge, precioVentaType , value.setInteger(10));
anEdge = g.newEdge(vendeType , mEstudiantes , mJugoGuayaba);
g.setAttribute(anEdge, precioVentaType , value.setInteger(3));
anEdge = g.newEdge(vendeType , mEstudiantes , mJugoManzana);
g.setAttribute(anEdge, precioVentaType , value.setInteger(7));
anEdge = g.newEdge(vendeType , mMYS , mJugoNaranja);
g.setAttribute(anEdge, precioVentaType , value.setInteger(3));
anEdge = g.newEdge(vendeType , mMYS , mJugoFresa);
g.setAttribute(anEdge, precioVentaType , value.setInteger(1));
anEdge = g.newEdge(vendeType , mMYS , mJugoGuayaba);
g.setAttribute(anEdge, precioVentaType , value.setInteger(1));
anEdge = g.newEdge(vendeType , mMYS , mJugoLechoza);
g.setAttribute(anEdge, precioVentaType , value.setInteger(1));
anEdge = g.newEdge(vendeType , mMYS , mJugoFresa);
g.setAttribute(anEdge, precioVentaType , value.setInteger(3));
anEdge = g.newEdge(vendeType , mElPunto , mCerveza);
g.setAttribute(anEdge, precioVentaType , value.setInteger(2));
anEdge = g.newEdge(vendeType , mElPunto , mVino);
g.setAttribute(anEdge, precioVentaType , value.setInteger(4));
anEdge = g.newEdge(vendeType , mElPunto , mWhisky);
g.setAttribute(anEdge, precioVentaType , value.setInteger(4));
anEdge = g.newEdge(vendeType , mElPunto , mRon);
g.setAttribute(anEdge, precioVentaType , value.setInteger(4));
anEdge = g.newEdge(vendeType , mElPunto , mAgua);
g.setAttribute(anEdge, precioVentaType , value.setInteger(9));
anEdge = g.newEdge(vendeType , mSalaCompu , mRefresco);
g.setAttribute(anEdge, precioVentaType , value.setInteger(9));
anEdge = g.newEdge(vendeType , mSalaCompu , mAgua);
g.setAttribute(anEdge, precioVentaType , value.setInteger(9));
anEdge = g.newEdge(vendeType , mSalaMate , mRefresco);
g.setAttribute(anEdge, precioVentaType , value.setInteger(3));
anEdge = g.newEdge(vendeType , mSalaMate , mAgua);
g.setAttribute(anEdge, precioVentaType , value.setInteger(8));
anEdge = g.newEdge(vendeType , mSalaMeca , mRefresco);
g.setAttribute(anEdge, precioVentaType , value.setInteger(3));
anEdge = g.newEdge(vendeType , mSalaMeca , mAgua);
g.setAttribute(anEdge, precioVentaType , value.setInteger(7));
anEdge = g.newEdge(vendeType , mSubway , mAgua);
g.setAttribute(anEdge, precioVentaType , value.setInteger(12));
anEdge = g.newEdge(vendeType , mSubway , mRefresco);
g.setAttribute(anEdge, precioVentaType , value.setInteger(9));
anEdge = g.newEdge(vendeType , mSubway , mCafe);
g.setAttribute(anEdge, precioVentaType , value.setInteger(16));
anEdge = g.newEdge(vendeType , mCasaProf , mRefresco);
g.setAttribute(anEdge, precioVentaType , value.setInteger(8));
anEdge = g.newEdge(vendeType , mCasaProf , mJugoNaranja);
g.setAttribute(anEdge, precioVentaType , value.setInteger(1));
anEdge = g.newEdge(vendeType , mCasaProf , mJugoManzana);
g.setAttribute(anEdge, precioVentaType , value.setInteger(6));
anEdge = g.newEdge(vendeType , mCasaProf , mJugoLechoza);
g.setAttribute(anEdge, precioVentaType , value.setInteger(10));
anEdge = g.newEdge(vendeType , mCasaProf , mJugoGuayaba);
g.setAttribute(anEdge, precioVentaType , value.setInteger(4));
anEdge = g.newEdge(vendeType , mCasaProf , mJugoFresa);
g.setAttribute(anEdge, precioVentaType , value.setInteger(6));
anEdge = g.newEdge(vendeType , mCasaProf , mCafe);
g.setAttribute(anEdge, precioVentaType , value.setInteger(11));
anEdge = g.newEdge(vendeType , mCasaProf , mAgua);
g.setAttribute(anEdge, precioVentaType , value.setInteger(15));
anEdge = g.newEdge(vendeType , mLaMontana , mAgua);
g.setAttribute(anEdge, precioVentaType , value.setInteger(0));
anEdge = g.newEdge(vendeType , mGuardabosques , mAgua);
g.setAttribute(anEdge, precioVentaType , value.setInteger(9));
anEdge = g.newEdge(vendeType , mGuardabosques , mCafe);
g.setAttribute(anEdge, precioVentaType , value.setInteger(8));


/*****************************CONSULTAS DE LA PARTE 1******************************/


/**************CONSULTA #13***************/
/* Personas que van a lugares en los que */ 
/*    solo sirven lo que les gusta       */
/*****************************************/

System.out.println("Personas que solo van a lugares donde solo sirven lo que les gusta");

//Todos los bebedores
Objects bebedores = g.select(bebedorType);

ObjectsIterator it = bebedores.iterator();
Objects respuesta = sess.newObjects();
while(it.hasNext())
{
    long bebActual = it.next();

//Bebidas gustan a persona
    Objects bebidasGustan = g.neighbors(bebActual, gustaType, EdgesDirection.Outgoing);

//Bebidas
    Objects bebidas = g.select(bebidaType);

//Bebidas no gustan a persona

    bebidas.difference(bebidasGustan);
    bebidasGustan.close();

//Fuentes visita persona
    Objects fuentesVisitadas = g.neighbors(bebActual, frecuentaType, EdgesDirection.Outgoing);

//Bebidas servidas fuentes visitadas
    Objects BebFuentesVisitadas = g.neighbors(fuentesVisitadas, vendeType, EdgesDirection.Outgoing);
    fuentesVisitadas.close();

//Bebidas que no gustan servidas en fuentes visitadas

    BebFuentesVisitadas.intersection(bebidas);
    bebidas.close();
    g.getAttribute(bebActual , nombreType , value);
    if (BebFuentesVisitadas.count() > 0){
        System.out.print("");
        //value.getString()+" visita a fuentes que sirven bebidas que no gustan\n");
    }
    else{
        respuesta.add(bebActual);
        System.out.print(value.getString()+" no visita a fuentes que sirven bebidas que no gustan\n");
    }
    BebFuentesVisitadas.close();
}

long aahia = respuesta.count();
//System.out.format("La query devuelve una lista con %d objetos\n", aahia);

System.out.println("\n");

respuesta.close();
it.close();


/**************CONSULTA #16***************/
/*    Bebedores que frecuentan sitios    */ 
/*   que vendan todas las bebidas que    */
/*               les gusten              */  
/*****************************************/

Objects respuesta2 = sess.newObjects();
//for each bebedor
ObjectsIterator it1 = bebedores.iterator();
while(it1.hasNext()){
    long bebActual1 = it1.next();
    //todas las bebibas que le gustan al bebActual1
    Objects bebsGustanaActual1 = g.neighbors(bebActual1, gustaType, EdgesDirection.Outgoing);
    boolean gustasitios = true;
    //todos los sitios que bebActual1 frecuenta
    Objects visitaBebActual = g.neighbors(bebActual1, frecuentaType, EdgesDirection.Outgoing);
    ObjectsIterator it2 = visitaBebActual.iterator();
//  for each sitio que frecuenta
    while(it2.hasNext()){
        long sitioActual1 = it2.next();
//      Todas las bebidas que vende sitioActual
        Objects vendeSitioActual = g.neighbors(sitioActual1, vendeType, EdgesDirection.Outgoing);
//      ver que la interseccion de vendeSitioActual y bebsGustanaActual es igual a bebsGustanaActual
        Objects intersec = Objects. combineIntersection (vendeSitioActual , bebsGustanaActual1);
        if(!intersec.equals(bebsGustanaActual1)){
            gustasitios = false;
        }
        vendeSitioActual.close();
        intersec.close();
    }
    if (gustasitios==true){
        respuesta2.add(bebActual1);
    }
    visitaBebActual.close();
    bebsGustanaActual1.close();
    it2.close();
}

ObjectsIterator it3 = respuesta2.iterator();
System.out.println("Bebedores que frecuentan sitios que vendan todas las bebidas que les gusten:");
while (it3.hasNext())
{
    long bebid = it3.next();
    g.getAttribute(bebid , nombreType , value);
    System.out.println(value.getString());
}
System.out.println("\n");
// The ObjectsIterator must be closed
it3.close();
it1.close();
respuesta2.close();
bebedores.close();

/**************CONSULTA #25***************/
/*  las bebidas que se venden en alguna  */ 
/*   fuente de sodas pero que a nadie    */
/*                les gusta              */  
/*****************************************/

System.out.println("Bebidas que se venden en alguna fuente de soda pero que no le gustan a nadie");

//Bebidas que se venden en alguna fuente pero no le gustan a nadie
//bebidas que no le gustan a nadie
//bebidas
Objects bebidas = g.select(bebidaType);
//personas
bebedores = g.select(bebedorType);
//bebidas que gustan a alguien
Objects bebidasGustan = g.neighbors(bebedores, gustaType, EdgesDirection.Outgoing);
bebidas.difference(bebidasGustan);
bebedores.close();
bebidasGustan.close();

//bebidas que son vendidas
//fuentes de soda
Objects fuentes = g.select(fuenteSodaType);
//bebidas vendidas 
respuesta = g.neighbors(fuentes, vendeType, EdgesDirection.Outgoing);
fuentes.close();
//respuesta
respuesta.intersection(bebidas);
bebidas.close();
it = respuesta.iterator();
while (it.hasNext())
{
    long bebidaid = it.next();
    g.getAttribute(bebidaid , nombreBebType , value);
    System.out.println("No gustan y se vende: " + value.getString());
}

System.out.println("\n");

respuesta.close();

/**************CONSULTA #30***************/
/*  Bebidas mas servidas en los lugares  */ 
/*      frecuentados por Luis Perez      */ 
/*****************************************/

Dictionary<Long, Integer> BebidasVendidas = new Hashtable<Long, Integer>(); 

Objects fuentesVisitadas = g.neighbors(mLuisPerez, frecuentaType, EdgesDirection.Outgoing);
it = fuentesVisitadas.iterator();

while (it.hasNext())
{
    long fuenteID = it.next();
    Objects ventas = g.neighbors(fuenteID, vendeType, EdgesDirection.Outgoing);
    ObjectsIterator it2 = ventas.iterator();
    while (it2.hasNext())
    {
        long BebidaID = it2.next();
        if (BebidasVendidas.get(BebidaID) == null){
            BebidasVendidas.put(BebidaID,1);
        }
        else{
            int numAnterior = BebidasVendidas.get(BebidaID);
            BebidasVendidas.put(BebidaID, numAnterior + 1);    
        }
    }
    it2.close();
    ventas.close();
}
fuentesVisitadas.close();
it.close();
bebidas = g.select(bebidaType);
it = bebidas.iterator();
Objects bebidaMasVendida = sess.newObjects();
int numAnterior = 0;
while (it.hasNext())
{
    long bebida = it.next();
    if (BebidasVendidas.get(bebida) != null)
    {
        if (BebidasVendidas.get(bebida) > numAnterior){
            numAnterior = BebidasVendidas.get(bebida);
            bebidaMasVendida.clear();
            bebidaMasVendida.add(bebida);
        }         
        else if(BebidasVendidas.get(bebida) == numAnterior){
            bebidaMasVendida.add(bebida);
        }
    }
}
bebidas.close();
it.close();
it = bebidaMasVendida.iterator();
System.out.format("las bebidas mas vendidas en los lugares que frecuenta Luis Perez son:\n");
while (it.hasNext())
{
    long bebida = it.next();
    g.getAttribute(bebida , nombreBebType , value);
    System.out.format("%s \n", value);
}
System.out.println("\n");
bebidaMasVendida.close();
it.close();



/**************CONSULTA #40***************/
/*   Promedio de las bebidas que no le   */ 
/*         gustan a Luis Perez           */
/*****************************************/

System.out.println("Promedio de bebidas que no le gustan a Luis Perez");

//Todas las bebidas
Objects bebidas5 = g.select(bebidaType);

//Bebidas que le gustan a Luis Perez
Objects bebLuisP = g.neighbors(mLuisPerez, gustaType, EdgesDirection.Outgoing);

//Bebidas que no le gustan a Luis Perez
Objects intersec = Objects. combineIntersection (bebidas5 , bebLuisP);
long numbebs = intersec.count();
//Para cada bebida tengo que encontrar todos los edges de ventas que lo vendan
//Y luego tomar el atributo precio de esas ventas
ObjectsIterator it5 = intersec.iterator();
long sumatotal = 0;
while(it5.hasNext())
{
    long bebidaActual = it5.next();
    g.getAttribute(bebidaActual , nombreBebType , value);
    System.out.print(value+": ");
    long suma = 0;
    Objects edges = g.explode(bebidaActual , vendeType , EdgesDirection.Ingoing);
    long numedges = edges.count();
    ObjectsIterator it6 = edges.iterator();
    while(it6.hasNext()){
        long edgeActual = it6.next();
        g.getAttribute(edgeActual , precioVentaType , value);
        int num = value.getInteger();
        suma = suma + num;
    }
    suma = suma / numedges;
    System.out.print(suma+"\n");
    sumatotal = sumatotal + suma;
    edges.close();
    it6.close();
}
sumatotal = sumatotal / numbebs;
System.out.println("Promedio total: "+sumatotal+"\n");

bebidas5.close();
bebLuisP.close();
intersec.close();
it5.close();

/***************************CONSULTAS DE LA PARTE 2***************************/

System.out.println("Parte 2: Consultas extra");

/**************CONSULTA #1****************/
/*   Listar las bebidas en orden de más  */ 
/*          a menos "gustadas"           */
/*****************************************/

System.out.println("Lista de bebidas en orden ascendente de popularidad (gustar)");

//Todas las bebidas
Objects bebidas6 = g.select(bebidaType);
//int len = bebidas6.count().getInteger;
Integer len = (int) (long) bebidas6.count();
ObjectsIterator it7 = bebidas6.iterator();
long[] arrayBebs;
arrayBebs = new long[len];
int[] arrayValores = new int[len];
int iterador = 0;
while(it7.hasNext())
{
    long bebActual = it7.next();
    //Obtener todas las aristas de "gustar" que entran a la bebida
    Objects es_gustada = g.neighbors(bebActual, gustaType, EdgesDirection.Ingoing);
    //int num_gusta = es_gustada.count();
    Integer num_gusta = (int) (long) es_gustada.count();
    arrayBebs[iterador] = bebActual;
    arrayValores[iterador] = num_gusta;
    iterador = iterador + 1;
    es_gustada.close();
}

int temp;
long temp2;
for (int i = 1; i < arrayValores.length; i++) {
    for(int j = i ; j > 0 ; j--){
        if(arrayValores[j] > arrayValores[j-1]){
            temp = arrayValores[j];
            temp2 = arrayBebs[j];
            arrayValores[j] = arrayValores[j-1];
            arrayBebs[j] = arrayBebs[j-1];
            arrayValores[j-1] = temp;
            arrayBebs[j-1] = temp2;
        }
    }
}
 

for (int i = 0; i < arrayValores.length; i++) {
    long coso = arrayBebs[i];
    g.getAttribute(coso,nombreBebType,value);
    System.out.println(value+" le gusta a "+arrayValores[i]+" personas.");
}

System.out.println("");
bebidas6.close();
it7.close();
//Por cada bebida: 
    //Calcular cuantos nodos de "Gustar" entran a la bebida
    
/**************CONSULTA #2****************/
/*   Listar las personas que gustan de   */
/* mas bebidas a menos bebidas           */
/*****************************************/

System.out.println("Personas a las que le gustan mas bebidas en orden");

//Todas las bebidas
Objects personas = g.select(bebedorType);
Integer len2 = (int) (long) personas.count();
ObjectsIterator it8 = personas.iterator();
long[] arrayPers;
arrayPers = new long[len2];
int[] arrayValores2 = new int[len2];
int iterador2 = 0;
while(it8.hasNext())
{
    long bebedorActual = it8.next();
    Objects gusta = g.neighbors(bebedorActual, gustaType, EdgesDirection.Outgoing);
    Integer num_gusta = (int) (long) gusta.count();
    arrayPers[iterador2] = bebedorActual;
    arrayValores2[iterador2] = num_gusta;
    iterador2 = iterador2 + 1;
    gusta.close();
}

int temp3;
long temp4;
for (int i = 1; i < arrayValores2.length; i++) {
    for(int j = i ; j > 0 ; j--){
        if(arrayValores2[j] > arrayValores2[j-1]){
            temp3 = arrayValores2[j];
            temp4 = arrayPers[j];
            arrayValores2[j] = arrayValores2[j-1];
            arrayPers[j] = arrayPers[j-1];
            arrayValores2[j-1] = temp3;
            arrayPers[j-1] = temp4;
        }
    }
}
 

for (int i = 0; i < arrayValores2.length; i++) {
    long coso = arrayPers[i];
    g.getAttribute(coso,nombreType,value);
    System.out.println("a "+value+" le gustan "+arrayValores2[i]+" bebidas.");
}

System.out.println("");
personas.close();
it8.close();


/**************CONSULTA #3*****************/
/*   Bebedores que no les gusta la malta  */ 
/******************************************/


//Todos los bebedores
Objects bebedor1 = g.select(bebedorType);
ObjectsIterator it9 = bebedor1.iterator();

//Bebedores que les gusta la malta
Objects bebeMalta = g.neighbors(mMalta, gustaType, EdgesDirection.Ingoing);

//Bebedores que no les gusta la malta
Objects respuestaMalta = Objects. combineDifference (bebedor1,bebeMalta );

System.out.println("Bebedores que no les gusta la malta: \n");
it8 = respuestaMalta.iterator();
while (it9.hasNext())
{
    long bebedorid = it9.next();
    g.getAttribute(bebedorid , nombreType , value);
    System.out.println("A bebedor :" + value.getString());
}
System.out.println("");
bebedor1.close();
bebeMalta.close();
respuestaMalta.close();
it9.close();


/**************************CERRANDO LA BASE DE DATOS**************************/

sess.close();
db.close();
sparksee.close();
}
}
