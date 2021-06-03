package com.sarkarSiddhant.developer;

import java.sql.*;

public class Main {

    public static final String pathName="jdbc:sqlite:B:\\JAVA\\TestDB\\";
    public static final String fileName="Test.db";
    public static final String tableName="contacts";
    public static final String COLUMN_NAME="name";
    public static final String COLUMN_PHONE="Phone";
    public static final String COLUMN_EMAIL="Email";

    public static void main(String[] args) {
	try(Connection conn = DriverManager.getConnection(pathName+fileName);
        Statement statement= conn.createStatement()){
	    statement.execute("DROP TABLE IF EXISTS "+tableName);
	    //sqlite comand to create a table
        statement.execute("CREATE TABLE IF NOT EXISTS "+tableName+
                "("+
                COLUMN_NAME+" TEXT,"+
                COLUMN_PHONE+" INTEGER,"
                +COLUMN_EMAIL+" TEXT"+
                ")");
        //sqlite command to insert  into the table
        statement.execute("INSERT INTO "+tableName+
                " ("+
                COLUMN_NAME+","+
                COLUMN_PHONE+","
                +COLUMN_EMAIL+
                ")" +
                "VALUES('siddhant',741852963,'siddhant.sarkar');"
        );

        addContact(statement,"Joe Biden",741963,"joe.biden@america.com");
        //code to print each and every entry in the database
        ResultSet results= statement.executeQuery("SELECT * FROM "+tableName);
        while(results.next()){
            System.out.println(results.getString(COLUMN_NAME)+"  "+
                    results.getString(COLUMN_PHONE)+
                    "  "+results.getString(COLUMN_EMAIL));
        }
    }catch(SQLException e){
        System.out.println(e.getMessage());
        e.printStackTrace();
    }
    }
    public static void addContact(Statement statement,String name,int integer,String email) throws SQLException{
        statement.execute("INSERT INTO "+tableName+
                " ("+
                COLUMN_NAME+","+
                COLUMN_PHONE+","
                +COLUMN_EMAIL+
                ")" +
                " VALUES('"+name+"',"+integer+",'"+email+"');"
        );
    }
}
