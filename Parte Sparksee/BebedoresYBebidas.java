import com.sparsity.sparksee.gdb.*;
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
int nombreType = g.newAttribute(fuenteSodaType , "Nombre", DataType.String,
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
anEdge = g.newEdge(gustaType , mEnriquePlanchart , mAgua);
anEdge = g.newEdge(gustaType , mVicenteYriarte , mCafe);
anEdge = g.newEdge(gustaType , mVicenteYriarte , mAgua);

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
anEdge = g.newEdge(vendeType , mEstudiantes , mJugoFresa);
g.setAttribute(anEdge, precioVentaType , value.setInteger(7));
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


//QUERIES POR HACER

//Bebidas que le gustan a Marlene
Objects gustanMarlene = g.neighbors(mMarlene, gustaType, EdgesDirection.Outgoing);


/*
// Get the movies directed by Woody Allen
Objects directedByWoody = g.neighbors(pWoody, directsType , EdgesDirection.Outgoing
);

// Get the cast of the movies directed by Woody Allen
Objects castDirectedByWoody = g.neighbors(directedByWoody , castType , EdgesDirection.Any);
// We don't need the directedByWoody collection anymore , so we should close it
directedByWoody.close();

// Get the movies directed by Sofia Coppola
Objects directedBySofia = g.neighbors(pSofia, directsType , EdgesDirection.Outgoing);
// Get the cast of the movies directed by Sofia Coppola
Objects castDirectedBySofia = g.neighbors(directedBySofia , castType , EdgesDirection.Any);
// We don't need the directedBySofia collection anymore , so we should close it
directedBySofia.close();
// We want to know the people that acted in movies directed by Woody AND in movies
//directed by Sofia.
Objects castFromBoth = Objects.combineIntersection(castDirectedByWoody , castDirectedBySofia);
// We don't need the other collections anymore
castDirectedByWoody.close();
castDirectedBySofia.close();
*/
// Say hello to the people found
ObjectsIterator it = gustanMarlene.iterator();
while (it.hasNext())
{
    long bebidaid = it.next();
    g.getAttribute(bebidaid , nombreBebType , value);
    System.out.println("Encontre " + value.getString());
}
// The ObjectsIterator must be closed
it.close();
// The Objects must be closed
gustanMarlene.close();


sess.close();
db.close();
sparksee.close();
}
}
