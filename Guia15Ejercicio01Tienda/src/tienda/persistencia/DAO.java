/*
DAO = Data Acces Object
 */
package tienda.persistencia;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public abstract class DAO {
    
    protected Connection conexion = null;
    protected ResultSet resultado = null;
    protected Statement sentencia = null;
    
    private final String USER ="root";
    private final String PASSWORD = "root";
    private final String DATABASE = "tienda";
    private final String DRIVER = "com.mysql.jdbc.Driver";
    
    protected void conectarBase() throws ClassNotFoundException, SQLException{
        
        try {
            Class.forName(DRIVER);
            String urlBaseDeDatos = "jdbc:mysql://localhost:3306/" + DATABASE + "?useSSL=false" ;
            conexion = DriverManager.getConnection( urlBaseDeDatos , USER , PASSWORD) ;
            
            
        } catch (ClassNotFoundException | SQLException ex) {
            throw ex;
        }
    }

    protected void desconectarBase() throws Exception{  
        try {
            if (resultado != null) {
                resultado.close();
            }
            
            if (sentencia != null) {
                sentencia.close();
            }
            
            if (conexion != null) {
                conexion.close();
            }
            
        } catch (Exception e) {
            throw e;
        }
    }

    
    protected void insertarModificarEliminar(String sql) throws Exception{
        
        try {
            conectarBase();
            sentencia = conexion.createStatement();
            sentencia.executeUpdate(sql);
            
        } catch (ClassNotFoundException | SQLException ex) {
            
            // conexion.rollback();
            
            /* 
                Desconectar la linea anterior si desean tener en cuenta el rollback.
                Correr el siguiente script en Workbench
            
            SET autocommit = 1;
            COMMIT;
            
            
            sirve por si sale un error al manipular al base de datos, vuelva para atras para no alterar ningun dato.
            */
            
            throw ex;

        }finally{
            desconectarBase();
        }
    }

    protected void consultarBase(String sql) throws Exception {
        try {
            conectarBase();
            sentencia = conexion.createStatement();
            resultado = sentencia.executeQuery(sql);
            
        } catch (Exception e) {
            throw e;
        }
    } 
}
