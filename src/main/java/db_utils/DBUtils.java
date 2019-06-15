package db_utils;

import com.mysql.cj.jdbc.MysqlDataSource;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Objects;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sql.*;

public class DBUtils {

/*    public static Connection getConnection( ) throws ClassNotFoundException, SQLException {
        Class.forName( "com.mysql.jdbc.Driver" );
        Connection con = DriverManager.getConnection( "jdbc:mysql://localhost:3306/db3", "root", "root" );
        return con;
    }*/

    /*
    * Custom template for connection
    */
    private static DataSource ds;
    final Logger LOGGER = Logger.getLogger(DBUtils.class.getName());

    DBUtils() throws SQLException {

        MysqlDataSource mysqlDataSource = new MysqlDataSource();
        String rootpath = Objects.requireNonNull(Thread.currentThread().getContextClassLoader().getResource("database.properties").getPath());
        final Logger LOGGER = Logger.getLogger(Connection.class.getName());

        try (InputStream inputStream = new FileInputStream(rootpath)) {

            Class.forName("com.mysql.jdbc.Driver");
            Properties properties = new Properties();
            properties.load(inputStream);
            mysqlDataSource.setDatabaseName(properties.getProperty("database"));
            mysqlDataSource.setServerName(properties.getProperty("serverName"));
            mysqlDataSource.setPort(Integer.parseInt(properties.getProperty("port")));
            mysqlDataSource.setUser(properties.getProperty("user"));
            mysqlDataSource.setPassword(properties.getProperty("password"));
            mysqlDataSource.setUseSSL(Boolean.parseBoolean(properties.getProperty("useSSL")));
            mysqlDataSource.setAutoReconnect(Boolean.parseBoolean(properties.getProperty("autoReconnect")));

        } catch (FileNotFoundException e) {
            LOGGER.log(Level.SEVERE, "File database.properties not found", e);
        } catch (IOException e) {
            LOGGER.log(Level.SEVERE, "IO ERROR", e);
        } catch (ClassNotFoundException e) {
            LOGGER.log(Level.SEVERE, "Class.forName have been thought error", e);
        }

        ds = mysqlDataSource;
    }

    public static Connection getConnection() throws SQLException {
        return ds.getConnection();
    }

/*    public static void main(String[] args) throws SQLException {
        new DBUtils();
        PreparedStatement ps = getConnection().prepareStatement("select * from db3.course");
        System.out.println(ps);
    }*/

}
