import java.sql.*;
public class MYSQL_Connection {
    public static void main(String[] args) throws SQLException{
        try {
            Connection conn = DriverManager.getConnection("jdc:mysql://localhost:3306/reg", "root", "");

            Statement state = conn.createStatement();
            state.execute("insert into student(name, dept)" + "values ('Sayem','CSE')");

            System.out.println("Data inserted successfully");

            System.out.println("Query results: ");
            ResultSet qry = state.executeQuery("state * from student");
            while (qry.next()) {
                System.out.println(qry.getString("name") + " " + qry.getString("dept"));
            }
            conn.close();
        }
        catch(SQLException e){
            System.out.println("Error "+e);
        }
    }
}
